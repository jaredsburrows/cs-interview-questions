package questions.treeheap;

import api.TreeNode;

public class BSTInsert {

    public TreeNode<Integer> insertBST(TreeNode<Integer> root, final Integer value) {
        return insertBST(root, new TreeNode<>(value));
    }

    public TreeNode<Integer> insertBST(TreeNode<Integer> root, TreeNode<Integer> node) {
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
