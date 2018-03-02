package leetcode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import leetcode.api.TreeNode;

/**
 * https://leetcode.com/problems/binary-tree-level-order-traversal
 */
public final class Problem102BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }

        final Deque<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);

        final List<List<Integer>> data = new ArrayList<>();

        while (!queue.isEmpty()) {
            final List<Integer> integers = new ArrayList<>();
            int levelNodes = queue.size();

            while (levelNodes > 0) {
                final TreeNode node = queue.poll();
                integers.add(node.val);

                if (node.left != null) {
                    queue.add(node.left);
                }

                if (node.right != null) {
                    queue.add(node.right);
                }

                levelNodes--;
            }

            data.add(integers);
        }

        return data;
    }

    // print
    public void levelOrder2(TreeNode root) {
        if (root == null) {
            return;
        }

        final Deque<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelNodes = queue.size();

            while (levelNodes > 0) {
                final TreeNode node = queue.poll();
                System.out.print(node.val + " ");

                if (node.left != null) {
                    queue.offer(node.left);
                }

                if (node.right != null) {
                    queue.offer(node.right);
                }

                levelNodes--;
            }
        }
    }
}
