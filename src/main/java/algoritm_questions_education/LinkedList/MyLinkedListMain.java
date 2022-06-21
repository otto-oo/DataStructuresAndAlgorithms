package main.java.algoritm_questions_education.LinkedList;

public class MyLinkedListMain {

    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addLast(1);
        myLinkedList.addLast(2);
        myLinkedList.addLast(3);
        myLinkedList.addLast(4);
        myLinkedList.addLast(5);
        myLinkedList.printLinkedList();
        myLinkedList.deleteLast();
        myLinkedList.printLinkedList();
    }
}
