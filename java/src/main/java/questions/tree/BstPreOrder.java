package questions.tree;

import api.TreeNode;

public final class BstPreOrder {
    public static void printPreOrder(TreeNode<Integer> node) {
        if (node == null) {
            return;
        }

        System.out.print(node.value + " ");
        printPreOrder(node.left);
        printPreOrder(node.right);
    }
}
