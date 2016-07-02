package api;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
// FIFO - First in first out
public final class Queue<T> {

    public Node<T> first;
    public Node<T> last;

    public Queue() {
    }

    public Queue(final T t) {
        this.enqueue(new Node<>(t));
    }

    public Node<T> getFirst() {
        return this.first;
    }

    public Node<T> getLast() {
        return this.last;
    }

    public void enqueue(final Node<T> node) {
        if (this.first == null) {
            this.first = node;
            this.last = this.first;
        } else {
            this.last.next = node;
            this.last = node;
        }
    }

    public void dequeue() {
        if (this.first != null) {
            this.first = this.first.next;
        }
    }

    @Override
    public boolean equals(final Object object) {
        if (this == object) {
            return true;
        }

        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }

        final Queue<?> queue = (Queue<?>) object;

        if (this.first != null ? !this.first.equals(queue.first) : queue.first != null) {
            return false;
        }

        return this.last != null ? this.last.equals(queue.last) : queue.last == null;
    }

    @Override
    public int hashCode() {
        int result = this.first != null ? this.first.hashCode() : 0;
        result = 31 * result + (this.last != null ? this.last.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Queue{"
                + "first=" + this.first
                + ", last=" + this.last
                + '}';
    }
}
