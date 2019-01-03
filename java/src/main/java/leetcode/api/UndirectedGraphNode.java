package leetcode.api;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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

        UndirectedGraphNode that = (UndirectedGraphNode) o;
        return label == that.label
            && Objects.equals(neighbors, that.neighbors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(label, neighbors);
    }

    @Override
    public String toString() {
        return "UndirectedGraphNode{" +
            "label=" + label +
            ", neighbors=" + neighbors +
            '}';
    }
}
