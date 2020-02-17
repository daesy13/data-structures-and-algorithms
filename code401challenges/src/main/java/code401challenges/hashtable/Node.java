package code401challenges.hashtable;

public class Node{

    // Instance variables
    public Node next;
    public String value;

    // constructor
    public Node(String key, String val) {
        this.value = val;
        this.next = null;
    }

    // constructors have to have the same NAME as the CLASS
    // method overloading: same name different parameters
    public Node(String val, Node nextNode) {
        this.value = val;
        this.next = nextNode;
    }

}
