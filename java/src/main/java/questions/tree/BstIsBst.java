package questions.tree;

import api.TreeNode;

public final class BstIsBst {
    public static boolean isBst(TreeNode<Integer> root) {
        return isBst(root, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY);
    }

    public static boolean isBst(TreeNode<Integer> root, double min, double max) {
        if (root == null) {
            return true;
        }

        if (root.value <= min || root.value >= max) {
            return false;
        }

        return isBst(root.left, min, root.value) && isBst(root.right, root.value, max);
    }
}
