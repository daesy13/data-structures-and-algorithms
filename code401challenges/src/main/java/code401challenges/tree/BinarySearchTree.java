package code401challenges.tree;

// Create a BinarySearchTree class
// Define a method named add that accepts a value, and adds a new node with that value in the correct location in the
// binary search tree.
// Define a method named contains that accepts a value, and returns a boolean indicating whether or not the value is
// in the tree at least once.
// ******
// The left subtree of a node contains only nodes with keys lesser than the node’s key.
// The right subtree of a node contains only nodes with keys greater than the node’s key.
// The left and right subtree each must also be a binary search tree.
// There must be no duplicate nodes.

public class BinarySearchTree {
    public Node root;

    public BinarySearchTree(Node root){
        this.root = root;
    }

    // method overloading
    public BinarySearchTree(){
        this.root = null;
    }


    // Reference: https://www.geeksforgeeks.org/binary-search-tree-set-1-search-and-insertion/
    // Nicholas video Monday 01/28: https://drive.google.com/file/d/13eqIR6DkP2ugd4C77lfb7jCMrud7t-S8/view
    // wrapper method
    public void add(int key){
        // method to call recursive method add
        this.root = add(this.root, key);
    }

    // prevents anyone from calling add in an unintended way
    // overloading method
    public Node add(Node root, int value){
        // if the tree is empty return the new value
        if (root == null){
            // this case solves insert being called on an empty tree
            root = new Node(value);
            return root;
        }
        else if(value < root.value){
            root.left = add(root.left, value);
        }
        else if (value > root.value){
            root.right = add(root.right, value);
        }
        return root;
    }

    public boolean contains(Node root, int value){
        if (root == null){
            return false;
        }
        if (root.value == value){
            return true;
        }
        if(root.value >= value){
            return contains(root.left, value);
        }
        return contains(root.right, value);
    }
}
