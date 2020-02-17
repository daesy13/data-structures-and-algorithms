package code401challenges.quickSortTest;

import org.junit.Test;

import java.util.Arrays;

import static code401challenges.quickSort.QuickSort.quickSort;
import static org.junit.Assert.*;

public class QuickSortTest {

    // HAPPY TEST
    @Test
    public void quickSortTest(){
        int[] input = {8,4,23,42,16,15};
        int[] actual = quickSort(input,0,input.length-1);
        int[] expected = {4, 8, 15, 16, 23, 42};
        assertEquals(Arrays.toString(expected), Arrays.toString(actual));
    }

    // FAIL TEST
    @Test
    public void quickSortFailTest(){
        int[] input = {8,4,23,42,16,15};
        int[] actual = quickSort(input,0,input.length-1);
        assertNotEquals(input, Arrays.toString(actual));
    }

    // EDGE CASE
    @Test(expected = IllegalArgumentException.class)
    public void quickSortEdgeTest(){
        int[] input = {};
        int[] actual = quickSort(input);
        assertEquals(input, actual);
    }
}
