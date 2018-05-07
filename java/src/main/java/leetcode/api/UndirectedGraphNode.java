package leetcode.api;

import java.util.ArrayList;
import java.util.List;

public final class UndirectedGraphNode {
    public int label;
    public List<UndirectedGraphNode> neighbors;

    public UndirectedGraphNode(int x) {
        label = x;
        neighbors = new ArrayList<>();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        final UndirectedGraphNode that = (UndirectedGraphNode) o;

        if (label != that.label) return false;
        return neighbors != null ? neighbors.equals(that.neighbors) : that.neighbors == null;
    }

    @Override
    public int hashCode() {
        int result = label;
        result = 31 * result + (neighbors != null ? neighbors.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "UndirectedGraphNode{" +
            "label=" + label +
            ", neighbors=" + neighbors +
            '}';
    }
}
