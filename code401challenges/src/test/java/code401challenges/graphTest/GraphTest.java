package code401challenges.graphTest;

import code401challenges.graph.Edge;
import code401challenges.graph.Graph;
import code401challenges.graph.Vertex;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;



public class GraphTest {

    Graph<Integer> input;

    @Before
    public void initGraph() {
        input = new Graph<Integer>();
        input.addNode(0);
        input.addNode(1);
        input.addNode(2);
        input.addNode(3);
    }

    @Test
    public void addNodeTest(){
        int actual =  input.getSize();
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    public void addEdgeTest(){
        // ******When adding edge is asking for Vertex input instead of integer******
//        input.addEdge(0, 1,100);
    }

}
