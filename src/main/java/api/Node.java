package api;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public final class Node<T> {

    public T value;
    public Node<T> next;
    public Node<T> previous;

    public Node() {
    }

    public Node(final T value) {
        this.value = value;
    }

    @SuppressWarnings("SimplifiableIfStatement")
    @Override
    public boolean equals(final Object object) {
        if (this == object) {
            return true;
        }

        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }

        final Node<?> node = (Node<?>) object;

        if (this.value != null ? !this.value.equals(node.value) : node.value != null) {
            return false;
        }

        if (this.next != null ? !this.next.equals(node.next) : node.next != null) {
            return false;
        }

        return this.previous != null ? this.previous.equals(node.previous) : node.previous == null;
    }

    @Override
    public int hashCode() {
        int result = this.value != null ? this.value.hashCode() : 0;
        result = 31 * result + (this.next != null ? this.next.hashCode() : 0);
        result = 31 * result + (this.previous != null ? this.previous.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Node{"
                + "value=" + this.value
                + ", next=" + this.next
                + ", previous=" + this.previous
                + '}';
    }
}
