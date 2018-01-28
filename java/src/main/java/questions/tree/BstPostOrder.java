package questions.tree;

import api.TreeNode;

public final class BstPostOrder {
    public static void printPostOrder(TreeNode<Integer> node) {
        if (node == null) {
            return;
        }

        printPostOrder(node.left);
        printPostOrder(node.right);
        System.out.print(node.value + " ");
    }
}
