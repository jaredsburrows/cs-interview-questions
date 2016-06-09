package api;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
// LIFO - Last in first out
public final class Stack<T> {

    public Node<T> top;

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
}
