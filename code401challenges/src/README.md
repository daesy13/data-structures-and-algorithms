# CODE CHALLENGE 6<a name="challenge 6"></a>
[LINK TO CODE](https://github.com/daesy13/data-structures-and-algorithms/blob/master/code401challenges/src/main/java/code401challenges/LinkedList.java)</br>
[LINK TO TEST](https://github.com/daesy13/data-structures-and-algorithms/blob/master/code401challenges/src/test/java/code401challenges/LinkedListTest.java)</br></br>
# Challenge Summary
Creating a methods to insert new linkedlist values, as well as adding before the target and after the target value.</br>

## Challenge Description
```.append(value)``` which adds a new node with the given value to the end of the list</br>
```.insertBefore(value, newVal)``` which add a new node with the given newValue immediately before the first value node</br>
```.insertAfter(value, newVal)``` which add a new node with the given newValue immediately after the first value node</br></br>

## Approach & Efficiency
**.append(value)**</br>
Mainly use while loop to iterate thru linkedlist, create a place holder for current value and compare until found last item with value null and add new node as next.</br>
**.insertBefore(target, value)**</br>
Used while current is not equal to target **value** then go to next.
if stops it will stops before hitting target, which is the node before the target, and proceed to add new node, and connect to the target node.</br>
**.insertAfter(target, value)**</br>
Used while current is not equal to target **node** then got to next.
if stops it will stops at target and proceed to add new node after the target.</br>

**Big O** is O(n)

## Solution
![challenge6](../src/assets/challenge6.jpg)

# CODE CHALLENGE 7<a name="challenge 7"></a>
[LINK TO CODE](https://github.com/daesy13/data-structures-and-algorithms/blob/master/code401challenges/src/main/java/code401challenges/LinkedList.java)</br>
[LINK TO TEST](https://github.com/daesy13/data-structures-and-algorithms/blob/master/code401challenges/src/test/java/code401challenges/LinkedListTest.java)</br></br>
# Challenge Summary
Creating a methods to insert a index location starting from the end of the LinkedList.</br>

## Challenge Description
Write a method for the Linked List class which takes a number, k, as a parameter. Return the node’s value that is k from the end of the linked list. You have access to the Node class and all the properties on the Linked List class as well as the methods created in previous challenges.</br></br>

## Approach & Efficiency
Do a while loop to count the length of the linked list. Once found the lenght of my linked list. Subtract the length of the linked list with the k value to find the k value. Which it will count the length minus k. After that do a while loop until it stops to the new length and will return the value in k.</br>

**Big O** is O(n)

## Solution
<!-- ![challenge7](../src/assets/challenge7.jpg) -->

# CODE CHALLENGE 12<a name="challenge 12"></a>
[LINK TO CODE](https://github.com/daesy13/data-structures-and-algorithms/tree/master/code401challenges/src/main/java/code401challenges/utilities)</br></br>
# Challenge Summary
Creating two Queue methods one enqueue to add new objects and another dequeue to delete the first item that enter previously .</br>

## Challenge Description
Create a class called AnimalShelter which holds only dogs and cats. The shelter operates using a first-in, first-out approach.</br>
Implement the following methods:
enqueue(animal): adds animal to the shelter. animal can be either a dog or a cat object.</br>
dequeue(pref): returns either a dog or a cat. If pref is not "dog" or "cat" then return null..</br></br>
/
**Big O** is O(n)

## Solution
<!-- ![challenge11.1](../src/assets/challenge11-1.jpg) -->
<!-- ![challenge11.2](../src/assets/challenge11-2.jpg) -->



