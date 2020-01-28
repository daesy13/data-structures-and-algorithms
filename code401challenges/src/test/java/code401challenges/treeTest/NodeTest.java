package code401challenges.treeTest;

import code401challenges.tree.Node;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NodeTest {
    @Test public void nodeTest(){
        Node actual = new Node(10, new Node(20), new Node(3));
        assertEquals(10, actual.value);
    }
}
