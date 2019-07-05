package leetcode;

import leetcode.api.TreeNode;

/**
 * https://leetcode.com/problems/same-tree
 * https://leetcode.com/explore/learn/card/recursion-ii/503/recursion-to-iteration/2894/
 */
public final class Problem100SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }

        if (p == null || q == null) {
            return false;
        }

        return p.val == q.val
            && isSameTree(p.left, q.left)
            && isSameTree(p.right, q.right);
    }
}
