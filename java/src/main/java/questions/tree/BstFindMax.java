package questions.tree;

import api.TreeNode;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public final class BstFindMax {

    public static TreeNode<Integer> findMaxNode(TreeNode<Integer> node) {
        while (node.right != null) {
            node = node.right;
        }

        return node;
    }

    public static int findMaxValue(TreeNode<Integer> node) {
        return findMaxNode(node).value;
    }
}
