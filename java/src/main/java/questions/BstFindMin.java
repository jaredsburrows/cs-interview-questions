package questions;

import api.TreeNode;

public final class BstFindMin {
    public static TreeNode<Integer> findMinNode(TreeNode<Integer> root) {
        while (root.left != null) {
            root = root.left;
        }

        return root;
    }

    public static int findMinValue(TreeNode<Integer> root) {
        return findMinNode(root).value;
    }
}
