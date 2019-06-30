package leetcode;

import leetcode.api.TreeNode;

/**
 * https://leetcode.com/problems/univalued-binary-tree/
 */
public final class Problem965UnivaluedBinaryTree {
    public boolean isUnivalTree(TreeNode root) {
        return check(root, root.val);
    }

    public boolean check(TreeNode root, int value) {
        if (root == null) {
            return true;
        }

        if (root.val != value) {
            return false;
        }

        return check(root.left, value) && check(root.right, value);
    }
}
