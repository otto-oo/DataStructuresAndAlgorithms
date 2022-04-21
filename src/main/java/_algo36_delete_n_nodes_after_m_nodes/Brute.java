package main.java._algo36_delete_n_nodes_after_m_nodes;

public class Brute{

    public static void main(String[] args){
        // input keys
        int[] keys = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        Node head = null;
        for (int i = keys.length - 1; i >= 0; i--) {
            head = new Node(keys[i], head);
        }
        head = deleteNNodesAfterMNodes(head, 2, 1);
        printList(head);
    }

    // Recursive function to delete every `n` nodes in a linked list after skipping `m` nodes
    public static Node deleteNNodesAfterMNodes(Node head, int m, int n){
        // base case
        if (head == null || head.next == null) {
            return head;
        }

        Node previousNode = null;
        Node currentNode = head;

        // skip `m` nodes
        for (int i = 1; currentNode != null && i <= m; i++){
            previousNode = currentNode;
            currentNode = currentNode.next;
        }

        // delete next `n` nodes
        for (int i = 1; currentNode != null && i <= n; i++){
            currentNode = currentNode.next;
        }

        // link remaining nodes with the last node
        previousNode.next = currentNode;

        // recursive for remaining nodes
        deleteNNodesAfterMNodes(currentNode, m, n);

        return head;
    }

    // to print a given linked list
    public static void printList(Node head){
        Node currentNode = head;
        while (currentNode != null){
            System.out.print(currentNode.value + " —> ");
            currentNode = currentNode.next;
        }
        System.out.println("null");
    }
}