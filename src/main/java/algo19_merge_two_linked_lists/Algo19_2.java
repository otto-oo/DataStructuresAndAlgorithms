package main.java.algo19_merge_two_linked_lists;

import main.java.LinkedList.MyLinkedList;

public class Algo19_2 {

    public static void main(String[] args) {
        MyLinkedList linkedListOne = new MyLinkedList();
        MyLinkedList linkedListTwo = new MyLinkedList();

        linkedListOne.addLast(1);
        linkedListOne.addLast(2);
        linkedListOne.addLast(4);
        linkedListOne.printLinkedList();

        System.out.println("*******");
        linkedListTwo.addLast(1);
        linkedListTwo.addLast(3);
        linkedListTwo.addLast(4);
        linkedListTwo.printLinkedList();

        System.out.println("*******");

        mergeTwoLinkedLists(linkedListOne, linkedListTwo).printLinkedList();

    }

    public static MyLinkedList mergeTwoLinkedLists(MyLinkedList linkedListOne, MyLinkedList linkedListTwo){

        MyLinkedList resultList = new MyLinkedList();

        MyLinkedList.Node currentNodeOne = linkedListOne.first;
        MyLinkedList.Node currentNodeTwo = linkedListTwo.first;

        if(currentNodeOne==null){
            if(currentNodeTwo==null){
                throw new IllegalStateException();
            }else {
                while(currentNodeTwo!=null){
                    resultList.addLast(currentNodeTwo.value);
                    currentNodeTwo = currentNodeTwo.next;
                }
            }
        }else if(currentNodeTwo==null){
            while(currentNodeOne!=null){
                resultList.addLast(currentNodeOne.value);
                currentNodeOne = currentNodeOne.next;
            }
        }else {
            while(currentNodeOne != null || currentNodeTwo != null){
                if(currentNodeOne.value < currentNodeTwo.value){
                    resultList.addLast(currentNodeOne.value);
                    currentNodeOne = currentNodeOne.next;
                    if(currentNodeOne==null){
                        while(currentNodeTwo!=null){
                            resultList.addLast(currentNodeTwo.value);
                            currentNodeTwo = currentNodeTwo.next;
                        }
                    }
                }else {
                    resultList.addLast(currentNodeTwo.value);
                    currentNodeTwo = currentNodeTwo.next;
                    if(currentNodeTwo==null){
                        while(currentNodeOne!=null){
                            resultList.addLast(currentNodeOne.value);
                            currentNodeOne = currentNodeOne.next;
                        }
                    }
                }
            }
        }
        return resultList;
    }
}
