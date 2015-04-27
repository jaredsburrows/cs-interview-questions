package questions.treeheap;

import api.TreeNode;

public class EqualTree {

    public <T> boolean isEqual(final TreeNode<T> treeNode, final TreeNode<T> treeNode2) {
        if (treeNode == null && treeNode2 == null) {
            return true;
        }

        if (treeNode == null || treeNode2 == null) {
            return false;
        }

        return treeNode.value == treeNode2.value
                && isEqual(treeNode.left, treeNode2.left)
                && isEqual(treeNode.right, treeNode2.right);
    }
}
