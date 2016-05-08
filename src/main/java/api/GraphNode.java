package api;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public class GraphNode<T> {

    public T value;
    public GraphNode<T> next;
    public GraphNode<T>[] neighbors;
    public boolean visited;

    public GraphNode(final T value) {
        this.value = value;
    }

    public GraphNode(final T value, final GraphNode<T>[] neighbors) {
        this.value = value;
        this.neighbors = neighbors;
    }
}
