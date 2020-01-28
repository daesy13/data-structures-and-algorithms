//package code401challenges.tree;
//
//import java.util.ArrayList;
//
//public class BinaryTree {
//    public Node root;
//
//    public BinarySearchTree(){
//        this.root = null;
//    }
//
//    // constructor overloading
//    public BinarySearchTree(Node <E> root){
//        this.root = root;
//    }
//
//    public ArrayList<E> preOrder(Node <E> root){
//        ArrayList<E> temporary = new ArrayList<E>();
//        if (root != null){
//            temporary.add((E) root.left);
//            preOrder(root.left);
//            temporary.add((E) root.right);
//            preOrder(root.right);
//        }
//        return temporary;
//    }
//
//
//    public ArrayList<E> inOrder(Node <E> root){
//        ArrayList<E> temporary = new ArrayList<E>();
//        if (root != null){
//            temporary.add(root.left.value);
//            preOrder(root.left);
//            temporary.add(root.right.value);
//            preOrder(root.right);
//        }
//        return temporary;}
//
//    //reference: https://stackoverflow.com/questions/529085/how-to-create-a-generic-array-in-java
//    public ArrayList<E> postOrder(Node <E> root){}
//}
