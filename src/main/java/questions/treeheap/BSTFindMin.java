package questions.treeheap;

import api.TreeNode;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public class BSTFindMin {

    public TreeNode<Integer> findMinNode(TreeNode<Integer> root) {
        while (root.left != null) {
            root = root.left;
        }

        return root;
    }

    public int findMinValue(TreeNode<Integer> root) {
        return findMinNode(root).value;
    }
}
