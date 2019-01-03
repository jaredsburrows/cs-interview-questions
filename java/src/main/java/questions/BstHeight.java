package questions;

import api.TreeNode;

public final class BstHeight {
    public static int getHeight(TreeNode<Integer> node) {
        if (node == null) {
            return -1;
        }

        int left = getHeight(node.left);
        int right = getHeight(node.right);

        return Math.max(left, right) + 1;
    }
}
