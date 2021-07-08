package code401challenges.linkedList;

import java.util.StringJoiner;

public class LinkedList {
    public static void main(String[] args){
        LinkedList t = new LinkedList();
        t.append(5);
        System.out.println(t);
    }
    // this is an instance variable
    public Node head;

    // this is a constructor
    public LinkedList() {
        head = null;
    }

    // Puts a new node at the beginning
    // "this" refers to the instance
    // all the purple words are referring to an instance variable
    public void insert(int val){
        if (head == null){
            head = new Node(val);
        }
        else{
            Node newHead = new Node(val);
            newHead.next = head;
            head = newHead;
        }
    }

    public boolean includes(int val){
        Node current = head;
        while (current != null){
            if (current.value == val){
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // Resource: Nick's video minute=01:24:11 frontRow = https://frontrowviews.com/Home/Event/Play/5e1ceb11eee6d9204c77f8dc
    // This is a Method: is a function that lives inside of an object
    public String toString(){
        StringJoiner resultString = new StringJoiner("","{","");
        Node current = head;
        while (current != null){
            int data = current.value;
            resultString.add(Integer.toString(data));
            if (current.next == null){
                resultString.add("} -> NULL");
            }
            else{
                resultString.add("} -> {");
            }
            current = current.next;
        }
        return resultString.toString();
    }

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
        int llLength = getLength();
        if(k > llLength) {
            throw new IllegalArgumentException("K cannot be larger than the LinkedList length");
        }
        int newLength = llLength - k;
//        System.out.println("newLength = " + newLength);
//        int counter = 0;
        Node current = head;
        for (int i = 0; i < newLength; i++){
            current = current.next;
        }
//        while(newLength != counter){
//            current = current.next;
//            counter++;
//        }
        return current.value;
    }

    private int getLength(){
        Node current = head;
        int llLength = -1;
        while (current != null){
            llLength++;
            current = current.next;
        }
        return llLength;
    }

    // CODE CHALLENGE 8
    public static LinkedList mergeLists(LinkedList one, LinkedList two) {
        // run the recursion which will send all into the first LinkedList
        mergeList(one.head, two.head);
        // return first LinkedList
        return one;
    }

    // https://github.com/RomellPineda/data-structures-and-algorithms/blob/master/code401challenges/src/main/java/code401challenges/linkedList/LinkedList.java
    // went over this with my tutor Evan Slaton
    private static void mergeList(Node current1, Node current2) {
        // if any of the nodes is empty return whichever one has something because null will be null
        if (current1 == null || current2 == null) {
            return;
        }
        // THIS IS THE BASE CASE FOR RECURSION:
        // create place holder to store next position from the very first node passed as parameter
        Node runner = current1.next;
        // assign to be the next node the first item from the 2nd node passed
        current1.next = current2;
        // * call again the function to run it again "this is recursion" this links the two nodes into one LinkedList
        mergeList(current2, runner);
    }
}
