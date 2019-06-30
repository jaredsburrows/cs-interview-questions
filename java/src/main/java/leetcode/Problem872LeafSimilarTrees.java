package leetcode;

import java.util.ArrayList;
import java.util.List;
import leetcode.api.TreeNode;

/**
 * https://leetcode.com/problems/leaf-similar-trees/
 */
public final class Problem872LeafSimilarTrees {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) {
            return true;
        }

        if (root1 == null || root2 == null) {
            return false;
        }

        List<Integer> leftNodes = new ArrayList<>();
        List<Integer> rightNodes = new ArrayList<>();
        addLeafNodes(root1, leftNodes);
        addLeafNodes(root2, rightNodes);

        return leftNodes.equals(rightNodes);
    }

    private static void addLeafNodes(TreeNode node, List<Integer> nodes) {
        if (node == null) {
            return;
        }

        if (node.left == null && node.right == null) {
            nodes.add(node.val);
        }

        addLeafNodes(node.left, nodes);
        addLeafNodes(node.right, nodes);
    }
}
