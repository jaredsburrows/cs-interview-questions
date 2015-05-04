package questions.treeheap;

import api.TreeNode;

public class BSTContains {

    public boolean contains(TreeNode<Integer> root, int value) {
        if (root == null) {
            return false;
        }

        if (value == root.value) {
            return true;
        } else if (value < root.value) {
            return contains(root.left, value);
        } else if (value > root.value) {
            return contains(root.right, value);
        }

        return false;
    }
}
