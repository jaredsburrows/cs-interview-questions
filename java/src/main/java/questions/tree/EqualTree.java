package questions.tree;

import api.TreeNode;

public final class EqualTree {
    public static <T> boolean isEqual(TreeNode<T> root) {
        return isEqual(root, root);
    }

    public static <T> boolean isEqual(TreeNode<T> leftRoot, TreeNode<T> rightRoot) {
        if (leftRoot == null && rightRoot == null) {
            return true;
        }

        if (leftRoot == null || rightRoot == null) {
            return false;
        }

        return leftRoot.value == rightRoot.value
            && isEqual(leftRoot.left, rightRoot.left)
            && isEqual(leftRoot.right, rightRoot.right);
    }
}
