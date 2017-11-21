package questions.tree;

import api.TreeNode;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public final class InvertTree {

    public static <T> TreeNode<T> reverseTree(final TreeNode<T> root) {
        if (root == null) {
            return null;
        }

        reverse(root);

        return root;
    }

    public static <T> void reverse(final TreeNode<T> root) {
        if (root == null) {
            return;
        }

        final TreeNode<T> temp = root.left;
        root.left = root.right;
        root.right = temp;

        reverse(root.left);

        reverse(root.right);
    }
}
