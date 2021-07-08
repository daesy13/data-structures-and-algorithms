package code401challenges.stacksandqueues;

import org.junit.Test;

import static org.junit.Assert.*;

//[x] Can successfully push onto a stack
//[x] Can successfully push multiple values onto a stack
//[x] Can successfully pop off the stack
//[x] Can successfully empty a stack after multiple pops
//[x] Can successfully peek the next item on the stack
//[x] Can successfully instantiate an empty stack

public class StackTest<E> {
    private Stack <E> actual;

    @Test
    public void testEmpty(){
        Stack <E> actual = new Stack<>();
        assertEquals(null, actual.top);
    }

    @Test
    public void pushNodeTest(){
        Stack actual = new Stack<>();
        actual.push(1);
        actual.push(2);
        assertEquals(2,actual.peek());
    }

    @Test
    public void popTest(){
        Stack actual = new Stack<>();
        actual.push(1);
        actual.push(2);
        actual.push(3);
        actual.pop();
        assertEquals(2, actual.peek());
    }

    @Test
    public void multiplePopTest(){
        Stack actual = new Stack<>();
        actual.push(1);
        actual.push(2);
        actual.push(3);
        actual.pop();
        actual.pop();
        actual.pop();
        assertEquals(null, actual.top);
    }

    @Test
    public void peekNextTest(){
        Stack actual = new Stack<>();
        actual.push(1);
        actual.push(2);
        actual.push(3);
        assertEquals(3, actual.peek());
    }
}
