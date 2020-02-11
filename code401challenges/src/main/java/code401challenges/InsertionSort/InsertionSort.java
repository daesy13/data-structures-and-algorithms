package code401challenges.InsertionSort;
public class InsertionSort {
    public static void insertionSort(int []arr){
        if(arr.length == 0){
            throw new IllegalArgumentException("This array is empty, not able to perform with empty arrays");
        }
        for (int i=0; i<arr.length; i++){
            for (int j=1; j<arr.length-1; j++){
                if (arr[j]> arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    // Ref.:https://www.geeksforgeeks.org/bubble-sort/
}
