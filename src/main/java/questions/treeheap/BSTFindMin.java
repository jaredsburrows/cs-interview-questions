package questions.treeheap;

import api.TreeNode;

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
