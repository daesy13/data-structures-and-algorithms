package code401challenges.stacksandqueues;

import static org.junit.Assert.*;

import org.junit.Test;


public class PseudoQueueTest {

    @Test public void enqueueTest(){
        PseudoQueue ps = new PseudoQueue();
        ps.enqueue(1);
        ps.enqueue(2);
        assertEquals(1,ps.dequeue());
        assertEquals(2,ps.dequeue());
    }
}
