package questions.tree;

import api.TreeNode;
import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public final class InvertTree {
    public static <T> TreeNode<T> reverseTree(TreeNode<T> root) {
        if (root == null) {
            return null;
        }

        reverse(root);

        return root;
    }

    private static <T> void reverse(TreeNode<T> root) {
        if (root == null) {
            return;
        }

        final TreeNode<T> temp = root.left;
        root.left = root.right;
        root.right = temp;

        reverse(root.left);
        reverse(root.right);
    }

    public static <T> TreeNode<T> reverseTree2(TreeNode<T> root) {
        if (root == null) {
            return null;
        }

        final Queue<TreeNode<T>> queue = new ArrayDeque<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            final TreeNode<T> node = queue.poll();

            if (node.left != null) {
                queue.add(node.left);
            }

            if (node.right != null) {
                queue.add(node.right);
            }

            final TreeNode<T> temp = root.left;
            root.left = root.right;
            root.right = temp;
        }


        return root;
    }
}
