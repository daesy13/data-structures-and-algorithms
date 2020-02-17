# Challenge Summary
Merge Sort items from an array. 

[LINK TO CODE](https://github.com/daesy13/data-structures-and-algorithms/blob/master/code401challenges/src/main/java/code401challenges/mergeSort/mergeSort.java)</br>
[LINK TO TEST](https://github.com/daesy13/data-structures-and-algorithms/blob/master/code401challenges/src/test/java/code401challenges/mergeSortTest/mergeSortTest.java)</br>

## Challenge Description
Sort items from an array into a helper array dividing the array into equal parts recursevely.</br>

## Approach & Efficiency
Time: average n Log(n) & Worst Case O(n^2)</br>
The basic operaiton of this algorithm is comparison. This will happen n number of times twice, because is using a nested loop. In conclusion the algorithm is going to be n squared.</br></br>

Space: O(n)</br>
We are creating a new array to store new sorted array.</br></br>

## Pseudo Code
```java
ALGORITHM Mergesort(arr)
    DECLARE n <-- arr.length
           
    if n > 1
      DECLARE mid <-- n/2
      DECLARE left <-- arr[0...mid]
      DECLARE right <-- arr[mid...n]
      // sort the left side
      Mergesort(left)
      // sort the right side
      Mergesort(right)
      // merge the sorted left and right sides together
      Merge(left, right, arr)

ALGORITHM Merge(left, right, arr)
    DECLARE i <-- 0
    DECLARE j <-- 0
    DECLARE k <-- 0

    while i < left.length && j < right.length
        if left[i] <= right[j]
            arr[k] <-- left[i]
            i <-- i + 1
        else
            arr[k] <-- right[j]
            j <-- j + 1
            
        k <-- k + 1

    if i = left.length
       set remaining entries in arr to remaining values in right
    else
       set remaining entries in arr to remaining values in left
```  

## Solution
<img src="../../../../assets/mergeSort.jpg" alt="drawing" width="200"/>
<!-- ![sort](../../../../assets/mergeSort.jpg) -->
</br></br><a href="#top">Back to top</a>
