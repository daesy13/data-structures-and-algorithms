package code401challenges.graph;

import java.util.HashSet;
import java.util.Set;

public class Node<E>{
    private E value;
    E val;
    Set<Edge> edges;

    Node(E val) {
        this.value = val;
        edges = new HashSet<>();
    }

    @Override
    public String toString(){
        return value.toString();
    }
}
