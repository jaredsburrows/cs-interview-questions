package questions.treeheap;

import api.TreeNode;

public class BSTDelete {

    public TreeNode<Integer> findMaxNode(TreeNode<Integer> root) {
        while (root.right != null) {
            root = root.right;
        }

        return root;
    }

    public int findMaxValue(TreeNode<Integer> root) {
        return findMaxNode(root).value;
    }

    public TreeNode<Integer> deleteNode(TreeNode<Integer> root, int value) {
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
