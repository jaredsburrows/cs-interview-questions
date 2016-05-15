package questions.tree;

import api.TreeNode;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public class BstInsert {

    public static TreeNode<Integer> insertBST(TreeNode<Integer> root, final int value) {
        return insertBST(root, new TreeNode<>(value));
    }

    public static TreeNode<Integer> insertBST(TreeNode<Integer> root, TreeNode<Integer> node) {
        if (root == null) {
            return node;
        }

        if (node.value > root.value) {
            root.right = insertBST(root.right, node);
        }

        if (node.value < root.value) {
            root.left = insertBST(root.left, node);
        }

        return root;
    }
}
