package main.java.alumnis.alumni_tree_bst_impl;

public class Employee {
    String name;
    String email;
    int id;
    Employee leftChild;
    Employee rightChild;
    Employee head;

    public Employee(String name, String email, int id) {
        this.name = name;
        this.email = email;
        this.id = id;
    }
}
