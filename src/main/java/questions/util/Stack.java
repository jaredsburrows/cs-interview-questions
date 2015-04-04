package questions.util;

import questions.util.TreeNode;

// LIFO
public class Stack {
    public TreeNode top;

    public TreeNode peek() {
        return top;
    }

    public void push(final TreeNode n) {
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
