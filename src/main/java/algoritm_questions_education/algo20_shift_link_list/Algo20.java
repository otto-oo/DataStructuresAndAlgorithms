package main.java.algoritm_questions_education.algo20_shift_link_list;

import main.java.algoritm_questions_education.LinkedList.MyLinkedList;

public class Algo20 {

    public static void main(String[] args) {

        MyLinkedList linkedList = new MyLinkedList();

        System.out.println("*****Before*****");
        linkedList.addLast(0);
        linkedList.addLast(1);
        linkedList.addLast(2);
        linkedList.addLast(3);
        linkedList.addLast(4);
        linkedList.addLast(5);
        linkedList.printLinkedList();

        int k = 2;
        System.out.println("*****After k is "+k+" *****");
        shift_link_list(linkedList, k).printLinkedList();
    }

    public static MyLinkedList shift_link_list(MyLinkedList linkedList, int k){

        if (Math.abs(k) >= linkedList.size || k==0){
            System.out.println("If k is bigger or equal to the size of linked list or 0 then linked list does not shifted.");
            return linkedList;
        }       // getting absolute number of k with Math.abs(k)

        if (k < 0){
            while (k < 0){                                      // backward
                linkedList.last.next = linkedList.first;        // organizing circular single linked list
                linkedList.first = linkedList.first.next;       // shifting head to next
                linkedList.last = linkedList.last.next;         // shifting tail to next
                k++;
            }
        }else{
            while (linkedList.size-k > 0){                      // forward
                linkedList.last.next = linkedList.first;        // organizing circular single linked list
                linkedList.first = linkedList.first.next;       // shifting head to next
                linkedList.last = linkedList.last.next;         // shifting tail to next
                k++;
            }
        }
        linkedList.last.next = null;                            // returning from circular to single linked list
        return linkedList;
    }
}