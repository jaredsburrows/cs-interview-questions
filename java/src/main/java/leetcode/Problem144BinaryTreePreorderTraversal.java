package leetcode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import leetcode.api.TreeNode;

/**
 * https://leetcode.com/problems/binary-tree-preorder-traversal
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

        preOrderRecursion(root, list);

        return list;
    }

    private static void preOrderRecursion(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }

        list.add(root.val);
        preOrderRecursion(root.left, list);
        preOrderRecursion(root.right, list);
    }

    // print via recursion
    public void preorderTraversal3(TreeNode node) {
        if (node == null) {
            return;
        }

        System.out.print(node.val + " ");
        preorderTraversal3(node.left);
        preorderTraversal3(node.right);
    }
}
