package api;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public final class TreeNode<T> {

    public T value;
    public TreeNode<T> left;
    public TreeNode<T> right;

    public TreeNode() {
    }

    public TreeNode(final T value) {
        this.value = value;
    }

    @Override
    public boolean equals(final Object object) {
        if (this == object) {
            return true;
        }

        if (object == null || getClass() != object.getClass()) {
            return false;
        }

        final TreeNode<?> treeNode = (TreeNode<?>) object;

        if (value != null ? !value.equals(treeNode.value) : treeNode.value != null) {
            return false;
        }

        if (left != null ? !left.equals(treeNode.left) : treeNode.left != null) {
            return false;
        }

        return right != null ? right.equals(treeNode.right) : treeNode.right == null;
    }

    @Override
    public int hashCode() {
        int result = value != null ? value.hashCode() : 0;
        result = 31 * result + (left != null ? left.hashCode() : 0);
        result = 31 * result + (right != null ? right.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "TreeNode{"
            + "value=" + value
            + ", left=" + left
            + ", right=" + right
            + '}';
    }

}
