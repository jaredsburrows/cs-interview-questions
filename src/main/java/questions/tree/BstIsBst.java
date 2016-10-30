package questions.tree;

import api.TreeNode;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public final class BstIsBst {

    public static boolean isBst(final TreeNode<Integer> root) {
        return isBst(root, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY);
    }

    public static boolean isBst(final TreeNode<Integer> root, final double min, final double max) {
        if (root == null) {
            return true;
        }

        if (root.value <= min || root.value >= max) {
            return false;
        }

        return isBst(root.left, min, root.value) && isBst(root.right, root.value, max);
    }
}
