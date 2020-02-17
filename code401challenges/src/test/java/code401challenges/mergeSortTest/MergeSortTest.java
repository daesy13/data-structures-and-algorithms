package code401challenges.mergeSortTest;

import org.junit.Test;
import java.util.Arrays;

import static code401challenges.InsertionSort.InsertionSort.insertionSort;
import static code401challenges.mergeSort.MergeSort.mergeSort;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class MergeSortTest {

    // HAPPY TEST
    @Test
    public void mergeSortTest(){
        int[] inputList = {8, 4, 23, 42 , 16, 15};
        int[] actual = mergeSort(inputList);
        int[] expected = {4, 8, 15, 16, 23, 42};
        assertEquals(Arrays.toString(expected), Arrays.toString(actual));
    }

    // FAIL TEST
    @Test
    public void mergeSortFailTest(){
        int[] inputList = {8, 4, 23, 42 , 16, 15};
        int[] actual = mergeSort(inputList);
        assertNotEquals(Arrays.toString(inputList), actual);
    }

    // EDGE CASE
    @Test
    public void edgeCaseMergeSortTest(){
        int[] inputList = {99};
        int[] actual = mergeSort(inputList);
        assertEquals(Arrays.toString(inputList), Arrays.toString(actual));
    }

    @Test(expected = IllegalArgumentException.class)
    public void mergeSortEdgeTest(){
        int[] input = {};
        int[] actual = insertionSort(input);
        assertEquals(input, actual);
    }
}
