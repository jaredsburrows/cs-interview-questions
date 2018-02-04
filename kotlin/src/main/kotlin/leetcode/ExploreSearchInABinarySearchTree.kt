package leetcode

import leetcode.api.TreeNode

/**
 * https://leetcode.com/explore/learn/card/introduction-to-data-structure-binary-search-tree/141/basic-operations-in-a-bst/1000/
 */
class ExploreSearchInABinarySearchTree {
    // iterative
    fun searchBST(root: TreeNode? = null, value: Int): TreeNode? {
        if (root == null || value == root.value) {
            return root
        }

        var current = root
        while (current != null && current.value != value) {
            current = if (value > current.value) current.right else current.left
        }

        return current
    }

    // recursive
    fun searchBST2(root: TreeNode? = null, value: Int): TreeNode? {
        if (root == null || value == root.value) {
            return root
        }

        return if (value > root.value) {
            searchBST2(root.right, value)
        } else {
            searchBST2(root.left, value)
        }
    }
}
