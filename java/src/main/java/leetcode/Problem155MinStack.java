package leetcode;

/**
 * https://leetcode.com/problems/min-stack/description
 *
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public final class Problem155MinStack {
    public class MinStack {
        private Node top;

        public void push(int x) {
            if (top == null) {
                top = new Node(x, x);
            } else {
                top = new Node(x, Math.min(top.minimum, x), top);
            }
        }

        public void pop() {
            if (top != null) {
                top = top.previous;
            }
        }

        public int top() {
            return top != null ? top.value : -1;
        }

        public int getMin() {
            return top != null ? top.minimum : -1;
        }

        private class Node {
            int value;
            int minimum;
            Node previous;

            public Node(int value, int minimum) {
                this(value, minimum, null);
            }

            public Node(int value, int minimum, Node previous) {
                this.value = value;
                this.minimum = minimum;
                this.previous = previous;
            }
        }
    }
}
