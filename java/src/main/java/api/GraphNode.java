package api;

import java.util.Arrays;
import java.util.Objects;

public final class GraphNode<T> {
    public T value;
    public GraphNode<T> next;
    public GraphNode<T>[] neighbors;
    public boolean visited;

    public GraphNode() {
    }

    public GraphNode(T value) {
        this.value = value;
    }

    public GraphNode(T value, GraphNode<T>[] neighbors) {
        this.value = value;
        this.neighbors = neighbors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (!(o instanceof GraphNode<?> graphNode)) {
            return false;
        }

        return visited == graphNode.visited
            && Objects.equals(value, graphNode.value)
            && Objects.equals(next, graphNode.next)
            && Arrays.equals(neighbors, graphNode.neighbors);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(value, next, visited);
        result = 31 * result + Arrays.hashCode(neighbors);
        return result;
    }

    @Override
    public String toString() {
        return "GraphNode{" +
            "value=" + value +
            ", next=" + next +
            ", neighbors=" + Arrays.toString(neighbors) +
            ", visited=" + visited +
            '}';
    }
}
