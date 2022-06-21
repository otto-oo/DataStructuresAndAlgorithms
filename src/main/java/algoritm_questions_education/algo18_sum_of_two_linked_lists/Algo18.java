package main.java.algoritm_questions_education.algo18_sum_of_two_linked_lists;

import main.java.algoritm_questions_education.LinkedList.MyLinkedList;

public class Algo18 {

    public static void main(String[] args) {

        MyLinkedList linkedListOne = new MyLinkedList();
        MyLinkedList linkedListTwo = new MyLinkedList();

        linkedListOne.addLast(2);
        linkedListOne.addLast(4);
        linkedListOne.addLast(7);
        linkedListOne.addLast(1);
        linkedListOne.printLinkedList();

        System.out.println("*******");
        linkedListTwo.addLast(9);
        linkedListTwo.addLast(4);
        linkedListTwo.addLast(5);
        linkedListTwo.printLinkedList();

        System.out.println("*******");
        sumOfTwoLinkedLists(linkedListOne, linkedListTwo).printLinkedList();
    }

    public static MyLinkedList sumOfTwoLinkedLists(MyLinkedList linkedListOne, MyLinkedList linkedListTwo){

        MyLinkedList resultList = new MyLinkedList();
        MyLinkedList.Node currentNode = linkedListOne.first;
        int i = 0;
        int sumOfLinkedListOne = 0;
        int sumOfLinkedListTwo = 0;
        String[] resultListStringArray;

        while(currentNode != null){
            sumOfLinkedListOne += currentNode.value * Math.pow(10, i);
            i++;
            currentNode = currentNode.next;
        }

        i=0;
        currentNode = linkedListTwo.first;
        while(currentNode != null){
            sumOfLinkedListTwo += currentNode.value * Math.pow(10, i);
            i++;
            currentNode = currentNode.next;
        }

        resultListStringArray = (String.valueOf(sumOfLinkedListOne + sumOfLinkedListTwo)).split("");

        for(int j = 0; j < resultListStringArray.length; j++) {
            resultList.addLast(Integer.parseInt(resultListStringArray[j]));
        }

        resultList.reverse();

        return resultList;
    }
}
