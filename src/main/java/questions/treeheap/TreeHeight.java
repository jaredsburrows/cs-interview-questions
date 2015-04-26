package questions.treeheap;

import api.TreeNode;

public class TreeHeight {

    public int getHeight(final TreeNode treeNode) {
        if (treeNode == null) {
            return 0;
        }

        int left = getHeight(treeNode.left);
        int right = getHeight(treeNode.right);

        if (left == -1 || right == -1) {
            return -1;
        }

        // balanced tree is defined to be a tree such that no two leaf nodes differ in distance from
        // the root by more than one
        if (Math.abs(left - right) > 1) {
            return -1;
        }

        return Math.max(left, right) + 1;
    }

    public int getMinHeight(final TreeNode treeNode) {
        if (treeNode == null) {
            return 0;
        }

        return Math.min(getMinHeight(treeNode.left), getMinHeight(treeNode.right)) + 1;
    }

    public int getMaxHeight(final TreeNode treeNode) {
        if (treeNode == null) {
            return 0;
        }

        return Math.max(getMaxHeight(treeNode.left), getMaxHeight(treeNode.right)) + 1;
    }
}
