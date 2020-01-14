package code401challenges;

import java.util.StringJoiner;

public class LinkedList {

    public Node head;

    public LinkedList() {};

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


}
