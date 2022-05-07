package main.java.alumni_tree_bst_impl;

public class EmployeeMain {

    public static void main(String[] args) {
        EmployeeTree employeeTree = new EmployeeTree();
        employeeTree.insert("otto", "otto@cyber.com", 5);
        employeeTree.insert("fatih", "otto@cyber.com", 3);
        employeeTree.insert("ower", "otto@cyber.com", 7);
        employeeTree.insert("ali", "otto@cyber.com", 2);
        System.out.println("employeeTree.find(2) = " + employeeTree.find(2));
        System.out.println("employeeTree.find(10) = " + employeeTree.find(10));
    }
}
