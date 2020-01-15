package code401challenges;

import java.util.StringJoiner;

public class LinkedList {

    public Node head;

    public LinkedList() {}

    static class Node {
        public Node next;
        public int value;

        public Node(int val) {
            this.value = val;
            this.next = null;
        }
    }

    public void insert (int val){
        if (this.head == null){
            this.head = new Node(val);
        }
        else{
            Node nextNode = new Node(val);
            nextNode.next = head;
            head = nextNode;
        }
    }

    public boolean includes (int val){
        Node current = head;
        while (current != null){
            if (current.value == val){
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public String toString(int val){
        StringJoiner resultString = new StringJoiner("}{","{","}");
        Node current = head;
        while (current != null){
            resultString.add(toString(current.value));
            current = current.next;
            if (current == null){
                resultString.add(" -> NULL");
            }
            else{
                resultString.add(" -> ");
            }
        }
        return resultString.toString();
    }

    // CODE CHALLENGE 6

    public void append(int val) {
        Node newNode = new Node(val);
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void insertBefore(int target, int val) {
        Node newNode = new Node(val);
        Node current = head;
        while (current.next.value != target) {
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;
    }

    public void insertAfter(int target, int val) {
        Node newNode = new Node(val);
        Node current = head;
        while (current.value != target) {
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;
    }

    // CODE CHALLENGE 7

    public int kthFromEnd(int k){
        Node current = this.head;
        int llLength = 1;
        while (current.next != null){
            llLength++;
        }
        int newLength = llLength - k;
        int counter = 0;
        current = this.head;
        while (current != null){
            if (newLength == counter){
                return current.value;
            }
            current = current.next;
            counter++;
        }
        throw new IllegalArgumentException("Sorry, Not Found Value");
    }
}
