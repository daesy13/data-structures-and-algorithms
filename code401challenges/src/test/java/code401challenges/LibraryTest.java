package code401challenges;

import org.junit.Assert;
import org.junit.Test;

public class LibraryTest {
    public LibraryTest() {
    }

    @Test
    public void testShiftArray() {
        int[] inputArr = new int[]{1, 2, 3};
        int[] expected = new int[]{1, 2, 9, 3};
        int[] actual = Library.arrayShift(inputArr, 9);
        Assert.assertArrayEquals(expected, actual);
    }
}