package code401challenges.utilities;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class FizzBuzzTreeTest {

    FizzBuzzTree node;

    @Before
    public void setUp(){
        node = new FizzBuzzTree();
        node.root = new FizzBuzzNode("3", null, null);
        node.root.left = new FizzBuzzNode("15", null, null);
        node.root.right = new FizzBuzzNode("14", null, null);
    }

    // HAPPY TEST
    @Test
    public void fizzBuzzTest(){
        assertEquals("15", node.root.left.value);
        assertEquals("3", node.root.value);
        assertEquals("14", node.root.right.value);
    }

    // FAIL TEST
    @Test
    public void failFizzBuzzTest(){
        assertNotEquals(7, node.root.value);
    }


    @Test
    public void stringFizzBuzzTest(){
        assertNotEquals("FizzBuzz", node.root.left);
    }
}

