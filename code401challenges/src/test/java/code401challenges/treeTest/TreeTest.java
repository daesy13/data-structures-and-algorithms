package code401challenges.treeTest;

import code401challenges.tree.Node;
import code401challenges.tree.Tree;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TreeTest {
    @Test
    public void constructorTest(){
        Node root = new Node(1, new Node(2), new Node (3));
        Tree tree = new Tree(root);
    }

    // maxValueTest
    @Test
    public void maxValueTest(){
        Node root = new Node(1, new Node(2), new Node (3));
        Tree tree = new Tree(root);
        int actual = tree.findMaximumValue();
        assertEquals(3,actual);
    }
}
