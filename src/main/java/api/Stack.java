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

    public void push(final Node<T> n) {
        if (n != null) {
            n.next = this.top;
            this.top = n;
        }
    }

    public void pop() {
        if (this.top != null) {
            this.top = this.top.next;
        }
    }
}
