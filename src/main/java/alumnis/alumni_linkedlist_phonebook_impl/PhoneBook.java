package main.java.alumnis.alumni_linkedlist_phonebook_impl;

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

    @Override
    public String toString() {
        return "PhoneBook{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
