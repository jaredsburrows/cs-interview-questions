package questions.tree;

import api.TreeNode;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public final class EqualTree {

    public static <T> boolean isEqual(final TreeNode<T> node, final TreeNode<T> node2) {
        if (node == null && node2 == null) {
            return true;
        }

        if (node == null || node2 == null) {
            return false;
        }

        return node.value == node2.value
            && isEqual(node.left, node2.left)
            && isEqual(node.right, node2.right);
    }
}
