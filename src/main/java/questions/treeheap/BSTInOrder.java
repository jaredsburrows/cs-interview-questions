package questions.treeheap;

import api.TreeNode;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
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
