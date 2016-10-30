package questions.tree;

import api.TreeNode;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public final class BstHeight {

    public static int getHeight(final TreeNode<Integer> node) {
        if (node == null) {
            return -1;
        }

        final int left = getHeight(node.left);
        final int right = getHeight(node.right);

        return Math.max(left, right) + 1;
    }
}
