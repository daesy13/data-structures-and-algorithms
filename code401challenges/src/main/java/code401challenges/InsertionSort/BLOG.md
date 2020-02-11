# Challenge Summary
Sort items in the array. 

[LINK TO CODE](https://github.com/daesy13/data-structures-and-algorithms/blob/master/code401challenges/src/main/java/code401challenges/linkedList/LinkedList.java)</br>

## Challenge Description
Selection Sort is a sortig algorithm that traverses the array multiple times as it slowly builds out the sorting sequence. The traversal keeps track of the minimum value and places it in the front of the array which should be incrimentally sorted.</br>

## Approach & Efficiency
Time: O(n^2)</br>
The basic operaiton of this algorithm is comparison. This will happen n number of times twice, because is using a nested loop. In conclusion the algorithm is going to be n squared.</br></br>

Space: O(1)</br>
No additional space is being created. This array is being sorted in place. Keeping the space at constant O(1).</br></br>

## Pseudo Code
```java
SelectionSort(int []arr)   
    DECLARE n <-- arr.Length; 
    FOR i = 0; i to n - 1  
        DECLARE min <-- i; 
        FOR j = i + 1 to n 
            if (arr[j] < arr[min]) 
                min <-- j; 
 
        DECLARE temp <-- arr[min]; 
        arr[min] <-- arr[i]; 
        arr[i] <-- temp; 
```  

## Solution
![sort](../src/assets/sort.jpg)</br></br><a href="#top">Back to top</a>
