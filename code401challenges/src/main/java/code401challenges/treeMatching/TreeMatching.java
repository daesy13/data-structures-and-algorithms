package code401challenges.treeMatching;

import code401challenges.linkedList.Node;
import code401challenges.stacksandqueues.Stack;
import code401challenges.tree.BinaryTree;

import java.util.ArrayList;

public class TreeMatching {
    public static ArrayList<Integer> matching(BinaryTree one, BinaryTree two){
        ArrayList<Integer> matchingValues = new ArrayList<>();

        Stack<Node> nodes = new Stack<>();
        Node first = new Node(3);
        one.root=first;
//        nodes.
 
        while (!nodes.empty()){
            Node temp = nodes.pop();
            matchingValues.add(temp.value);
            if(temp.left != null){
                nodes.add(temp.left);
            }
            if(temp.right != null){
                nodes.add(temp.right);
            }
        }

        nodes.add(two.root);

        while(!nodes.empty()){
            Node temp = nodes.pop();
            if(matchingValues.contains(temp.value)){
                sameVals.add(temp.value);
            }
            if(temp.left != null){
                nodes.add(temp.left);
            }
            if(temp.right != null){
                nodes.add(temp.right);
            }
        }

        return matchingValues;

    }
}
