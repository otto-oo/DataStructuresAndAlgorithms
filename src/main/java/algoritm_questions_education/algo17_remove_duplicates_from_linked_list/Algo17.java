package main.java.algoritm_questions_education.algo17_remove_duplicates_from_linked_list;

import main.java.algoritm_questions_education.LinkedList.MyLinkedList;

public class Algo17 extends MyLinkedList {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addLast(1);
        myLinkedList.addLast(1);
        myLinkedList.addLast(3);
        myLinkedList.addLast(3);
        myLinkedList.addLast(4);
        myLinkedList.addLast(4);
        myLinkedList.addLast(4);
        myLinkedList.addLast(5);
        myLinkedList.addLast(6);
        myLinkedList.addLast(6);
        myLinkedList.addLast(7);
        myLinkedList.addLast(7);
        myLinkedList.printLinkedList();
        System.out.println("****************** after **************");
        removeDuplicatesFromLinkedList(myLinkedList);
        myLinkedList.printLinkedList();
    }

    public static MyLinkedList removeDuplicatesFromLinkedList(MyLinkedList myLinkedList){

        Node currentNode = myLinkedList.first;
        Node nextNode = currentNode.next;
        while(nextNode != null){                        // while next node is not null
            if(currentNode.value < nextNode.value){     // checking duplication and ascending sorting
                nextNode = nextNode.next;               // if true stepping next node
            }else {
                currentNode.next = nextNode.next;       // if false, passing by this node with pointing next of current node to the next node' next.
                nextNode = nextNode.next;
                continue;                               // for checking same current node with next of next node
            }
            currentNode = currentNode.next;
        }
        return myLinkedList;
    }
}
