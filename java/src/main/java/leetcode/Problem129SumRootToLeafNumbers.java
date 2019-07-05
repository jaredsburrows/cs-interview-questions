package leetcode;

import leetcode.api.TreeNode;

/**
 * https://leetcode.com/problems/sum-root-to-leaf-numbers
 */
@SuppressWarnings("MethodCanBeStatic") // Leetcode is not static
public final class Problem129SumRootToLeafNumbers {
    public int sumNumbers(TreeNode root) {
        if (root == null) {
            return 0;
        }

        return sumNumbers(root, 0);
    }

    private int sumNumbers(TreeNode root, int val) {
        if (root == null) {
            return 0;
        }

        if (root.left == null && root.right == null) {
            return val * 10 + root.val;
        }

        return sumNumbers(root.left, val * 10 + root.val)
            + sumNumbers(root.right, val * 10 + root.val);
    }
}
