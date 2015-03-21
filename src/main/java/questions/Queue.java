package questions;

import questions.util.Node;

// FIFO
public class Queue {
    public Node first;
    public Node last;

    public Node getFirst() {
        return first;
    }

    public Node getLast() {
        return last;
    }

    public void enqueue(final Node n) {
        if (first == null) {
            first = n;
            last = first;
        } else {
            last.next = n;
            last = n;
        }
    }

    public void dequeue() {
        if (first != null) {
            first = first.next;
        }
    }
}
