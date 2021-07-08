package code401challenges;

public class BinarySearch {
    public static float binarySearch(int[] args, int item) {
        int first = 0;
        int last = args.length-1;

        while(first <= last){
            int middle = (first + last)/2;
            if (args[middle] == item){
                return middle;
            }
            else if (item < args[middle]){
                last = middle - 1;
            }
            else if (item > args[middle]){
                first = middle + 1;
            }
        }
        return -1;
    }
}
