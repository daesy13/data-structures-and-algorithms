package code401challenges.treeTest;

import code401challenges.BinarySearch;
import code401challenges.tree.BinaryTree;
import code401challenges.tree.Node;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class BinaryTreeTest {

    // Reference: https://gist.github.com/samueltcsantos/2089ec68875f6f783a71
    // worked with TA: Jeff for this first constructorTest
    @Test
    public void constructorTest(){
        Node root = new Node(1, new Node(2), new Node (3));
        BinaryTree tree = new BinaryTree(root);
        ArrayList<Integer> actual = new ArrayList<>();
        assertEquals(1, root.value);
        assertEquals(2, root.left.value);
        assertEquals(3, root.right.value);
    }

    // INORDER: Left, Root, Right
    //      5
    //     / \
    //    4   6
    //   /     \
    //  1       7
    @Test
    public void inOrderTest(){
        Node root = new Node(5,
                new Node(4),
                new Node(6));
        Node branch1 = new Node(1);
        Node branch2 = new Node(7);
        root.left.left = branch1;
        root.right.right = branch2;
        // create a tree passing the root node
        BinaryTree result = new BinaryTree(root);
        // assign actual as an ArrayList result with the method inOrder and pass the root node
        ArrayList<Integer> actual = result.inOrder(result.root);
        // create an ArrayList the expected output for the ArrayList
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1, 4, 5, 6, 7));
        assertEquals(expected , actual);
    }

    // PREORDER: Root, Left, Right
    //      5
    //     / \
    //    4   6
    //   /     \
    //  1       7
    @Test
    public void preOrderTest(){
        Node root = new Node(5,
                new Node(4),
                new Node(6));
        Node branch1 = new Node(1);
        Node branch2 = new Node(7);
        root.left.left = branch1;
        root.right.right = branch2;
        BinaryTree result = new BinaryTree(root);
        ArrayList<Integer> actual = result.preOrder(result.root);
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(5,4,1,6,7));
        assertEquals(expected, actual);
    }

    // POSTORDER: Left, Right, Root
    //      5
    //     / \
    //    4   6
    //   /     \
    //  1       7
    @Test
    public void postOrderTest(){
        Node root = new Node(5,
                new Node(4),
                new Node(6));
        Node branch1 = new Node(1);
        Node branch2 = new Node(7);
        root.left.left = branch1;
        root.right.right = branch2;
        BinaryTree result = new BinaryTree(root);
        ArrayList<Integer> actual = result.postOrder(result.root);
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1,4,7,6,5));
        assertEquals(expected, actual);
    }

    // HAPPY TEST
    @Test
    public void maxValueTest(){
        Node root = new Node(1, new Node(2), new Node (3));
        BinaryTree tree = new BinaryTree(root);
        int actual = tree.findMaximumValue();
        assertEquals(3,actual);
    }

    //FAIL TEST
    @Test
    public void maxValueWrongValueTest(){
        Node root = new Node(1, new Node(2), new Node (3));
        BinaryTree tree = new BinaryTree(root);
        int actual = tree.findMaximumValue();
        assertNotEquals(4,actual);
    }
}
