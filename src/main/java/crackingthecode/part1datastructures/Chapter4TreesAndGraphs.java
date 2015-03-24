package crackingthecode.part1datastructures;

import questions.util.TreeNode;

public class Chapter4TreesAndGraphs {

    /**
     * 4.1 - Implement a function to check if a tree is balanced. For the purposes of this question,
     * a balanced tree is defined to be a tree such that no two leaf nodes differ in distance from
     * the root by more than one.
     */
    public static boolean isBalanced(final TreeNode treeNode) {
        return treeNode == null || getHeight(treeNode) != -1;

    }

    static int getHeight(final TreeNode treeNode) {
        if (treeNode == null) {
            return 0;
        }

        int left = getHeight(treeNode.left);
        int right = getHeight(treeNode.right);

        if (left == -1 || right == -1) {
            return -1;
        }

        if (Math.abs(left - right) > 1) {
            return -1;
        }

        return Math.max(left, right) + 1;
    }

}
