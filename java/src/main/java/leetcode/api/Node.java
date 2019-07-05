package leetcode.api;

import java.util.List;
import java.util.Objects;

public final class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;
    public List<Node> neighbors;

    public Node() {
    }

    public Node(int _val, List<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (!(o instanceof Node)) {
            return false;
        }

        Node node = (Node) o;
        return val == node.val
            && Objects.equals(left, node.left)
            && Objects.equals(right, node.right)
            && Objects.equals(next, node.next)
            && Objects.equals(neighbors, node.neighbors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(val, left, right, next, neighbors);
    }
}
