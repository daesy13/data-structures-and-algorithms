package code401challenges;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;


public class BinarySearchTest {
    @Test public void binarySearchTest() {
        int[] inputArr = new int[]{4, 8, 15, 16, 23, 42};
        int expected = 2;
        int actual = (int)BinarySearch.binarySearch(inputArr, 15);
        assertEquals(expected, actual);
    }

    @Test public void binarySearchNonFoundTest() {
        int[] inputArr = new int[]{11,22,33,44,55,66,77};
        int expected = -1;
        int actual = (int)BinarySearch.binarySearch(inputArr, 90);
        assertEquals(expected, actual);
    }
}

