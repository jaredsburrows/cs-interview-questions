package leetcode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import leetcode.api.TreeNode;

/**
 * https://leetcode.com/problems/average-of-levels-in-binary-tree
 */
public final class Problem637AverageOfLevelsInBinaryTree {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> averages = new ArrayList<>();
        if (root == null) {
            return averages;
        }

        Deque<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            int currentLevel = size;
            double currentTotal = 0.0d;

            while (size > 0) {
                TreeNode node = queue.poll();
                if (node != null) {
                    currentTotal += node.val;

                    if (node.left != null) {
                        queue.offer(node.left);
                    }

                    if (node.right != null) {
                        queue.offer(node.right);
                    }
                }

                size--;
            }

            double currentAverage = currentTotal / currentLevel;
            averages.add(currentAverage);
        }

        return averages;
    }
}
