# Challenge Summary
This code challenge we have to insert a number in the middle of the array using Java. For this we had to create a new array and input the new information plus the extra integer in it.

## Challenge Description
Write a function called insertShiftArray which takes in an array and the value to be added. Without utilizing any of the built-in methods available to your language, return an array with the new value added at the middle index.

## Approach & Efficiency
Created a function that takes an array and an integer. In the function, we created an empty array. Then look for the middle point in order to find the new index position to be able to add the new element. We then iterate through the argument array and go thru each item in that array and add it into the new empty array. We also added a condition that if the middle position is equal the argument index to skip but at the same time we subtract the i minus one so it doesn't skip the element of the argument array, and it will keep the order of the argument array and is able to add the element given in the middle of the new array.

## Solution
![whiteboard]('/assets/Image from iOS (3).jpg')