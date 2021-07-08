package code401challenges.treeIntersection;

public class Node {
    public int value;
    public Node left;
    public Node right;

    // constructor
    public Node(){
    }

    // constructor
    public Node(int value){
        this.value = value;
    }

    // method overloading
    public Node(int value, Node leftNode, Node rightNode){
        this.value = value;
        this.left = leftNode;
        this.right = rightNode;
    }


}
