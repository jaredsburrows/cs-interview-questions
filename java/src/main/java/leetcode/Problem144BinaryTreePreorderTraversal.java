package leetcode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import leetcode.api.TreeNode;

/**
 * https://leetcode.com/problems/binary-tree-preorder-traversal
 * https://leetcode.com/explore/learn/card/data-structure-tree/134/traverse-a-tree/928/
 */
public final class Problem144BinaryTreePreorderTraversal {
    // iterative
    public List<Integer> preorderTraversal(TreeNode root) {
        final List<Integer> values = new ArrayList<>();
        if (root == null) {
            return values;
        }

        final Deque<TreeNode> stack = new ArrayDeque<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            final TreeNode node = stack.pop();
            values.add(node.val);

            if (node.right != null) {
                stack.push(node.right);
            }

            if (node.left != null) {
                stack.push(node.left);
            }
        }

        return values;
    }

    // recursion
    public List<Integer> preorderTraversal2(TreeNode root) {
        final List<Integer> list = new ArrayList<>();

        preorderTraversal(root, list);

        return list;
    }

    private void preorderTraversal(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }

        list.add(root.val);
        preorderTraversal(root.left, list);
        preorderTraversal(root.right, list);
    }

    // print
    public void preorderTraversal3(TreeNode node) {
        if (node == null) {
            return;
        }

        System.out.print(node.val + " ");
        preorderTraversal3(node.left);
        preorderTraversal3(node.right);
    }
}
