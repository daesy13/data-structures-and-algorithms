package code401challenges;

import java.util.StringJoiner;

public class LinkedList {
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

    // This is a Method: is a function that lives inside of an object
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
        int llLength = getLength();
        if(k > llLength) {
            throw new IllegalArgumentException("K cannot be larger than the LinkedList length");
        }
        int newLength = llLength - k;
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
        int llLength = 0;
        while (current != null){
            llLength++;
            current = current.next;
        }
        return llLength;
    }

    // CODE CHALLENGE 8
    public static LinkedList mergeLists(LinkedList one, LinkedList two) {
        if(one.head == null){
            return two;
        } else if(two.head == null) {
            return one;
        }
    }
//        Node oneCurrent = one.head;
//        Node twoCurrent = two.head;
//        int oneLength = 1;
//        int twoLength = 1;
//        while (oneCurrent.next != null){
//            oneLength++;
//        }
//        while (twoCurrent.next != null){
//            twoLength++;
//        }
//
//        int bigSize;
//        int smallSize;
//
//        LinkedList result = new LinkedList();
//        LinkedList big, small;
//
//        while (one != null && two != null) {
//            if (oneLength < twoLength) {
//                big = two;
//                bigSize = twoLength;
//            } else {
//                small = one;
//                smallSize = oneLength;
//            }
//            if (oneLength < twoLength) {
//                big = one;
//                bigSize = oneLength;
//            } else {
//                small = two;
//                smallSize = twoLength;
//            }
//        }
//
//        for (int i = 0; i< bigSize; i++) {
//            result.append(big.head.value);
//            two.head = two.head.next;
//
//        }
//    }

}
