package leetcode;

import java.util.ArrayDeque;
import java.util.Queue;
import leetcode.api.TreeNode;

public final class Problem226InvertBinaryTree {
    public static TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        invert(root);

        return root;
    }

    private static void invert(TreeNode root) {
        if (root == null) {
            return;
        }

        final TreeNode temp = root.right;
        root.right = root.left;
        root.left = temp;

        invert(root.left);
        invert(root.right);
    }

    public static TreeNode reverseTree2(TreeNode root) {
        if (root == null) {
            return null;
        }

        final Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            final TreeNode node = queue.poll();

            if (node.left != null) {
                queue.add(node.left);
            }

            if (node.right != null) {
                queue.add(node.right);
            }

            final TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;
        }

        return root;
    }
}
