package leetcode;

import leetcode.api.TreeNode;

/**
 * https://leetcode.com/problems/sum-of-left-leaves/
 */
public final class Problem404SumOfLeftLeaves {
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int sum = 0;

        if (isLeaf(root.left)) {
            sum += root.left.val;
        } else {
            sum += sumOfLeftLeaves(root.left);
        }

        sum += sumOfLeftLeaves(root.right);

        return sum;
    }

    private boolean isLeaf(TreeNode root) {
        return root != null && root.left == null && root.right == null;
    }
}
