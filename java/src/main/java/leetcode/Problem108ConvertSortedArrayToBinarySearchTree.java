package leetcode;

import leetcode.api.TreeNode;

/**
 * https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/description/
 * https://leetcode.com/explore/learn/card/introduction-to-data-structure-binary-search-tree/143/appendix-height-balanced-bst/1015/
 */
public final class Problem108ConvertSortedArrayToBinarySearchTree {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }

        return getTreeNode(nums, 0, nums.length - 1);
    }

    private TreeNode getTreeNode(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        }

        final int mid = (start + end) / 2;
        final TreeNode node = new TreeNode(nums[mid]);
        node.left = getTreeNode(nums, start, mid - 1);
        node.right = getTreeNode(nums, mid + 1, end);
        return node;
    }
}
