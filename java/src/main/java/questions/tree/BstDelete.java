package questions.tree;

import api.TreeNode;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public final class BstDelete {

    public static TreeNode<Integer> getMinNode(TreeNode<Integer> node) {
        if (node.left == null) {
            return node;
        } else {
            return getMinNode(node.left);
        }
    }

    public static TreeNode<Integer> deleteMin(TreeNode<Integer> node) {
        if (node.left == null) {
            return node.right;
        }
        node.left = deleteMin(node.left);
        return node;
    }

    public static TreeNode<Integer> deleteNode(TreeNode<Integer> root, int value) {

        if (root == null) {
            return null;
        }

        if (value < root.value) {
            root.left = deleteNode(root.left, value);
        } else if (value > root.value) {
            root.right = deleteNode(root.right, value);
        } else {
            if (root.left == null && root.right == null) {
                return null;
            } else if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            } else {
                final TreeNode<Integer> temp = root;
                root = getMinNode(temp.right);
                root.right = deleteMin(temp.right);
                root.left = temp.left;
            }
        }

        return root;
    }
}
