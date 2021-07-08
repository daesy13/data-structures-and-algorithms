package code401challenges.tree;

// Create a Node class that has properties for the value
// stored in the node, the left child node,
// and the right child node.

public class Node {
    public int value;
    public Node left;
    public Node right;

    // constructor
    public Node(){
        this.value = value;
    }

    // constructor
    public Node(int value){
        this.value = value;
        this.left = null;
        this.right = null;
    }

    // method overloading
    public Node(int value, Node leftNode, Node rightNode){
        this.value = value;
        this.left = leftNode;
        this.right = rightNode;
    }




}
