package questions.tree;

import api.TreeNode;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public final class BstContains {

    public static boolean contains(final TreeNode<Integer> root, final int value) {
        if (root == null) {
            return false;
        }

        if (value == root.value) {
            return true;
        }

        if (value > root.value) {
            return contains(root.right, value);
        }

        if (value < root.value) {
            return contains(root.left, value);
        }

        return false;
    }
}
