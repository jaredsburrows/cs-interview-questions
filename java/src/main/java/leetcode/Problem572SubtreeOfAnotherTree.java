package leetcode;

import leetcode.api.TreeNode;

/**
 * https://leetcode.com/problems/subtree-of-another-tree/description
 */
public final class Problem572SubtreeOfAnotherTree {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if (s == null) {
            return false;
        }

        if (t == null) {
            return false;
        }

        return isSameTree(s, t)
            || isSubtree(s.left, t)
            || isSubtree(s.right, t);
    }

    private boolean isSameTree(TreeNode p, TreeNode q) {
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
