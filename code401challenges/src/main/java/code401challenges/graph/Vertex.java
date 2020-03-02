package code401challenges.graph;

import java.util.HashSet;
import java.util.Set;

public class Vertex<E>{
    public E value;

    Vertex(E val) {
        this.value = val;
    }

    @Override
    public String toString(){
        return value.toString();
    }
}
