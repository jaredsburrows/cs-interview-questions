package questions;

import api.TreeNode;

public final class BstContains {
    public static boolean contains(TreeNode<Integer> root, int value) {
        if (root == null) {
            return false;
        }

        if (value == root.value) {
            return true;
        }

        if (value > root.value) {
            return contains(root.right, value);
        }

        if (value < root.value) {
            return contains(root.left, value);
        }

        return false;
    }
}
