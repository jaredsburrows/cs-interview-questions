package questions.treeheap;

import api.TreeNode;

public class BSTInOrder {

    public void printInOrder(TreeNode<Integer> node) {
        if (node == null) {
            return;
        }

        printInOrder(node.left);
        System.out.println(node.value);
        printInOrder(node.right);
    }
}
