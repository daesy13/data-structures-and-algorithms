package code401challenges.stacksandqueues;

import java.util.EmptyStackException;

public class Stack<E> {
    public Node<E> top;

    // this is a constructor
    public Stack() {
        top = null;
    }

    // Define a method called isEmpty that does not take an argument, and returns a boolean indicating whether
    // or not the stack is empty.
    public boolean isEmpty(){
        return top == null;
    }

    // Define a method called push which takes any value as an argument and adds a new node with that value
    // to the top of the stack with an O(1) Time performance.
    public void push(E value){
        if (top == null){
            top = new Node<>(value);
        }
        else{
            Node<E> newTop = new Node<>(value);
            newTop.next = top;
            top = newTop;
        }
    }

    // Define a method called pop that does not take any argument, removes the node from the top of the stack,
    // and returns the node’s value.
    public E pop(){
        if(!isEmpty()){
        Node<E> current = top;
        top = top.next;
        // this assign the value of the node popped
        return current.value;
        }
        throw new EmptyStackException();
    }

    // Define a method called peek that does not take an argument and returns the value of the node located on
    // top of the stack, without removing it from the stack.
    public E peek(){
        if (!isEmpty()){
            return top.value;
        }
        throw new EmptyStackException();
    }
}
