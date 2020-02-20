package code401challenges.hashtableTest;

import code401challenges.hashtable.Hashtable;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class HashtableTest {

    @Test
    public void addTest(){
        Hashtable input = new Hashtable(3);
        input.add("Mary", "student1");
        input.add("Jim", "student2");
        input.add("Joe", "student3");
        Boolean actual1 = input.contains("Mary");
        assertEquals(true, actual1);
        Boolean actual2 = input.contains("Jim");
        assertEquals(true, actual2);
        Boolean actual3 = input.contains("Joe");
        assertEquals(true, actual3);
    }

    @Test
    public void getTest(){
        Hashtable<String, String> input = new Hashtable<>(5);
        input.add("Mary", "student1");
        input.add("Jim", "student2");
        input.add("Joe", "student3");
        input.add("Paul", "student4");
        input.add("Paola", "student5");
        input.add("Apple", "student6");
        String actual = input.get("Jim");
        assertEquals("student2", actual);
    }

    @Test
    public void containsTest(){
        Hashtable input = new Hashtable(5);
        input.add("Mary", "student1");
        input.add("Jim", "student2");
        input.add("Joe", "student3");
        input.add("Paul", "student4");
        input.add("Paola", "student5");
        input.add("Apple", "student6");
        boolean actual = input.contains("Apple");
        assertTrue(actual);
    }

}
