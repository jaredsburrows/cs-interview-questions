package questions.treeheap;

import api.TreeNode;

public class BSTPostOrder {

    public void printPostOrder(TreeNode<Integer> node) {
        if (node == null) {
            return;
        }

        printPostOrder(node.left);
        printPostOrder(node.right);
        System.out.println(node.value);
    }

}
