package leetcode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import leetcode.api.TreeNode;

/**
 * https://leetcode.com/problems/find-largest-value-in-each-tree-row
 */
public final class Problem515FindLargestValueInEachTreeRow {
    public List<Integer> largestValues(TreeNode root) {
        final List<Integer> largest = new ArrayList<>();
        if (root == null) {
            return largest;
        }

        final Deque<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            int max = Integer.MIN_VALUE;

            while (size > 0) {
                final TreeNode node = queue.poll();
                max = Math.max(max, node.val);

                if (node.left != null) {
                    queue.offer(node.left);
                }

                if (node.right != null) {
                    queue.offer(node.right);
                }

                size--;
            }

            largest.add(max);
        }

        return largest;
    }
}
