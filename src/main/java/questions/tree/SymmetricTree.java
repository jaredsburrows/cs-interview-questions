package questions.tree;

import api.TreeNode;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public final class SymmetricTree {

    /**
     * 1
     * / \
     * 2   2
     * / \ / \
     * 3  4 4  3
     */
    public static <T> boolean isSymmetric(final TreeNode<T> root) {
        return isSymmetric(root, root);
    }

    public static <T> boolean isSymmetric(final TreeNode<T> node, final TreeNode<T> node2) {
        if (node == null && node2 == null) {
            return true;
        }

        if (node == null || node2 == null) {
            return false;
        }

        return node.value == node2.value
                && isSymmetric(node.left, node2.right)
                && isSymmetric(node.right, node2.left);
    }
}
