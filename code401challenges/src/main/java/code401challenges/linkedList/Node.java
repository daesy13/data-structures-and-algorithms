package code401challenges.linkedList;

public class Node {
    // this are instance variables
    public Node next;
    public int value;

    // constructor
    public Node(int val) {
        this.value = val;
        this.next = null;
    }

    // constructors have to have the same NAME as the CLASS
    // method overloading: same name different parameters
    public Node(int val, Node nextNode) {
        this.value = val;
        this.next = nextNode;
    }
}
