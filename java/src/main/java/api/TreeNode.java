package api;

import java.util.Objects;

public final class TreeNode<T> {
    public T value;
    public TreeNode<T> left;
    public TreeNode<T> right;

    public TreeNode() {
    }

    public TreeNode(T value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (!(o instanceof TreeNode<?>)) {
            return false;
        }

        TreeNode<?> treeNode = (TreeNode<?>) o;
        return Objects.equals(value, treeNode.value)
            && Objects.equals(left, treeNode.left)
            && Objects.equals(right, treeNode.right);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, left, right);
    }

    @Override
    public String toString() {
        return "TreeNode{" +
            "value=" + value +
            ", left=" + left +
            ", right=" + right +
            '}';
    }
}
