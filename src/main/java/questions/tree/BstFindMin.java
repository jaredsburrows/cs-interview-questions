package questions.tree;

import api.TreeNode;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public class BstFindMin {

    public static TreeNode<Integer> findMinNode(TreeNode<Integer> root) {
        while (root.left != null) {
            root = root.left;
        }

        return root;
    }

    public static int findMinValue(final TreeNode<Integer> root) {
        return findMinNode(root).value;
    }
}
