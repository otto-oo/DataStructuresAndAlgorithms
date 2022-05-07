package main.java.alumni_linkedlist_impl;

public class LinkedListMain {
    public static void main(String[] args) {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.insertLast(1);
        singleLinkedList.insertLast(2);
        singleLinkedList.insertLast(3);
        singleLinkedList.insertLast(4);
        singleLinkedList.insertLast(5);
        singleLinkedList.deleteLast();
        singleLinkedList.print();
        singleLinkedList.deleteLast();
        singleLinkedList.print();
        singleLinkedList.delete(10);
        singleLinkedList.print();
    }
}
