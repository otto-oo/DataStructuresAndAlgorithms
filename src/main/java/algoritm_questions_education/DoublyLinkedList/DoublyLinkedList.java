package main.java.algoritm_questions_education.DoublyLinkedList;

public class DoublyLinkedList {
        public Node head;
        public Node tail;
        public void setHead(Node node) {
            // Write your code here.
                if (isEmpty()){
                        node.prev = null;
                        node.next = null;
                        head = node;
                        tail = node;
                }else {
                        node.prev = null;
                        node.next = head;
                        head.prev = node;
                        head = node;
                }
        }
        public void setTail(Node node) {
            // Write your code here.
                if(isEmpty()){
                        node.prev = null;
                        node.next = null;
                        head = tail = node;
                }else {
                        tail.next = node;
                        node.prev = tail;
                        node.next = null;
                        tail = node;
                }
        }
        public void insertBefore(Node node, Node nodeToInsert) {
            // Write your code here.
                if(isEmpty()){
                       System.out.println("LinkedList is empty");
                }
                if (nodeToInsert == head){
                        node.prev = null;
                        node.next = nodeToInsert;
                        nodeToInsert.prev = node;
                        head = node;
                }else{
                        nodeToInsert.prev.next = node;
                        node.prev = nodeToInsert.prev;
                        node.next = nodeToInsert;
                        nodeToInsert.prev = node;
                }
        }
        public void insertAfter(Node node, Node nodeToInsert) {
            // Write your code here.
                if(isEmpty()){
                        System.out.println("LinkedList is empty");
                }
                if (nodeToInsert == tail){
                        node.next = null;
                        node.prev = nodeToInsert;
                        nodeToInsert.next = node;
                        tail = node;
                }else{
                        nodeToInsert.next.prev = node;
                        node.next = nodeToInsert.next;
                        nodeToInsert.next = node;
                        node.prev = nodeToInsert;
                }
        }
        public void insertAfterValue(Node node, int value) {
        // Write your code here.
                Node currentNode = head;

                if(isEmpty()){
                        System.out.println("LinkedList is empty");
                }
                if(tail.value == value){
                      tail.next = node;
                      node.prev = tail;
                      node.next = null;
                      tail = node;
                }else {
                      while(currentNode.value != value){
                              currentNode = currentNode.next;
                      }
                      currentNode.next.prev = node;
                      node.next = currentNode.next;
                      currentNode.next = node;
                      node.prev = currentNode;
                }

        }
        public void insertAtPosition(int position, Node nodeToInsert) {
            // Write your code here.
            Node currentNode = head;
            if (isEmpty()){
                System.out.println("LinkedList is empty");
            }
            while (currentNode != null){
                    if(indexOf(currentNode.value) == position){
                            insertBefore(nodeToInsert, currentNode);
                            break;
                    }
                    currentNode = currentNode.next;
            }
        }
        public void removeNodesWithValue(int value) {
            // Write your code here.
                Node currentNode = head;
                if (isEmpty()){
                        System.out.println("LinkedList is empty");
                }
                while (currentNode != null){
                        if(currentNode.value == value){
                                remove(currentNode);
                                break;
                        }
                        currentNode = currentNode.next;
                }
        }
        public void remove(Node node) {
            // Write your code here.
                if (isEmpty()){
                        System.out.println("LinkedList is empty");
                }else if(node==head & node==tail){
                        head = tail = null;
                }else if(node==head){
                        Node nextNode = head.next;
                        head.next = null;
                        nextNode.prev = null;
                        head = nextNode;
                }
                else if(node==tail){
                        Node previousNode = tail.prev;
                        previousNode.next = null;
                        tail.prev = null;
                        tail = previousNode;
                }else{
                        Node previousNode = node.prev;
                        Node nextNode = node.next;
                        previousNode.next = nextNode;
                        nextNode.prev = previousNode;
                        node.prev = null;
                        node.next = null;
                }
        }
        public int indexOf(int value) {
            // Write your code here.
            Node currentNode = head;
            int count = 1;
            if (isEmpty()){
                System.out.println("LinkedList is empty");
            }
            while (currentNode != null){
                   if(currentNode.value == value){
                           return count;
                   }
                   currentNode = currentNode.next;
                   count++;
            }

            return count;
        }
        public boolean containsNodeWithValue(int value) {
            // Write your code here.
                Node currentNode = head;

                if(isEmpty()){
                        System.out.println("LinkedList is empty");
                        return false;
                }
                while (currentNode != null){
                        if(currentNode.value == value){
                                return true;
                        }
                        currentNode = currentNode.next;
                }
                return false;
        }
        public boolean isEmpty(){
                return head==null;
        }
        public void display(){
                Node current=head;
                while (current!=null){
                        System.out.println("current.value = " + current.value);
                        current=current.next;
                }
        }

    }

// Do not edit the class below.
class Node {
    public int value;
    public Node prev;
    public Node next;
    public Node(int value) {
        this.value = value;
    }
}

