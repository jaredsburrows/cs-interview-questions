package questions.tree;

import api.TreeNode;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public final class SymmetricTree {
    public static <T> boolean isSymmetric(TreeNode<T> root) {
        return isSymmetric(root, root);
    }

    public static <T> boolean isSymmetric(TreeNode<T> leftRoot, TreeNode<T> rightRoot) {
        if (leftRoot == null && rightRoot == null) {
            return true;
        }

        if (leftRoot == null || rightRoot == null) {
            return false;
        }

        return leftRoot.value == rightRoot.value
            && isSymmetric(leftRoot.left, rightRoot.right)
            && isSymmetric(leftRoot.right, rightRoot.left);
    }
}
