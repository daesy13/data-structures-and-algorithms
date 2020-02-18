package code401challenges.hashtableTest;

import code401challenges.hashtable.Hashtable;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class HashtableTest {

    @Test
    public void addTest(){
        Hashtable input = new Hashtable(3);
        input.add("Mary", "student1");
        input.add("Jim", "student2");
        input.add("Joe", "student3");
        input.add("Paul", "student4");
        input.add("Paola", "student5");
        input.add("Apple", "student6");
        int actual = input.map.length;
        assertEquals(3, actual);
    }

    @Test
    public void getTest(){
        Hashtable input = new Hashtable(5);
        input.add("Mary", "student1");
        input.add("Jim", "student2");
        input.add("Joe", "student3");
        input.add("Paul", "student4");
        input.add("Paola", "student5");
        input.add("Apple", "student6");
        String actual = input.get("Mary");
        assertEquals("student1", actual);
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
