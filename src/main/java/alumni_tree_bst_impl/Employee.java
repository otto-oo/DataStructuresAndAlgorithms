package main.java.alumni_tree_bst_impl;

public class Employee {
    String name;
    String email;
    int id;
    Employee leftChild;
    Employee rightChild;

    public Employee(String name, String email, int id) {
        this.name = name;
        this.email = email;
        this.id = id;
    }
}
