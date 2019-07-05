package leetcode;

import leetcode.api.TreeNode;

/**
 * https://leetcode.com/problems/validate-binary-search-tree
 * https://leetcode.com/explore/learn/card/recursion-ii/470/divide-and-conquer/2874/
 */
public final class Problem98ValidateBinarySearchTree {
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public boolean isValidBST(TreeNode root, long min, long max) {
        if (root == null) {
            return true;
        }

        if (root.val <= min || root.val >= max) {
            return false;
        }

        return isValidBST(root.left, min, root.val) && isValidBST(root.right, root.val, max);
    }
}
