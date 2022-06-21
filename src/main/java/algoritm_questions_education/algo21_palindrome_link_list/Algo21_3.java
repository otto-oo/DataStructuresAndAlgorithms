package main.java.algoritm_questions_education.algo21_palindrome_link_list;

import main.java.algoritm_questions_education.LinkedList.MyLinkedList;

import java.util.Stack;

public class Algo21_3 {
    public static void main(String[] args) {

        MyLinkedList linkedList = new MyLinkedList();

        linkedList.addLast(1);
        linkedList.addLast(2);
        linkedList.addLast(3);
        linkedList.addLast(4);
        linkedList.addLast(4);
        linkedList.addLast(3);
        linkedList.addLast(2);
        linkedList.addLast(1);

        System.out.println("isPalindrome(linkedList) = " + isPalindrome(linkedList));
    }

    public static boolean isPalindrome(MyLinkedList linkedList){

        boolean isPalindrome = false;
        boolean middleFound = false;
        int i = 1;
        Stack<Integer> stack = new Stack<>();
        MyLinkedList.Node currentNode = linkedList.first;

        while(currentNode != null){

            if (i <= linkedList.size/2){                            //pushing till middle of linked list
                stack.push(currentNode.value);
                i++;
                currentNode = currentNode.next;
                continue;
            }
            if(linkedList.size % 2 == 1 & middleFound == false){    //checking middle element
                currentNode = currentNode.next;
                middleFound = true;
            }
            if (currentNode.value == stack.pop()){                  //popping and checking
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
