package code401challenges.treeTest;

import code401challenges.tree.BinarySearchTree;
import code401challenges.tree.BinaryTree;
import code401challenges.tree.Node;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BinarySearchTreeTest {

    @Test
    public void binarySearchTreeTest(){
        Node root = new Node(6, new Node(5), new Node (7));
        BinaryTree tree = new BinaryTree(root);
        assertEquals(6, tree.root.value);
    }

    @Test
    public void binarySearchTreeAddTest(){
       Node newNode = new Node(10);
       BinarySearchTree tree = new BinarySearchTree(newNode);
       tree.add(20);
       tree.add(30);
       tree.add(40);
       tree.add(50);
       tree.add(60);
       assertTrue(tree.contains(tree.root,60));
    }
}