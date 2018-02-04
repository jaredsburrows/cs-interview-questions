package leetcode

import leetcode.api.TreeNode

/**
 * https://leetcode.com/explore/learn/card/introduction-to-data-structure-binary-search-tree/141/basic-operations-in-a-bst/1003/
 */
class ExploreInsertIntoABinarySearchTree {
    fun insertIntoBST(root: TreeNode? = null, value: Int): TreeNode {
        if (root == null) {
            return TreeNode(value)
        }

        if (value > root.value) {
            root.right = insertIntoBST(root.right, value)
        } else {
            root.left = insertIntoBST(root.left, value)
        }

        return root
    }
}
