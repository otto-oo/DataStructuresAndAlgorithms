package main.java.alumnis.alumni_tree_bst_impl;

public class EmployeeTree {

    Employee root;

    public void insert(String name, String email, int id){

        Employee newNode = new Employee(name, email, id);

        if(root == null){
            root = newNode;
        }else{
            Employee currentNode = root;
            while (true){
                if(newNode.id <= currentNode.id ){
                    if (currentNode.leftChild == null){
                        currentNode.leftChild = newNode;
                        break;
                    }
                    currentNode = currentNode.leftChild;
                }
                else{
                    if (currentNode.rightChild == null){
                        currentNode.rightChild = newNode;
                        break;
                    }
                    currentNode = currentNode.rightChild;
                }
            }
        }
    }

    public boolean find(int id){

        Employee current=root;

        while (current!=null){
            if (id < current.id){
                current = current.leftChild;
            }
            else if (id > current.id){
                current = current.rightChild;
            }
            else return true;
        }
        return false;
    }
}
