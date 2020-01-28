package code401challenges.treeTest;

import code401challenges.tree.Node;
import code401challenges.tree.Tree;
import org.junit.Test;

public class TreeTest {
    @Test
    public void constructorTest(){
        Node root = new Node(1, new Node(2), new Node (3));
        Tree tree = new Tree(root);
    }
}
