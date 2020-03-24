package leetcode;

import leetcode.api.TreeNode;

/**
 * https://leetcode.com/problems/sum-of-root-to-leaf-binary-numbers/
 */
public final class Problem1022SumOfRootToLeafBinaryNumbers {
    public int sumRootToLeaf(TreeNode root) {
        if (root == null) {
            return 0;
        }

        return sumNumbers(root, 0);
    }

    private int sumNumbers(TreeNode root, int val) {
        if (root == null) {
            return 0;
        }

        int num = (val << 1) | root.val;
        if (root.left == null && root.right == null) {
            return num;
        }

        return sumNumbers(root.left, num) + sumNumbers(root.right, num);
    }
}
