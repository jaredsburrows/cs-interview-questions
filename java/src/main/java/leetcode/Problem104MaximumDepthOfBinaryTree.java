package leetcode;

import leetcode.api.TreeNode;

/**
 * https://leetcode.com/problems/maximum-depth-of-binary-tree
 * https://leetcode.com/explore/learn/card/recursion-i/256/complexity-analysis/2375/
 */
public final class Problem104MaximumDepthOfBinaryTree {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}
