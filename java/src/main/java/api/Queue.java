package api;

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
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }

        if (object == null || getClass() != object.getClass()) {
            return false;
        }

        final Queue<?> queue = (Queue<?>) object;

        if (first != null ? !first.equals(queue.first) : queue.first != null) {
            return false;
        }

        return last != null ? last.equals(queue.last) : queue.last == null;
    }

    @Override
    public int hashCode() {
        int result = first != null ? first.hashCode() : 0;
        result = 31 * result + (last != null ? last.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Queue{" +
            "first=" + first +
            ", last=" + last +
            '}';
    }
}
