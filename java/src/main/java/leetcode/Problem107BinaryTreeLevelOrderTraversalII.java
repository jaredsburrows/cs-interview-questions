package leetcode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import leetcode.api.TreeNode;

/**
 * https://leetcode.com/problems/binary-tree-level-order-traversal-ii/
 */
public final class Problem107BinaryTreeLevelOrderTraversalII {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }

        Deque<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);

        List<List<Integer>> data = new ArrayList<>();

        while (!queue.isEmpty()) {
            List<Integer> integers = new ArrayList<>();
            int levelNodes = queue.size();

            while (levelNodes > 0) {
                TreeNode node = queue.poll();
                if (node != null) {
                    integers.add(node.val);

                    if (node.left != null) {
                        queue.add(node.left);
                    }

                    if (node.right != null) {
                        queue.add(node.right);
                    }
                }

                levelNodes--;
            }

            data.add(0, integers);
        }

        return data;
    }
}
