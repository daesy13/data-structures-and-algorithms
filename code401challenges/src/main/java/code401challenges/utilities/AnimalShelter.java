package code401challenges.utilities;

import code401challenges.stacksandqueues.Queue;
import org.checkerframework.checker.units.qual.A;

public class AnimalShelter {
    public Queue<Cat> catQueue;
    public Queue<Dog> dogQueue;

    public AnimalShelter() {
        catQueue = new Queue<>();
        dogQueue = new Queue<>();
    }

    // this is overload
    public void enqueue(Dog dog){
        dogQueue.enqueue(dog);
    }

    public void enqueue(Cat cat){
        catQueue.enqueue(cat);
    }

    public Animal dequeue(String preference){
        if (preference.toLowerCase().equals("cat")){
            return catQueue.dequeue();
        }
        else if (preference.toLowerCase().equals("dog")){
            return dogQueue.dequeue();
        }
        throw new IllegalArgumentException("should be a cat or dog");
    }

}

