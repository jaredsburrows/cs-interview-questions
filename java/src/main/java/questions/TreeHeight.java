package questions;

import api.TreeNode;

public final class TreeHeight {
    public static <T> int getHeight(TreeNode<T> treeNode) {
        if (treeNode == null) {
            return 0;
        }

        int left = getHeight(treeNode.left);
        int right = getHeight(treeNode.right);

        // no node never differ by more than 1
        if (left == -1 || right == -1 || Math.abs(left - right) > 1) {
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
