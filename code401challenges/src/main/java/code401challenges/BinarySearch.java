package code401challenges;

public class BinarySearch {

    public static void main(int[] args){
        int[] newArr = {4,8,15,16,23,42};
//        binarySearch(newArr, 15);
        System.out.println(binarySearch(newArr, 15));
    }

    public static float binarySearch(int[] args, int item) {
        int first = 0;
        int last = args.length-1;
        int middle = (first + last)/2;

        while(first <= last){
            if (args[middle] < item){
                first = middle + 1;
            }
            else if (args[middle] == item){
                return middle;
            }
            else if (args[middle] >= item){
                last = middle - 1;
            }

        }
        return -1;
    }
}
