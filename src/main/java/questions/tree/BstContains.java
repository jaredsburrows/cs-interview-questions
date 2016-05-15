package questions.tree;

import api.TreeNode;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public class BstContains {

    public static boolean contains(final TreeNode<Integer> root, final int value) {
        if (root == null) {
            return false;
        }

        if (value == root.value) {
            return true;
        } else if (value < root.value) {
            return contains(root.left, value);
        } else if (value > root.value) {
            return contains(root.right, value);
        }

        return false;
    }
}
