package api;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
// LIFO - Last in first out
public final class Stack<T> {

    public Node<T> top;

    public Stack() {
    }

    public Stack(final T value) {
        push(new Node<>(value));
    }

    public Node<T> peek() {
        return top;
    }

    public void push(final Node<T> node) {
        if (node != null) {
            node.next = top;
            top = node;
        }
    }

    public void pop() {
        if (top != null) {
            top = top.next;
        }
    }

    @Override
    public boolean equals(final Object object) {
        if (this == object) {
            return true;
        }

        if (object == null || getClass() != object.getClass()) {
            return false;
        }

        final Stack<?> stack = (Stack<?>) object;

        return top != null ? top.equals(stack.top) : stack.top == null;
    }

    @Override
    public int hashCode() {
        return top != null ? top.hashCode() : 0;
    }
}
