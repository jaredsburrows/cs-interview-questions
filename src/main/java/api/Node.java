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
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        final Node<?> node = (Node<?>) o;

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
}
