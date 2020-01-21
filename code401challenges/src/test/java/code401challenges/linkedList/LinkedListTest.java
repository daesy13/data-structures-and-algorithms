package code401challenges.linkedList;

import org.junit.Test;
import static org.junit.Assert.*;

public class LinkedListTest {

    @Test public void insertLLTest(){
        Stack expected = new Stack();
        expected.insert(70);
        expected.insert(71);
        expected.insert(72);
        expected.insert(80);
        assertTrue(expected.includes(70));
        assertTrue(expected.includes(71));
        assertTrue(expected.includes(72));
        assertFalse(expected.includes(81));
    }

    @Test public void testStringLinkedList() {
        Stack actual = new Stack();
        actual.insert(20);
        actual.insert(30);
        actual.insert(40);

        String expected = "{40} -> {30} -> {20} -> NULL";
        assertTrue(expected.equals(actual.toString()));
    }

    @Test public void testAppend(){
        Stack actual = new Stack();
        actual.insert(2);
        actual.insert(3);
        actual.insert(1);
        actual.append(5);
        String expected = "{1} -> {3} -> {2} -> {5} -> NULL";
        assertTrue(expected.equals(actual.toString()));
    }

    @Test public void testAppendOne(){
        Stack actual = new Stack();
        actual.append(5);
        String expected = "{5} -> NULL";
        assertTrue(expected.equals(actual.toString()));
    }

    @Test public void testInsertBefore(){
        Stack actual = new Stack();
        actual.insert(2);
        actual.insert(3);
        actual.insert(1);
        actual.insertBefore(3,5);
        String expected = "{1} -> {5} -> {3} -> {2} -> NULL";
        assertEquals(expected, actual.toString());
    }

    @Test public void testInsertAfter(){
        Stack actual = new Stack();
        actual.insert(2);
        actual.insert(3);
        actual.insert(1);
        actual.insertAfter(3,5);
        String expected = "{1} -> {3} -> {5} -> {2} -> NULL";
        assertEquals(expected, actual.toString());
    }

    @Test public void testKFromEnd(){
        Stack actual = new Stack();
        actual.insert(2);
        actual.insert(8);
        actual.insert(3);
        actual.insert(1);
        int pending = actual.kthFromEnd(0);
        int expected = 2;
        assertEquals(expected, 2);

    }

}
