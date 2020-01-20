package code401challenges.stacksandqueues;

import java.util.NoSuchElementException;

public class Queue {
    // This object should be aware of a default empty value assigned to front when the queue is created.

    public Node front;
    public Node back;

    // this is a constructor
    public Queue(){
        front = null;
    }

    //Define a method called isEmpty that does not take an
    // argument, and returns a boolean indicating whether
    // or not the queue is empty.

    public boolean isEmpty(){
        return front == null;
    }

    //Define a method called enqueue which takes any value as
    // an argument and adds a new node with that value to the
    // back of the queue with an O(1) Time performance.

    public void enqueue(int value){
        Node runner =  new Node(value);
        if(isEmpty()){
            front = back = runner;
        }
        else if (front == back){
            front.next = runner;
            back = runner;
        }
        else{
            back.next = runner;
            back = runner;
        }
    }

    //Define a method called dequeue that does not take any
    //argument, removes the node from the front of the
    // queue, and returns the node’s value.
    public int dequeue(){
        if(isEmpty()){
            throw new NoSuchElementException("sorry This queue is empty");
        }
        else if(front == back){
            Node runner = front;
            front = back = null;
            return runner.value;
        }
        else {
            Node current = front;
            front = front.next;
            return current.value;
        }
    }

    //Define a method called peek that does not take an
    //argument and returns the value of the node located
    // in the front of the queue, without removing it from
    // the queue.
    public int peek(){
        if(isEmpty()){
            throw new NoSuchElementException("sorry Nothing to peek");
        }
        else {
            return front.value;
        }
    }

}
