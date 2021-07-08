package code401challenges.stacksandqueues;

public class Node <E>{
    // this are instance variables
    public Node<E> next;
    public E value;

    // constructor
    public Node(E val) {
        this.value = val;
        this.next = null;
    }
}

