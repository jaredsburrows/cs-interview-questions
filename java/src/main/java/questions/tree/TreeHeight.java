package questions.tree;

import api.TreeNode;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public final class TreeHeight {
    public static <T> int getHeight(TreeNode<T> treeNode) {
        if (treeNode == null) {
            return 0;
        }

        final int left = getHeight(treeNode.left);
        final int right = getHeight(treeNode.right);

        if (left == -1
            || right == -1
            || Math.abs(left - right) > 1) { // no node never differ by more than 1.
            return -1;
        }

        return Math.max(left, right) + 1;
    }

    public static <T> int getMinHeight(TreeNode<T> treeNode) {
        if (treeNode == null) {
            return 0;
        }

        return Math.min(getMinHeight(treeNode.left), getMinHeight(treeNode.right)) + 1;
    }

    public static <T> int getMaxHeight(TreeNode<T> treeNode) {
        if (treeNode == null) {
            return 0;
        }

        return Math.max(getMaxHeight(treeNode.left), getMaxHeight(treeNode.right)) + 1;
    }
}
