package code401challenges.utilities;
// Create a class called AnimalShelter which holds only dogs and cats. 
// The shelter operates using a first-in, first-out approach.
// Implement the following methods:
// enqueue(animal): adds animal to the shelter. animal can be either a dog or a cat object.
// dequeue(pref): returns either a dog or a cat. If pref is not "dog" or "cat" 
// then return null.

import code401challenges.stacksandqueues.Queue;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class AnimalShelterTest {

    AnimalShelter shelter = new AnimalShelter();

    Animal cat1 = new Cat("bunny");
    Animal cat2 = new Cat("bunny2");
    Animal dog1 = new Dog("Sylvester");
    Animal dog2 = new Dog("Sylvester2");

    @Test
    public void enqueueTest(){
        shelter.enqueue((Cat) cat1);
        shelter.enqueue((Cat) cat2);
        shelter.enqueue((Dog) dog1);
        shelter.enqueue((Dog) dog2);
        Animal actual = shelter.dequeue("cat");
        assertEquals(cat1, actual);
    }

    @Test
    public void dequeueTest(){
        shelter.enqueue((Cat) cat1);
        shelter.enqueue((Cat) cat2);
        shelter.enqueue((Dog) dog1);
        shelter.enqueue((Dog) dog2);
        shelter.dequeue("dog");
        Animal actual = shelter.dequeue("dog");
        assertEquals(dog2 , actual);
    }

    // Used Illegal Exception for empty QUEUES

}
