package leetcode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import leetcode.api.TreeNode;

/**
 * https://leetcode.com/problems/average-of-levels-in-binary-tree/description
 */
public final class Problem637AverageOfLevelsInBinaryTree {
    public static List<Double> averageOfLevels(TreeNode root) {
        final List<Double> averages = new ArrayList<>();
        if (root == null) {
            return averages;
        }

        final Deque<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelNodes = queue.size();
            final int currentLevelNodes = levelNodes;
            double currentTotal = 0.0d;

            while (levelNodes > 0) {
                final TreeNode node = queue.poll();
                currentTotal += node.val;

                if (node.left != null) {
                    queue.offer(node.left);
                }

                if (node.right != null) {
                    queue.offer(node.right);
                }

                levelNodes--;
            }

            final double currentAverage = currentTotal / currentLevelNodes;
            averages.add(currentAverage);
        }

        return averages;
    }
}
