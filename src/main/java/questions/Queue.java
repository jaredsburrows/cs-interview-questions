package questions;

import questions.util.TreeNode;

// FIFO
public class Queue {
    public TreeNode first;
    public TreeNode last;

    public TreeNode getFirst() {
        return first;
    }

    public TreeNode getLast() {
        return last;
    }

    public void enqueue(final TreeNode n) {
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
