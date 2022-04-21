package main.java._algo35_find_middle_of_the_linked_list;

public class Optimum {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode head2 = new ListNode(2, head);
        ListNode headResult = middleNode(head2);
    }

     // Definition for singly-linked list.
     public static class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }

     public static ListNode middleNode(ListNode head) {
            ListNode singleJump = head;
            ListNode doubleJump = head;

            while(doubleJump.next!=null && doubleJump.next.next!=null){
                singleJump = singleJump.next;
                doubleJump = doubleJump.next.next;
            }
            if(doubleJump.next==null){
                return singleJump;
            }else return singleJump.next;
    }
}
