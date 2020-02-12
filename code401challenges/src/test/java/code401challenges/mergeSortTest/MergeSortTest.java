package code401challenges.mergeSortTest;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static code401challenges.mergeSort.MergeSort.mergeSort;

public class MergeSortTest {
    @Test
    public void mergeSortTest(){
        List<Integer> inputList = new ArrayList<>();
        inputList.add(8);
        inputList.add(4);
        inputList.add(23);
        inputList.add(42);
        inputList.add(16);
        inputList.add(15);
        System.out.println("inputList = " + inputList);
        List<Integer> actual = mergeSort(inputList);
//        System.out.println("actual = " + actual);
    }
}
