package code401challenges.mergeSort;

import java.util.Arrays;

public class MergeSort {
    public static int[] mergeSort(int[] arr){
        int n = arr.length;
        if (n == 0){
            throw new IllegalArgumentException("This array is empty, not able to perform with an empty array");
        }
        else if (n == 1){
            return arr;
        }

        else if (n > 1){
            int mid = n/2;
            // Ref: Michelle's code review
            int[] left = Arrays.copyOfRange(arr, 0, mid);
            int[] right = Arrays.copyOfRange(arr, mid, n);

            mergeSort(left);
            mergeSort(right);

            merge(left, right, arr);
        }
        return arr;
    }

    // Helper Method
    private static void merge(int[] left, int[] right, int[] arr){
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < left.length && j < right.length){
            if(left[i] < right[j]){
                arr[k] = left[i];
                k++;
                i++;
            } else {
                arr[k] = right[j];
                k++;
                j++;
            }
        }
        if(i == left.length){
            // add values in right
           while(k < arr.length){
               // ref: https://www.youtube.com/watch?v=yv6svAfoYik min=13:43
               arr[k++] = right[j++];
            }
           // add values in left
        } else {
            arr[k++] = left[i++];
        }
    }
}
