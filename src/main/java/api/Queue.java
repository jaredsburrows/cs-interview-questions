package api;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
// FIFO
public final class Queue<T> {

    public TreeNode<T> first;
    public TreeNode<T> last;

    public TreeNode<T> getFirst() {
        return this.first;
    }

    public TreeNode<T> getLast() {
        return this.last;
    }

    public void enqueue(final TreeNode<T> n) {
        if (this.first == null) {
            this.first = n;
            this.last = this.first;
        } else {
            this.last.right = n;
            this.last = n;
        }
    }

    public void dequeue() {
        if (this.first != null) {
            this.first = this.first.right;
        }
    }
}
