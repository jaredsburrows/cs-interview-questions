package questions.tree;

import api.TreeNode;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public class BstDelete {

    public static TreeNode<Integer> findMaxNode(TreeNode<Integer> root) {
        while (root.right != null) {
            root = root.right;
        }

        return root;
    }

    public static int findMaxValue(final TreeNode<Integer> root) {
        return findMaxNode(root).value;
    }

    public static TreeNode<Integer> deleteNode(TreeNode<Integer> root, final int value) {
        if (root == null) {
            return null;
        }

        if (value < root.value) {
            root = deleteNode(root.left, value);
        } else if (value > root.value) {
            root = deleteNode(root.right, value);
        } else {
            if (root.left == null && root.right == null) {
                return null;
            } else if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            } else {
                root.value = findMaxValue(root.left);
                root.left = deleteNode(root.left, value);
            }
        }

        return root;
    }
}
