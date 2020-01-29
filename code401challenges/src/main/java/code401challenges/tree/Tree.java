package code401challenges.tree;

import java.util.ArrayList;

public class Tree {
    public Node root;

    public Tree(Node root){
        this.root = root;
    }

    // method overloading
    public Tree(){
        this.root = null;
    }

    // INORDER: Left, Root, Right
    private ArrayList<Integer> inOrder(Node node){
        if (node == null){
            return new ArrayList<>();
        }
        else {
            ArrayList<Integer> resultInOrder = new ArrayList<>();

            ArrayList<Integer> left = inOrder(node.left);
            resultInOrder.addAll(left);

            resultInOrder.add(node.value);

            ArrayList<Integer> right = inOrder(node.right);
            resultInOrder.addAll(right);

            return resultInOrder;
        }
    }


    // PREORDER: Root, Left, Right
    private ArrayList<Integer> preOrder(Node node){
        if (node == null){
            return new ArrayList<>();
        }
        else {
            ArrayList<Integer> result = new ArrayList<>();
            result.add(node.value);

            ArrayList<Integer> left = preOrder(node.left);
            result.addAll(left);

            ArrayList<Integer> right = preOrder(node.right);
            result.addAll(right);

            return result;
        }
    }

    // POSTORDER: Left, Right, Root
    private ArrayList<Integer> postOrder(Node node){
        if (node == null){
            return new ArrayList<>();
        }
        else {
            ArrayList<Integer> resultPostOrder = new ArrayList<>();

            ArrayList<Integer> left = postOrder(node.left);
            resultPostOrder.addAll(left);

            ArrayList<Integer> right = postOrder(node.right);
            resultPostOrder.addAll(right);

            resultPostOrder.add(node.value);

            return resultPostOrder;
        }
    }

    // Reference: https://tutorialedge.net/artificial-intelligence/breadth-first-search-java/
    private ArrayList<Integer> breadthFirst(Node node){
        ArrayList<Integer> resultBFS = new ArrayList<>();

        if (node == null){
            return new ArrayList<>();
        }
        else {
            if(node.left != null){
                resultBFS.add(node.left.value);
            }
            if(node.right!=null){
                resultBFS.add(node.right.value);
            }
        }
        return resultBFS;
    }
}
