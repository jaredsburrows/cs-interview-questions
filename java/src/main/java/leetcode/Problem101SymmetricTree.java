package leetcode;

import leetcode.api.TreeNode;

/**
 * https://leetcode.com/problems/symmetric-tree
 */
public final class Problem101SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        return isSymmetric(root, root);
    }

    private boolean isSymmetric(TreeNode node, TreeNode node2) {
        if (node == null && node2 == null) {
            return true;
        }

        if (node == null || node2 == null) {
            return false;
        }

        return node.val == node2.val
            && isSymmetric(node.left, node2.right)
            && isSymmetric(node.right, node2.left);
    }
}
