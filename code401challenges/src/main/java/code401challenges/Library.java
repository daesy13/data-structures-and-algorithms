package code401challenges;

public class Library {
    public Library() {
    }

    public static int[] arrayShift(int[] args, int num) {
        return mid(args, num);
    }

    public static int[] mid(int[] arr, int num) {
        int len = arr.length + 1;
        int[] newArr = new int[len];
        int index = 0;
        int middle = (int)Math.ceil((double)((arr.length + 1) / 2));

        for(int i = 0; i < arr.length; ++i) {
            System.out.println(arr[i]);
            if (index == middle) {
                newArr[middle] = num;
                index = middle + 1;
                --i;
            } else if (index != middle) {
                newArr[index] = arr[i];
                ++index;
            }
        }

        return newArr;
    }
}
