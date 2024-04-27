package leetcode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import leetcode.api.TreeNode;

/**
 * https://leetcode.com/problems/binary-tree-postorder-traversal
 */
public final class Problem145BinaryTreePostorderTraversal {
    // iterative


    // recursion
    public List<Integer> postorderTraversal2(TreeNode root) {
        List<Integer> list = new ArrayList<>();

        postorderTraversal2(root, list);

        return list;
    }

    private void postorderTraversal2(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }

        postorderTraversal2(root.left, list);
        postorderTraversal2(root.right, list);
        list.add(root.val);
    }

    // print
    public void printPostOrder(TreeNode node) {
        if (node == null) {
            return;
        }

        printPostOrder(node.left);
        printPostOrder(node.right);
        System.out.print(node.val + " ");
    }
}
