package main.java.algo21_palindrome_link_list;

import main.java.LinkedList.MyLinkedList;

import java.util.Stack;

public class Algo21_2 {
    public static void main(String[] args) {

        MyLinkedList linkedList = new MyLinkedList();

        linkedList.addLast(1);
        linkedList.addLast(2);
        linkedList.addLast(3);
        linkedList.addLast(2);
        linkedList.addLast(1);

        System.out.println("isPalindrome(linkedList) = " + isPalindrome(linkedList));
    }

    public static boolean isPalindrome(MyLinkedList linkedList){

        boolean isPalindrome = false;
        Stack<Integer> stack = new Stack<>();
        MyLinkedList.Node currentNode = linkedList.first;

        while(currentNode != null){
            stack.push(currentNode.value);
            currentNode = currentNode.next;
        }

        currentNode = linkedList.first;
        while (currentNode != null){
            if (currentNode.value == stack.pop()){
                isPalindrome = true;
                currentNode = currentNode.next;
            }else{
                isPalindrome = false;
                break;
            }
        }
        return isPalindrome;
    }
}
