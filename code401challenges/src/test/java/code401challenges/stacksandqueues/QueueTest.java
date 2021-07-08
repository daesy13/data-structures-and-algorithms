package code401challenges.stacksandqueues;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

//[x] Can successfully enqueue into a queue
//[x] Can successfully enqueue multiple values into a queue
//[x] Can successfully dequeue out of a queue the expected value
//[x] Can successfully peek into a queue, seeing the expected value
//[x] Can successfully empty a queue after multiple dequeues
//[x] Can successfully instantiate an empty queue

public class QueueTest <E>{
    private Queue <E> actual;

    @Test
    public void testEmpty(){
        Queue <E> actual = new Queue<>();
        assertEquals(null, actual.front);
    }

    @Test
    public void enqueueTest(){
        Queue actual = new Queue<>();
        actual.enqueue(1);
        actual.enqueue(2);
       assertEquals(1, actual.peek());
    }

    @Test
    public void dequeueTest(){
        Queue actual = new Queue<>();
        actual.enqueue(1);
        actual.enqueue(2);
        actual.enqueue(3);
        actual.dequeue();
        assertEquals(2, actual.peek());
    }

    @Test
    public void emptyQueueTest(){
        Queue actual = new Queue<>();
        actual.enqueue(1);
        actual.enqueue(2);
        actual.enqueue(3);
        actual.dequeue();
        actual.dequeue();
        actual.dequeue();
        assertEquals(null, actual.front);
    }

}
