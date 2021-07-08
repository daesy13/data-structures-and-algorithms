package code401challenges.treeIntersection;

import code401challenges.tree.BinaryTree;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import static org.checkerframework.checker.units.qual.Prefix.one;

//Write a function called tree_intersection that takes two binary tree parameters.
//Without utilizing any of the built-in library methods available to your language,
//return a set of values found in both trees.
public class TreeIntersection {

    public static List<Integer> treeIntersection(BinaryTree treeOne, BinaryTree treeTwo){
        HashSet<Integer> treeValues = new HashSet<>(treeOne.preOrder(treeOne.root));

        List<Integer> matching = new ArrayList<>();

        ArrayList<Integer> treeTwoValues =  treeTwo.inOrder(treeTwo.root);

        for(int i = 0; i < treeTwoValues.size(); i++){

            if (treeValues.contains(treeTwoValues.get(i)) && !matching.contains(treeTwoValues.get(i))){
                    matching.add(treeTwoValues.get(i));
            }
        }
        return matching;
    }
}