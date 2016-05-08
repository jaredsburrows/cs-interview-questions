package api;

public class Node<T> {

    public T value;
    public Node<T> next;
    public Node<T> previous;

    public Node() {
    }

    public Node(final T value) {
        this.value = value;
    }
}
