package main.java.alumni_linkedlist_phonebook_impl;

import java.util.Collections;

public class PhoneBookMain {
    public static void main(String[] args) {
        PhoneBookLinkedList phoneBookLinkedList = new PhoneBookLinkedList();
        phoneBookLinkedList.insert("otto", "cyber", "a@yahoo.com", 4578);
        phoneBookLinkedList.insert("cydeo", "cydeo", "c@yahoo.com", 1234);
        phoneBookLinkedList.insert("new cydeo", "cydeo", "d@yahoo.com", 5647);
        phoneBookLinkedList.printPhoneBook();
        //System.out.println("phoneBookLinkedList.findByName(\"otto\") = " + phoneBookLinkedList.findByName("otto").toString());
        //System.out.println("phoneBookLinkedList.findByName(\"cydeo\") = " + phoneBookLinkedList.findByName("cydeo"));
        //System.out.println("phoneBookLinkedList.findByName(\"qwerty\") = " + phoneBookLinkedList.findByName("qwerty"));
        //System.out.println("phoneBookLinkedList.findAllByLastName(\"cydeo\") = " + phoneBookLinkedList.findAllByLastName("cydeo"));
        //System.out.println("phoneBookLinkedList.findAll() = " + phoneBookLinkedList.findAll());
        //phoneBookLinkedList.deleteByName("cydeo");
        //phoneBookLinkedList.printPhoneBook();
        //phoneBookLinkedList.deleteAllMatchingLastName("cydeo");
        //phoneBookLinkedList.printPhoneBook();

    }
}
