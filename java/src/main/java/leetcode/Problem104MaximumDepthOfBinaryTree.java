package leetcode;

import leetcode.api.TreeNode;

/**
 * https://leetcode.com/problems/maximum-depth-of-binary-tree
 */
public final class Problem104MaximumDepthOfBinaryTree {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}
