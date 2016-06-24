package api;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
// LIFO - Last in first out
public final class Stack<T> {

    public Node<T> top;

    public Stack() {
    }

    public Stack(final T t) {
        this.push(new Node<>(t));
    }

    public Node<T> peek() {
        return this.top;
    }

    public void push(final Node<T> node) {
        if (node != null) {
            node.next = this.top;
            this.top = node;
        }
    }

    public void pop() {
        if (this.top != null) {
            this.top = this.top.next;
        }
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }

        final Stack<?> stack = (Stack<?>) o;

        return this.top != null ? this.top.equals(stack.top) : stack.top == null;

    }

    @Override
    public int hashCode() {
        return top != null ? this.top.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Stack{" +
                "top=" + this.top +
                '}';
    }
}
