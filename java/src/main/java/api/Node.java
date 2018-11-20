package api;

import java.util.Objects;

public final class Node<T> {
    public T value;
    public Node<T> next;
    public Node<T> previous;

    public Node() {
    }

    public Node(T value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        final Node<?> node = (Node<?>) o;
        return Objects.equals(value, node.value) &&
            Objects.equals(next, node.next) &&
            Objects.equals(previous, node.previous);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, next, previous);
    }

    @Override
    public String toString() {
        return "Node{" +
            "value=" + value +
            ", next=" + next +
            ", previous=" + previous +
            '}';
    }
}
