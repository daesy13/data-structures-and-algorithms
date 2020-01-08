import java.util.Arrays;

public class ArrayReverse {
  public static void main (String[] args) {
    // create the array to test your code on later
    int[] startArr = new int[] {1,2,3,4,5,10};
    // print it out, nicely
    System.out.println(Arrays.toString(startArr));
    // call your reverseArray method and save the result in a variable
    int[] endArr = reverseArray(startArr);
    // print out the result, nicely
    System.out.println(Arrays.toString(endArr));
  }
  // the method you should write, to reverse an array
  public static int[] reverseArray(int[] inputArray) {
    int numlength = inputArray.length - 1;
    int[] newArr = new int[inputArray.length];
    int index = 0;
    if (numlength == 1 || numlength == 0){
     return inputArray;
    }
    else if (numlength > 1){
      for (int i = numlength; i >= 0; i-- ){
        newArr[index] = inputArray[i];
        index++;
      }
      return newArr;
    }
    return new int[0];
  }
}