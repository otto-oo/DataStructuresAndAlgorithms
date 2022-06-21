package main.java.algoritm_questions_education.algo21_palindrome_link_list;

import java.util.Stack;

public class Algo21_4 {

    public static void main(String[] args) {
        ListNode listNode = new ListNode();
        listNode.add(5);
        listNode.add(4);
        listNode.add(8);
        listNode.add(4);
        listNode.add(5);
        listNode.print();
        System.out.println("isPalindrome(listNode) = " + isPalindrome(listNode));
    }

    public static boolean isPalindrome(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        ListNode pointer = head;
        boolean isOdd = true;
        while (pointer.next != null) {
            if (isOdd) {
                stack.push(head.val);
                pointer = pointer.next;
                head = head.next;
                isOdd = false;

            } else {
                pointer = pointer.next;
                isOdd = true;
            }
        }
        while (head != null) {
            if (isOdd) {
                head = head.next;
                isOdd = false;
            }

            if (stack.pop() != head.val) {
                return false;
            }
            head = head.next;
        }
        return true;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    public void add(int val) {
        var nodeToAdd = new ListNode();
        nodeToAdd.val = val;
        ListNode current = this;
        if (this.val == 0 && this.next == null) {
            this.val = val;
            return;
        }
        while (current.next != null) {
            current = current.next;
        }
        current.next = nodeToAdd;
    }

    public void print() {
        ListNode current = this;
        if (this.val == 0 && this.next == null) {
            System.out.println("[]");
            return;
        }
        while (current.next != null) {
            System.out.print(current.val + ", ");
            current = current.next;
        }
        System.out.println(current.val);
    }
}
