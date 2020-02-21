package code401challenges.treeIntersection;

public class Node {
    public int value;

    public Node root;
    public Node left;
    public Node right;

    // constructor
    public Node(){
        this.value = value;
    }

    // constructor
    public Node(int value){
        this.value = value;
        this.left = left;
        this.right = right;
    }

    // method overloading
    public Node(int value, Node leftNode, Node rightNode){
        this.value = value;
        this.left = leftNode;
        this.right = rightNode;
    }
}
