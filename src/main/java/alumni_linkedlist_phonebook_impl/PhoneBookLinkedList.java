package main.java.alumni_linkedlist_phonebook_impl;

import main.java._algo37_alumni_linkedlist_impl.Node;

import java.util.ArrayList;
import java.util.List;

public class PhoneBookLinkedList {

    PhoneBook head;
    PhoneBook tail;

    public void insert(String name, String lastName, String email, int phoneNumber){
        PhoneBook newPhoneBook = new PhoneBook(name, lastName, email, phoneNumber);
        if (head == null){
            head = tail = newPhoneBook;
        }else{
            tail.next = newPhoneBook;
            tail = newPhoneBook;
        }
    }

    public PhoneBook findByName(String name){
        PhoneBook currentPhoneBook = head;
        while (currentPhoneBook != null){
            if(currentPhoneBook.name == name){
                return currentPhoneBook;
            }
            currentPhoneBook = currentPhoneBook.next;
        }
        return null;
    }

    public List<PhoneBook> findAllByLastName(String lastName){
        List<PhoneBook> resultList = new ArrayList<>();
        PhoneBook currentPhoneBook = head;
        while (currentPhoneBook != null){
            if(currentPhoneBook.lastName == lastName){
                resultList.add(currentPhoneBook);
            }
            currentPhoneBook = currentPhoneBook.next;
        }
        return resultList;
    }

    public void deleteByName(String name){
        PhoneBook currentPhoneBook = head;
        PhoneBook deletePhoneBook = findByName(name);
        PhoneBook previous = head;
        while(currentPhoneBook != null){
            if(currentPhoneBook == deletePhoneBook){
                if(currentPhoneBook == head){                // if current is head
                    head = currentPhoneBook.next;
                    currentPhoneBook.next = null;
                    if(currentPhoneBook == tail){            // if current is also tail that means, root has 1 node
                        tail = null;
                    }
                }
                else if(currentPhoneBook == tail){           // if current is tail, lastNode will be deleted
                    tail = previous;
                    previous.next = null;
                }else{                              // if deletedNode is middle of linked list
                    previous.next = currentPhoneBook.next;
                    currentPhoneBook.next = null;
                }
            }
            previous = currentPhoneBook;
            currentPhoneBook = currentPhoneBook.next;
        }
    }

    public void deleteAllMatchingLastName(String lastName){
        List<PhoneBook> deletePhoneBookList = findAllByLastName(lastName);
        for (PhoneBook phoneBook : deletePhoneBookList){
            deleteByName(phoneBook.name);
        }
    }

    public List<PhoneBook> findAll(){
        List<PhoneBook> resultList = new ArrayList<>();
        PhoneBook currentPhoneBook = head;
        while (currentPhoneBook != null){
            resultList.add(currentPhoneBook);
            currentPhoneBook = currentPhoneBook.next;
        }
        return resultList;
    }

    public void printPhoneBook(){
        PhoneBook currentPhoneBook = head;
        if (head == null){
            System.out.println("Phone Book is empty..");
        }
        while (currentPhoneBook != null){
            System.out.print("{currentPhoneBook.name = " + currentPhoneBook.name + ", "
                    + "currentPhoneBook.lastName = " + currentPhoneBook.lastName + ", "
                    + "currentPhoneBook.email = " + currentPhoneBook.email + ", "
                    + "currentPhoneBook.phoneNumber = " + currentPhoneBook.phoneNumber + "}" + "-> ");
            currentPhoneBook = currentPhoneBook.next;
        }
        System.out.println();
    }
}
