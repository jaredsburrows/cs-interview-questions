package questions.tree;

import api.TreeNode;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public class TreeHeight {

    public static <T> int getHeight(final TreeNode<T> treeNode) {
        if (treeNode == null) {
            return 0;
        }

        final int left = getHeight(treeNode.left);
        final int right = getHeight(treeNode.right);

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

    public static <T> int getMinHeight(final TreeNode<T> treeNode) {
        if (treeNode == null) {
            return 0;
        }

//        if (treeNode.left == null) {
//            return getMinHeight(treeNode.right) + 1;
//        }
//
//        if (treeNode.right == null) {
//            return getMinHeight(treeNode.left) + 1;
//        }

        return Math.min(getMinHeight(treeNode.left), getMinHeight(treeNode.right)) + 1;
    }

    public static <T> int getMaxHeight(final TreeNode<T> treeNode) {
        if (treeNode == null) {
            return 0;
        }

        return Math.max(getMaxHeight(treeNode.left), getMaxHeight(treeNode.right)) + 1;
    }
}
