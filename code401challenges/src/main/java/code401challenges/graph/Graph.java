package code401challenges.graph;

// Reference: https://www2.cs.duke.edu/courses/cps100e/fall10/class/11_Bacon/code/Graph.html
// Reference: https://www.geeksforgeeks.org/graph-and-its-representations/

import java.util.*;

public class Graph<E> {
    private Map<Vertex, Set<Edge>> vertices;

    public Graph(){
        vertices = new HashMap<>();
    }
// AddNode()
//Adds a new node to the graph
//Takes in the value of that node
//Returns the added node
    public Vertex addNode(E value){
        if (value != null){
            Vertex newNode;
            newNode = new Vertex(value);
            vertices.putIfAbsent(newNode, new HashSet<>());
            return newNode;
        } else {
            throw new IllegalArgumentException("no empty values please");
        }
    }

    public Edge addEdge(Vertex from, Vertex to, int weight){
        if (vertices.containsKey(from) && vertices.containsKey(to)) {
            // create an edge "from" to "to"
            Edge fromToEdge = new Edge<Vertex>(from, to, weight);
            Set<Edge> getFromNeighbor = vertices.get(from);
            getFromNeighbor.add(fromToEdge);

            // create an edge "to" to "from"
            Edge toFromEdge = new Edge<Vertex>(to, from, weight);
            Set<Edge> getToNeighbor = vertices.get(to);
            getToNeighbor.add(toFromEdge);

            return fromToEdge;
        }
        throw new IllegalArgumentException("no empty values please");
    }

    public Set<Vertex> getNodes(){
        return vertices.keySet();
    }

    public Set<Edge> getNeighbors(Vertex vertex){
        return vertices.get(vertex);
    }

    public int getSize(){
        return vertices.size();
    }


}