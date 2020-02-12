package code401challenges.mergeSort;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {
    public static List<Integer > mergeSort(List<Integer> arr){
        int n = arr.size();
        if (n > 1){
            int mid = n/2;
            List<Integer> left = arr.subList(0,mid);
            List<Integer> right = arr.subList(mid, n);

            mergeSort(left);
            mergeSort(right);

            merge(left, right, arr);
        }
        return arr;
    }

    private static void merge(List<Integer> left, List<Integer> right, List<Integer> arr){
        int i = 0;
        int j = 0;
        int k = 0;

        int leftSize = left.size();
        int rightSize = right.size();

        while (i < leftSize && j < rightSize){
            if(left.get(i) <= right.get(j)){
                arr.add(k,left.get(i));
                i++;
            } else {
                arr.add(k, right.get(j));
                j++;
            }
            k++;
        }
        if(i == leftSize){
            arr.addAll(right);
        } else {
            arr.addAll(left);
        }
    }
}
