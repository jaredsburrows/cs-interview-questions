package leetcode;

import leetcode.api.TreeNode;

/**
 * https://leetcode.com/problems/flatten-binary-tree-to-linked-list
 */
public final class Problem114FlattenBinaryTreeToLinkedList {
    public void flatten(TreeNode root) {
        flatten(root, null);
    }

    private TreeNode flatten(TreeNode root, TreeNode prev) {
        if (root == null) {
            return prev;
        }

        prev = flatten(root.right, prev);
        prev = flatten(root.left, prev);
        root.right = prev;
        root.left = null;
        prev = root;

        return root;
    }
}
