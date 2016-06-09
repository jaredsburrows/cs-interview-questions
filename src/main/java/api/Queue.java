package api;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
// FIFO - First in first out
public final class Queue<T> {

    public TreeNode<T> first;
    public TreeNode<T> last;

    public TreeNode<T> getFirst() {
        return this.first;
    }

    public TreeNode<T> getLast() {
        return this.last;
    }

    public void enqueue(final TreeNode<T> node) {
        if (this.first == null) {
            this.first = node;
            this.last = this.first;
        } else {
            this.last.right = node;
            this.last = node;
        }
    }

    public void dequeue() {
        if (this.first != null) {
            this.first = this.first.right;
        }
    }
}
