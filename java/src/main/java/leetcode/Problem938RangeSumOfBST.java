package leetcode;

import leetcode.api.TreeNode;

/**
 * https://leetcode.com/problems/range-sum-of-bst/
 */
public final class Problem938RangeSumOfBST {
    public int rangeSumBST(TreeNode root, int L, int R) {
        if (root == null) {
            return 0;
        }

        int value = 0;
        if (root.val >= L && root.val <= R) {
            value = root.val;
        }

        return rangeSumBST(root.left, L, R) + rangeSumBST(root.right, L, R) + value;
    }
}
