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

    @SuppressWarnings("SimplifiableIfStatement")
    @Override
    public boolean equals(final Object object) {
        if (this == object) {
            return true;
        }

        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }

        final TreeNode<?> treeNode = (TreeNode<?>) object;

        if (this.value != null ? !this.value.equals(treeNode.value) : treeNode.value != null) {
            return false;
        }

        if (this.left != null ? !this.left.equals(treeNode.left) : treeNode.left != null) {
            return false;
        }

        return this.right != null ? this.right.equals(treeNode.right) : treeNode.right == null;
    }

    @Override
    public int hashCode() {
        int result = this.value != null ? this.value.hashCode() : 0;
        result = 31 * result + (this.left != null ? this.left.hashCode() : 0);
        result = 31 * result + (this.right != null ? this.right.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "value=" + this.value +
                ", left=" + this.left +
                ", right=" + this.right +
                '}';
    }
}
