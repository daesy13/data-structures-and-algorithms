package code401challenges.treeIntersection;

import code401challenges.tree.BinaryTree;

import java.util.ArrayList;
import java.util.HashSet;

import static org.checkerframework.checker.units.qual.Prefix.one;

//Write a function called tree_intersection that takes two binary tree parameters.
//Without utilizing any of the built-in library methods available to your language,
//return a set of values found in both trees.
public class TreeIntersection {
    public Node root;

    // helper method

    public HashSet<Integer> preOrder(Node node){
        if (node == null){
            return new HashSet<>();
        }
        else {
            HashSet<Integer> result = new HashSet<>();
            result.add(node.value);

            HashSet<Integer> left = preOrder(node.left);
            result.addAll(left);

            HashSet<Integer> right = preOrder(node.right);
            result.addAll(right);

            return result;
        }
    }

//    public HashSet<Integer> treeIntersection(Node rootOne, Node rootTwo){

//        public ArrayList<Integer> compare(Tree one, Tree two)
//
//        if (rootOne == null || rootTwo == null){
//            return new HashSet<>();
//        }
//
//        HashSet<Integer> treeOne = preOrder(rootOne);
//        HashSet<Integer> treeTwo = preOrder(rootTwo);
//
//        for (int item : treeOne) {
//            for (int val: treeTwo){
//
//            }
//        }
//        return new HashSet<>();
//    }
}