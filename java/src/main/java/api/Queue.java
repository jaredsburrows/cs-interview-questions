package api;

import java.util.Objects;

// FIFO - First in first out
public final class Queue<T> {
    public Node<T> first;
    public Node<T> last;

    public Queue() {
    }

    public Queue(T value) {
        add(new Node<>(value));
    }

    public Node<T> getFirst() {
        return first;
    }

    public Node<T> getLast() {
        return last;
    }

    public void add(Node<T> node) {
        if (first == null) {
            first = node;
            last = first;
        } else {
            last.next = node;
            last = node;
        }
    }

    public void poll() {
        if (first != null) {
            first = first.next;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (!(o instanceof Queue<?> queue)) {
            return false;
        }

        return Objects.equals(first, queue.first)
            && Objects.equals(last, queue.last);
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, last);
    }

    @Override
    public String toString() {
        return "Queue{" +
            "first=" + first +
            ", last=" + last +
            '}';
    }
}
