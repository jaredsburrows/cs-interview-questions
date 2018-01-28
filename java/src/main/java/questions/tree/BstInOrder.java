package questions.tree;

import api.TreeNode;

public final class BstInOrder {
    public static void printInOrder(TreeNode<Integer> node) {
        if (node == null) {
            return;
        }

        printInOrder(node.left);
        System.out.print(node.value + " ");
        printInOrder(node.right);
    }
}
