package code401challenges.utilities;

// Write a function called FizzBuzzTree which takes a tree as an argument.
// Without utilizing any of the built-in methods available to your language, determine whether or not the value of
// each node is divisible by 3, 5 or both. Create a new tree with the same structure as the original, but the values modified as follows:
// If the value is divisible by 3, replace the value with “Fizz”
// If the value is divisible by 5, replace the value with “Buzz”
// If the value is divisible by 3 and 5, replace the value with “FizzBuzz”
// If the value is not divisible by 3 or 5, simply turn the number into a String.
// Return the new tree.

import code401challenges.tree.Node;
import code401challenges.tree.Tree;

public class FizzBuzzTree extends Tree {

    public FizzBuzzTree(Node<String> root) {
        super(root);
    }

    // create a helper method
    public void process(Node<String> node){
        int num = Integer.parseInt(node.value);
        if(num % 15 == 0 ){
            node.value = "FizzBuzz";
        }
        else if (num % 3 == 0){
            node.value = "Fizz";
        }
        else if (num % 5 == 0){
            node.value = "Buzz";
        }
    }

    public void fizzBuzzTree() {
        fizzBuzzTree(this.root);
    }

    private void fizzBuzzTree(Node<String> node) {
        if (node ==  null){
            return;
        }
        process(node);
        fizzBuzzTree(node.left);
        fizzBuzzTree(node.right);
    }
}

// NICK'S CODE
public class FizzBuzz {
    public BinaryTree<String> fizzbuzz(BinaryTree<String> original){
        BinaryTree<String> sapling = new BinaryTree<String>();
        sapling.root = traverse(sapling.root);
        return sapling;
    }
//begin boiler plate
    public Node traverse(Node me){
        if(me == null){
            return null;
        }
        //end boiler plate
        Node leftNodes = traverse(me.left);
        Node rightNodes = traverse(me.right);

        // i want to make a new tree and submmit fizzbuzz in there
//        System.out.println(me.value);
        Node<String> newNode =  new Node();
        newNode.value = fizzbuzz(me.value);
        newNode.left = leftNodes;
        newNode.right = rightNodes;
        return newNode;

        // my values on the left


    }

    private String fizzbuzz(String number){
        int num = Integer.parseInt(number);
        if(num % 15 == 0) {
            return "fizzbuzz";
        }
        if(num % 3 == 0){
            return "fizz";
        }
        if(num%5==0){
            return "buzz";
        }
        else{
            return number;
        }
    }

}
