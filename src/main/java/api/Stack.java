package api;

// LIFO
public class Stack<T> {

    public TreeNode<T> top;

    public TreeNode<T> peek() {
        return this.top;
    }

    public void push(final TreeNode<T> n) {
        if (n != null) {
            n.right = top;
            top = n;
        }
    }

    public void pop() {
        if (top != null) {
            top = top.right;
        }
    }
}
