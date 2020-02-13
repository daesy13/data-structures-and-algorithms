package code401challenges.InsertionSort;
public class InsertionSort {
    public static int[] insertionSort(int []arr){
        if(arr.length == 0){
            throw new IllegalArgumentException("This array is empty, not able to perform with empty arrays");
        }
        for (int i=1; i<arr.length; i++){
            int temp = arr[i];
            int j=i-1;
            while (j >= 0 && temp < arr[j]) {
                arr[j + 1] = arr[j];
                j=j-1;
            }
            arr[j + 1] = temp;
            }
        return arr;
    }
}
    // Ref.:https://www.geeksforgeeks.org/bubble-sort/


// InsertionSort(int[] arr)
//
//    FOR i = 1 to arr.length
//
//      int j <-- i - 1
//      int temp <-- arr[i]
//
//      WHILE j >= 0 AND temp < arr[j]
//        arr[j + 1] <-- arr[j]
//        j <-- j - 1
//
//      arr[j + 1] <-- temp