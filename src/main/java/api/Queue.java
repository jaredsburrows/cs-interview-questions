package api;

// FIFO
public class Queue<T> {
    public TreeNode<T> first;
    public TreeNode<T> last;

    public TreeNode<T> getFirst() {
        return this.first;
    }

    public TreeNode<T> getLast() {
        return this.last;
    }

    public void enqueue(final TreeNode<T> n) {
        if (first == null) {
            first = n;
            last = first;
        } else {
            last.right = n;
            last = n;
        }
    }

    public void dequeue() {
        if (first != null) {
            first = first.right;
        }
    }
}
