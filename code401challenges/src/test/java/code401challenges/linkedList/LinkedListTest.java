package code401challenges.linkedList;

import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {

    @Test public void insertLLTest(){
        LinkedList expected = new LinkedList();
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
        LinkedList actual = new LinkedList();
        actual.insert(20);
        actual.insert(30);
        actual.insert(40);

        String expected = "{40} -> {30} -> {20} -> NULL";
        assertTrue(expected.equals(actual.toString()));
    }

    @Test public void testAppend(){
        LinkedList actual = new LinkedList();
        actual.insert(2);
        actual.insert(3);
        actual.insert(1);
        actual.append(5);
        String expected = "{1} -> {3} -> {2} -> {5} -> NULL";
        assertTrue(expected.equals(actual.toString()));
    }

    @Test public void testInsertBefore(){
        LinkedList actual = new LinkedList();
        actual.insert(2);
        actual.insert(3);
        actual.insert(1);
        actual.insertBefore(3,5);
        String expected = "{1} -> {5} -> {3} -> {2} -> NULL";
        assertEquals(expected, actual.toString());
    }

    @Test public void testInsertAfter(){
        LinkedList actual = new LinkedList();
        actual.insert(2);
        actual.insert(3);
        actual.insert(1);
        actual.insertAfter(3,5);
        String expected = "{1} -> {3} -> {5} -> {2} -> NULL";
        assertEquals(expected, actual.toString());
    }

    @Test public void testKFromEnd(){
        LinkedList actual = new LinkedList();
        actual.insert(2);
        actual.insert(8);
        actual.insert(3);
        actual.insert(1);

        int pendingLastValue = actual.kthFromEnd(0);
        int expectedLastValue = 2;
        assertEquals(expectedLastValue, pendingLastValue);

        int pendingSecondFromEnd = actual.kthFromEnd(2);
        int expectedSecondFromEnd = 3;
        assertEquals(expectedSecondFromEnd, pendingSecondFromEnd);
    }

    @Test public void testMergeEqualLengthLists(){
        LinkedList actual1 = new LinkedList();
        actual1.insert(1);
        actual1.insert(2);
        actual1.insert(3);

        LinkedList actual2 = new LinkedList();
        actual2.insert(5);
        actual2.insert(9);
        actual2.insert(4);

        LinkedList actual = LinkedList.mergeLists(actual1, actual2);
        String expected = "{3} -> {4} -> {2} -> {9} -> {1} -> {5} -> NULL";
        assertEquals(expected, actual.toString());
    }

    @Test public void testMergeUnevenList(){
        LinkedList actual1 = new LinkedList();
        actual1.insert(1);
        actual1.insert(3);

        LinkedList actual2 = new LinkedList();
        actual2.insert(5);
        actual2.insert(9);
        actual2.insert(4);

        LinkedList actual = LinkedList.mergeLists(actual1, actual2);
        String expected = "{3} -> {4} -> {1} -> {9} -> {5} -> NULL";
        assertEquals(expected, actual.toString());
    }

    @Test public void testMergeEmptyList(){

        LinkedList actual1 = new LinkedList();
        actual1.insert(5);
        actual1.insert(9);
        actual1.insert(4);

        LinkedList actual2 = new LinkedList();

        LinkedList actual = LinkedList.mergeLists(actual1, actual2);
        String expected = "{4} -> {9} -> {5} -> NULL";
        assertEquals(expected, actual.toString());
    }

}
