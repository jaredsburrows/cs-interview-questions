package questions.tree;

import api.TreeNode;

public final class BstInsert {
    public static TreeNode<Integer> insertBst(TreeNode<Integer> root, int value) {
        return insertBst(root, new TreeNode<>(value));
    }

    public static TreeNode<Integer> insertBst(TreeNode<Integer> root,
                                              TreeNode<Integer> node) {
        if (root == null) {
            return node;
        }

        if (node.value > root.value) {
            root.right = insertBst(root.right, node);
        }

        if (node.value < root.value) {
            root.left = insertBst(root.left, node);
        }

        return root;
    }
}
