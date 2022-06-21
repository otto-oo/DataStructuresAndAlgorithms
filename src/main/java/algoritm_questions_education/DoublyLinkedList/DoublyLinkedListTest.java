package main.java.algoritm_questions_education.DoublyLinkedList;

public class DoublyLinkedListTest {
    public static void main(String[] args) {
        DoublyLinkedList d = new DoublyLinkedList();
        Node newNode = new Node(5);
        d.setHead(newNode);
        d.setHead(new Node(11));
        d.setHead(new Node(0));
        d.setTail(new Node(8));
        Node newNine = new Node(9);
        d.setTail(newNine);
        Node node = new Node(25);
        d.setHead(node);
        d.insertBefore(new Node(6), newNode);
        d.insertAfter(new Node(100), node);
        d.insertAfterValue(new Node(2), 9);
        System.out.println("d.indexOf = " + d.indexOf(2));
        d.insertAtPosition(2, new Node(70));
        d.removeNodesWithValue(9);
        System.out.println("d.containsNodeWithValue(2) = " + d.containsNodeWithValue(100));
        d.display();

    }
}
