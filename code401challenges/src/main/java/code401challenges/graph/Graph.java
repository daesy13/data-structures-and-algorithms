package code401challenges.graph;

// Reference: https://www2.cs.duke.edu/courses/cps100e/fall10/class/11_Bacon/code/Graph.html
// Reference: https://www.geeksforgeeks.org/graph-and-its-representations/

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Graph<E> {
    private Map<Node, Set<Node>> vertices;

    public Graph(){
        vertices = new HashMap<>();
    }
// AddNode()
//Adds a new node to the graph
//Takes in the value of that node
//Returns the added node
    public Node addNode(E value){
        Node newNode;
        if (value != null){
            newNode = new Node(value);
            vertices.putIfAbsent(newNode, new HashSet<>());
            return newNode;
        }
        return null;
    }
}
