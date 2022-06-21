package main.java.algoritm_questions_education._algo36_delete_n_nodes_after_m_nodes;

public class Optimum {

    public static void main(String[] args) {
        Node node13 = new Node(13);
        Node node12 = new Node(12, node13);
        Node node11 = new Node(11, node12);
        Node node10 = new Node(10, node11);
        Node node9 = new Node(9, node10);
        Node node8 = new Node(8, node9);
        Node node7 = new Node(7, node8);
        Node node6 = new Node(6, node7);
        Node node5 = new Node(5, node6);
        Node node4 = new Node(4,node5);
        Node node3 = new Node(3, node4);
        Node node2 = new Node(2, node3);
        Node head = new Node(1, node2);
        printLinkedList(head);
        printLinkedList(deleteNNodesAfterMNodes(head,1,1));
    }

    public static Node deleteNNodesAfterMNodes(Node head, int m, int n) {
        Node pointer1 = head;
        Node pointer2;
        while (pointer1 != null) {
            for (int i = 1; i < m && pointer1.next != null; i++) { //go in blue
                pointer1 = pointer1.next;
            }
            pointer2 = pointer1.next;                                  //p2 to red
            for (int i = 1; i <= n && pointer2 != null; i++) {          //go in red
                pointer2 = pointer2.next;
            }
            pointer1.next = pointer2;                                  //make connection
            pointer1 = pointer2;                                       //come together
        }
        return head;
    }

    private static void printLinkedList(Node head) {
        Node current = head;
        while(current.next!=null) {
            System.out.print(current.val + "-");
            current = current.next;
        }
        System.out.println(current.val);
    }

    static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }

        Node(int val, Node next) {
            this.val = val; this.next = next;
        }
    }

}
