package code401challenges.graphTest;

import code401challenges.graph.Edge;
import code401challenges.graph.Graph;
import code401challenges.graph.Vertex;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;



public class GraphTest {

    @Test
    public void addNodeTest(){
        Graph input = new Graph();
        input.addNode(0);
        input.addNode(1);
        input.addNode(2);
        input.addNode(3);
        int actual =  input.getSize();
        int expected = 4;
        assertEquals(expected, actual);
    }



    @Test
    public void addEdgeTest(){
        Graph initial = new Graph();
        node1 = initial.addNode(0);
        initial.addNode(1);
        initial.addNode(2);
        initial.addNode(3);
//        Graph input = new Graph();
//        input.addEdge(0,1,10);
//        input.addEdge(1);
//        input.addEdge(2);
//        input.addEdge(3);
        int actual =  initial.getSize();
        int expected = 4;
        assertEquals(expected, actual);
    }

}
