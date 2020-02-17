//package code401challenges.quickSort;
//
//public class QuickSort {
//    public static void quickSort(int[]arr, int left, int right){
//        int position = partition(arr, left, right);
//        if(left < position-1){
//            quickSort(arr, left, right-1);
//        }
//        if(position < right){
//            quickSort(arr, position, right);
//        }
//    }
//
//    // this is a helper method for quickSort
//    public static int partition(int[] arr, int left, int right){
//        int pivot = arr[left + right]/2;
//        while (left <= right){
//            while (arr[left]< pivot){
//                left++;
//            }
//            while (arr[right] > pivot) {
//                right--;
//            }
//            if (left <= right) {
//                // it swap the elements at the specified positions in the specified list
//                swap(arr, left, right);
//                left++;
//                right--;
//            }
//        }
//        return left;
//    }
//}
