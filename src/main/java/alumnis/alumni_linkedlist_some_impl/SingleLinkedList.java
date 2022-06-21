package main.java.alumnis.alumni_linkedlist_some_impl;

public class SingleLinkedList {

    Node head;
    Node tail;
    //int size;                             // could be lots of attributes

    public void insertLast(int value){
        Node newNode = new Node(value);
        if (head == null && tail == null){  // if root is null
            head = tail = newNode;
        }else{                              // if root is NOT null
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void print(){
        Node currentNode = head;
        if (head == null){
            System.out.println("LinkedList is empty..");
        }
        while (currentNode != null){
            System.out.print(currentNode.value + " -> ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }

    public void deleteLast(){
        if(head == null && tail == null){       // if root is empty
            System.out.println("Linked list is already empty..");
            return;
        }
        if (head == tail){                      // if root has 1 node
            head = tail = null;
        }else{                                  // if root has more than 1 node
            Node currentNode = head;
            Node previousNode = head;
            while (currentNode.next != null){
                previousNode = currentNode;
                currentNode = currentNode.next;
            }
            previousNode.next = null;
            tail = previousNode;
        }
    }

    public void delete(int value){
        if(head==null && tail==null){
            System.out.println("Linked list is already empty");
            return;
        }
        Node current = head;
        Node previous = head;
        while(current != null){
            if(current.value == value){
                if(current == head){                // if current is head
                    head = current.next;
                    current.next = null;
                    if(current == tail){            // if current is also tail that means, root has 1 node
                        tail = null;
                    }
                }
                else if(current == tail){           // if current is tail, lastNode will be deleted
                    tail = previous;
                    previous.next = null;
                }else{                              // if deletedNode is middle of linked list
                    previous.next = current.next;
                    current.next = null;
                }
            }
            previous = current;
            current = current.next;
        }
    }
}
