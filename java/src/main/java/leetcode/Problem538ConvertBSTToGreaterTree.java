package leetcode;

import leetcode.api.TreeNode;

/**
 * https://leetcode.com/problems/convert-bst-to-greater-tree/
 */
public final class Problem538ConvertBSTToGreaterTree {
    public TreeNode bstToGst(TreeNode root) {
        if (root == null) {
            return null;
        }

        bstToGst(root, 0);

        return root;
    }

    private int bstToGst(TreeNode root, int sum) {
        if (root == null) {
            return sum;
        }

        root.val = root.val + bstToGst(root.right, sum);

        return bstToGst(root.left, root.val);
    }
}
