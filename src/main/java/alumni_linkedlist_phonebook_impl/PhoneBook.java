package main.java.alumni_linkedlist_phonebook_impl;

import main.java.alumni_tree_bst_impl.Employee;

public class PhoneBook {

    String name;
    String lastName;
    String email;
    int phoneNumber;
    PhoneBook next;

    public PhoneBook(String name, String lastName, String email, int phoneNumber) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
}
