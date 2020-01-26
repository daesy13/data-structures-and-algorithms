### DATA STRUCTURE
[CODE CHALLENGE 6](#challenge-6)</br>
[CODE CHALLENGE 7](#challenge-7)</br>
[CODE CHALLENGE 8](#challenge-8)</br>
[CODE LAB 10](#lab-10)</br>
[CODE CHALLENGE 12](#challenge-12)</br></br></br>


<a name="challenge-6">CODE CHALLENGE 6</a></br></br>
[LINK TO CODE](https://github.com/daesy13/data-structures-and-algorithms/blob/master/code401challenges/src/main/java/code401challenges/linkedList/LinkedList.java)</br>
[LINK TO TEST](https://github.com/daesy13/data-structures-and-algorithms/blob/master/code401challenges/src/test/java/code401challenges/linkedList/LinkedListTest.java)</br></br>

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
![challenge6](../src/assets/challenge6.jpg)</br></br>

<a name="challenge-7">CODE CHALLENGE 7</a></br></br>
[LINK TO CODE](https://github.com/daesy13/data-structures-and-algorithms/blob/master/code401challenges/src/main/java/code401challenges/linkedList/LinkedList.java)</br>
[LINK TO TEST](https://github.com/daesy13/data-structures-and-algorithms/blob/master/code401challenges/src/test/java/code401challenges/linkedList/LinkedListTest.java)</br></br>

# Challenge Summary
Creating a methods to insert a index location starting from the end of the LinkedList.</br>

## Challenge Description
Write a method for the Linked List class which takes a number, k, as a parameter. Return the node’s value that is k from the end of the linked list. You have access to the Node class and all the properties on the Linked List class as well as the methods created in previous challenges.</br></br>

## Approach & Efficiency
Do a while loop to count the length of the linked list. Once found the lenght of my linked list. Subtract the length of the linked list with the k value to find the k value. Which it will count the length minus k. After that do a while loop until it stops to the new length and will return the value in k.</br>

**Big O** is O(n)

## Solution
![challenge7](../src/assets/challenge7.jpg)</br></br>

<a name="challenge-8">CODE CHALLENGE 8</a></br></br>
[LINK TO CODE](https://github.com/daesy13/data-structures-and-algorithms/blob/master/code401challenges/src/main/java/code401challenges/linkedList/LinkedList.java)</br>
[LINK TO TEST](https://github.com/daesy13/data-structures-and-algorithms/blob/master/code401challenges/src/test/java/code401challenges/linkedList/LinkedListTest.java)</br></br>

# Challenge Summary
Creating a methods that takes two LinkedList and merge into one LinkedList.</br>

## Challenge Description
Write a function called mergeLists which takes two linked lists as arguments. Zip the two linked lists together into one so that the nodes alternate between the two lists and return a reference to the head of the zipped list. Try and keep additional space down to O(1). You have access to the Node class and all the properties on the Linked List class as well as the methods created in previous challenges.</br></br>

## Approach & Efficiency
Create a recursion that goes to each node and assign the next to be the first node from the second linked list.</br>

**Big O** is O(n)

## Solution
![challenge8](../src/assets/challenge8.jpg)</br></br>

<a name="lab-10">LAB 10</a></br></br>
[LINK TO CODE](https://github.com/daesy13/data-structures-and-algorithms/tree/master/code401challenges/src/main/java/code401challenges/stacksandqueues)</br>
[LINK TO TEST](https://github.com/daesy13/data-structures-and-algorithms/tree/master/code401challenges/src/test/java/code401challenges/stacksandqueues)</br></br>

# Lab Summary
Creating methods to add Nodes and delete nodes from class Stack and Queue with their respective logic.</br>

## Lab Description
* Create a Node class that has properties for the value stored in the Node, and a pointer to the next node.
* Create a Stack class that has a top property. It creates an empty Stack when instantiated.
  * This object should be aware of a default empty value assigned to top when the stack is created.
  * Define a method called push which takes any value as an argument and adds a new node with that value to the top of the stack with an O(1) Time performance.
  * Define a method called pop that does not take any argument, removes the node from the top of the stack, and returns the node’s value.
  * Define a method called peek that does not take an argument and returns the value of the node located on top of the stack, without removing it from the stack.
  * Define a method called isEmpty that does not take an argument, and returns a boolean indicating whether or not the stack is empty.
* Create a Queue class that has a front property. It creates an empty Queue when instantiated.
This object should be aware of a default empty value assigned to front when the queue is created.
  * Define a method called enqueue which takes any value as an argument and adds a new node with that value to the back of the queue with an O(1) Time performance.
  * Define a method called dequeue that does not take any argument, removes the node from the front of the queue, and returns the node’s value.
  * Define a method called peek that does not take an argument and returns the value of the node located in the front of the queue, without removing it from the queue.
  * Define a method called isEmpty that does not take an argument, and returns a boolean indicating whether or not the queue is empty.
* Any exceptions or errors that come from your code should be semantic, capturable errors. For example, rather than a default error thrown by your language, your code should raise/throw a custom, semantic error that describes what went wrong in calling the methods you wrote for this lab.
* Be sure to follow your languages best practices for naming conventions.</br></br>

<a name="challenge-12">CODE CHALLENGE 12</a></br></br>
[LINK TO CODE](https://github.com/daesy13/data-structures-and-algorithms/tree/master/code401challenges/src/main/java/code401challenges/utilities)</br></br>
# Challenge Summary
Creating two Queue methods one enqueue to add new objects and another dequeue to delete the first item that enter previously .</br>

## Challenge Description
Create a class called AnimalShelter which holds only dogs and cats. The shelter operates using a first-in, first-out approach.</br>
Implement the following methods:
enqueue(animal): adds animal to the shelter. animal can be either a dog or a cat object.</br>
dequeue(pref): returns either a dog or a cat. If pref is not "dog" or "cat" then return null..</br></br>

**Big O** is O(n)

## Solution
![challenge11.1](../src/assets/challenge11-1.jpg)
![challenge11.2](../src/assets/challenge11-2.jpg)</br></br>



