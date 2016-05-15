package api;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
// LIFO
public final class Stack<T> {

    public TreeNode<T> top;

    public TreeNode<T> peek() {
        return this.top;
    }

    public void push(final TreeNode<T> n) {
        if (n != null) {
            n.right = this.top;
            this.top = n;
        }
    }

    public void pop() {
        if (this.top != null) {
            this.top = this.top.right;
        }
    }
}
