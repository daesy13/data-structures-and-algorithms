package code401challenges.treeIntersectionTest;

import code401challenges.tree.BinarySearchTree;
import static code401challenges.treeIntersection.TreeIntersection.*;
import code401challenges.tree.BinaryTree;
import code401challenges.tree.Node;
import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TreeIntersectionTest {
    @Test
    public void treeIntersectionTest(){
        Node rootOne = new Node(6, new Node(5, new Node (4), new Node (10)), new Node (7, new Node(6), new Node (11)));
        BinaryTree treeOne = new BinaryTree(rootOne);
        Node rootTwo = new Node(6, new Node(2, new Node (4), new Node (10)), new Node (7, new Node(6), new Node (11)));
        BinaryTree treeTwo = new BinaryTree(rootTwo);

        List<Integer> actual = treeIntersection(treeOne,treeTwo);
        System.out.println("actual = " + actual);
//        List<Integer> expected = new ArrayList<>();
//        expected.add(4);
//        expected.add(10);
//        expected.add(6);
//        expected.add(3);
//        expected.add(7);
//        expected.add(11);
//        assertEquals(expected, actual);
    }
}
