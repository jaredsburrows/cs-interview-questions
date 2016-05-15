package api;

import java.util.Arrays;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public final class GraphNode<T> {

    public T value;
    public GraphNode<T> next;
    public GraphNode<T>[] neighbors;
    public boolean visited;

    public GraphNode() {
    }

    public GraphNode(final T value) {
        this.value = value;
    }

    public GraphNode(final T value, final GraphNode<T>[] neighbors) {
        this.value = value;
        this.neighbors = neighbors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        final GraphNode<?> graphNode = (GraphNode<?>) o;

        if (this.visited != graphNode.visited) {
            return false;
        }

        if (this.value != null ? !this.value.equals(graphNode.value) : graphNode.value != null) {
            return false;
        }

        if (this.next != null ? !this.next.equals(graphNode.next) : graphNode.next != null) {
            return false;
        }

        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(this.neighbors, graphNode.neighbors);
    }

    @Override
    public int hashCode() {
        int result = this.value != null ? this.value.hashCode() : 0;
        result = 31 * result + (this.next != null ? this.next.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(this.neighbors);
        result = 31 * result + (this.visited ? 1 : 0);
        return result;
    }
}
