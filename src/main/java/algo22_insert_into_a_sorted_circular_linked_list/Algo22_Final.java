package main.java.algo22_insert_into_a_sorted_circular_linked_list;

import main.java.LinkedList.Node;

public class Algo22_Final {

    public static void main(String[] args) {
        Node head = new Node(3);

        insertIntoASortedCircularLinkedList(head, 4);
        insertIntoASortedCircularLinkedList(head, 1);
        insertIntoASortedCircularLinkedList(head, 2);
        insertIntoASortedCircularLinkedList(head, 55);
        insertIntoASortedCircularLinkedList(head, 5);
        insertIntoASortedCircularLinkedList(head, -5);
        print(head);

    }

    public static Node insertIntoASortedCircularLinkedList(Node head, int insertVal){

        if (head == null) {
            Node newNode = new Node(insertVal, null);
            newNode.next = newNode;
            return newNode;
        }else if(head.next==null){
            Node newNode = new Node(insertVal, null);
            newNode.next = head;
            head.next = newNode;
            return head;
        }else{
            Node currentNode = head;
            Node insertionNode = new Node(insertVal);
            do{
                if (insertVal > currentNode.value && insertVal < currentNode.next.value){
                    insertionNode.next = currentNode.next;
                    currentNode.next = insertionNode;
                    break;
                }else if(insertVal < currentNode.value && insertVal < currentNode.next.value && currentNode.value > currentNode.next.value){
                    insertionNode.next = currentNode.next;
                    currentNode.next = insertionNode;
                    break;
                }else if (insertVal > currentNode.value && insertVal > currentNode.next.value && currentNode.value > currentNode.next.value){
                    insertionNode.next = currentNode.next;
                    currentNode.next = insertionNode;
                }
                currentNode = currentNode.next;
            }while(currentNode != head);
        }
        return head;
    }

    public static void print(Node head) {
        Node current = head;
        if (current == null) {
            System.out.println("[]");
            return;
        }
        while (current.next != head) {
            System.out.print(current.value + ", ");
            current = current.next;
        }
        System.out.println(current.value);
    }
}
