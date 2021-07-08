package code401challenges.graph;

public class Edge<E> {
    Vertex<E> from;
    Vertex<E> to;
    int weight;

    public Edge(Vertex<E> from, Vertex<E> to, int weight) {
        this.from = from;
        this.to = to;
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Edge{" +
                "from=" + from +
                ", to=" + to +
                ", weight=" + weight +
                '}';
    }
}