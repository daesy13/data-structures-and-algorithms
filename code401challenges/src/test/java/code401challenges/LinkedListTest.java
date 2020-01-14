package code401challenges;

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

//    @Test public void findHeadTest(){
//        LinkedList expected = new LinkedList();
//        expected.insert(70);
//        expected.insert(71);
//        expected.insert(72);
//        assertEquals(expected.head.value(72));
//    }

    @Test public void testStringLinkedList() {
        LinkedList actual = new LinkedList();
        actual.insert(20);
        actual.insert(30);
        actual.insert(40);

        String expected = "{40} -> {30} -> {20} -> NULL";
        assertTrue(expected.equals(expected.toString()));
    }

}
