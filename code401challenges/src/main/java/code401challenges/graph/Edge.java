package code401challenges.graph;

public class Edge<E> {
    E directed;
    E from;
    int weighted;

    public Edge(E directed, E from, int weighted) {
        this.directed = directed;
        this.from = from;
        this.weighted = weighted;
    }

    public int getWeighted() {
        return weighted;
    }

    @Override
    public String toString() {
        return "Edge{" +
                "directed=" + directed +
                ", from=" + from +
                ", weighted=" + weighted +
                '}';
    }
}