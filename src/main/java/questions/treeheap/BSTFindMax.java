package questions.treeheap;

import api.TreeNode;

public class BSTFindMax {

    public TreeNode<Integer> findMaxNode(TreeNode<Integer> node) {
        while (node.right != null) {
            node = node.right;
        }

        return node;
    }

    public int findMaxValue(TreeNode<Integer> node) {
        return findMaxNode(node).value;
    }
}
