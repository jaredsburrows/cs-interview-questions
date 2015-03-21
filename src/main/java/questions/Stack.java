package questions;

import questions.util.Node;

// LIFO
public class Stack {
    public Node top;

    public Node peek() {
        return top;
    }

    public void push(final Node n) {
        if (n != null) {
            n.next = top;
            top = n;
        }
    }

    public void pop() {
        if (top != null) {
            top = top.next;
        }
    }
}
