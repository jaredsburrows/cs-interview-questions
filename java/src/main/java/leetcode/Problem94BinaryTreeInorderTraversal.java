package leetcode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import leetcode.api.TreeNode;

/**
 * https://leetcode.com/problems/binary-tree-inorder-traversal
 */
public final class Problem94BinaryTreeInorderTraversal {
    // iterative
    public List<Integer> inorderTraversal(TreeNode root) {
        final List<Integer> values = new ArrayList<>();
        if (root == null) {
            return values;
        }

        final Deque<TreeNode> stack = new ArrayDeque<>();
        TreeNode current = root;

        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }

            current = stack.pop();
            values.add(current.val);
            current = current.right;
        }

        return values;
    }

    // recursion
    public List<Integer> inorderTraversal2(TreeNode root) {
        final List<Integer> list = new ArrayList<>();

        inorderTraversal2(root, list);

        return list;
    }

    private static void inorderTraversal2(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }

        inorderTraversal2(root.left, list);
        list.add(root.val);
        inorderTraversal2(root.right, list);
    }

    // print
    public void inorderTraversal3(TreeNode node) {
        if (node == null) {
            return;
        }

        inorderTraversal3(node.left);
        System.out.print(node.val + " ");
        inorderTraversal3(node.right);
    }
}
