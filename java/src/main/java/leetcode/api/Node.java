package leetcode.api;

import java.util.List;
import java.util.Objects;

public final class Node {
    public int val;
    public List<Node> neighbors;

    public Node() {
    }

    public Node(int _val, List<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
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
        return val == node.val &&
            Objects.equals(neighbors, node.neighbors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(val, neighbors);
    }

    @Override
    public String toString() {
        return "Node{" +
            "val=" + val +
            ", neighbors=" + neighbors +
            '}';
    }
}
