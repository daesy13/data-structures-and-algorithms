package code401challenges.InsertionSortTest;

import code401challenges.InsertionSort.InsertionSort;
import org.junit.Test;

import java.util.Arrays;

import static code401challenges.InsertionSort.InsertionSort.insertionSort;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class InsertionSortTest {

    // HAPPY TEST
    @Test
    public void insertionSortTest(){
        int[] input = {9,5,4,11,25,45};
        int[] actual = insertionSort(input);
        int[] expected = {4, 5, 9, 11, 25, 45};
//        System.out.println("actual = " + Arrays.toString(actual));
        assertEquals(Arrays.toString(expected), Arrays.toString(actual));
    }

    // FAIL TEST
    @Test
    public void insertionFailTest(){
        int[] input = {9,5,4,11,25,45};
        int[] actual = insertionSort(input);
        int[] expected = {9,5,4,11,25,45};
//        System.out.println("actual = " + Arrays.toString(actual));
        assertNotEquals(Arrays.toString(expected), Arrays.toString(actual));
    }

    // EDGE CASE
    @Test
    public void insertionEdgeTest(){
        int[] input = {};
        int[] actual = insertionSort(input);
        System.out.println("actual = " + actual);
//        int[] expected = {9,5,4,11,25,45};
//        System.out.println("actual = " + Arrays.toString(actual));
        assertNotEquals("This array is empty, not able to perform with empty arrays\n", actual);
    }
}
