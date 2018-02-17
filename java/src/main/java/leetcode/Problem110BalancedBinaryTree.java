package leetcode;

import leetcode.api.TreeNode;

/**
 * https://leetcode.com/problems/balanced-binary-tree
 * https://leetcode.com/explore/learn/card/introduction-to-data-structure-binary-search-tree/143/appendix-height-balanced-bst/1027/
 */
public final class Problem110BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        return root == null || getHeight(root) != -1;
    }

    private int getHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }

        final int left = getHeight(root.left);
        final int right = getHeight(root.right);

        if (left == -1 || right == -1 || Math.abs(left - right) > 1) {
            return -1;
        }

        return Math.max(left, right) + 1;
    }
}
