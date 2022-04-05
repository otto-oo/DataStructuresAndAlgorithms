package main.java.algo21_palindrome_link_list;

public class Algo21 {

    public static void main(String[] args) {

        Node head = new Node();

        //head.addLast(head, 5);

    }

    public static boolean IsPalindrome(Node node) {

        boolean isPalindrome = false;



        return isPalindrome;
    }

    public static void addLast(Node head, int value){

        Node newNode = new Node(value);

        if (head==null){
            head = newNode;
            return;
        }
        Node currentNode = head;
        while (currentNode!=null){
            currentNode= currentNode.next;
        }
        currentNode.next = newNode;
    }

    public static void printList(Node head) {
        System.out.println("Printing the linked list");
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.value + " ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }

    public static class Node{
        int value;
        Node next;

        public Node() {
        }

        public Node(int value) {
            this.value = value;
            next = null;
        }
    }
}


