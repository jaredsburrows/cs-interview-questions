package leetcode;

import leetcode.api.TreeNode;

/**
 * https://leetcode.com/explore/learn/card/introduction-to-data-structure-binary-search-tree/141/basic-operations-in-a-bst/1000/
 */
public final class ExploreSearchInABinarySearchTree {
    // iterative
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null || val == root.val) {
            return root;
        }

        TreeNode current = root;
        while (current != null && current.val != val) {
            if (val > current.val) {
                current = current.right;
            } else {
                current = current.left;
            }
        }

        return current;
    }

    // recursive
    public TreeNode searchBST2(TreeNode root, int val) {
        if (root == null || val == root.val) {
            return root;
        }

        if (val > root.val) {
            return searchBST2(root.right, val);
        } else {
            return searchBST2(root.left, val);
        }
    }
}
