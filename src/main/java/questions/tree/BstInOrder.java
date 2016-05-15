package questions.tree;

import api.TreeNode;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public class BstInOrder {

    public static void printInOrder(final TreeNode<Integer> node) {
        if (node == null) {
            return;
        }

        printInOrder(node.left);
        System.out.print(node.value + " ");
        printInOrder(node.right);
    }
}
