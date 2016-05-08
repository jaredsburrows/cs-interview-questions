package questions.treeheap;

import api.TreeNode;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public class BSTPreOrder {

    public void printPreOrder(TreeNode<Integer> node) {
        if (node == null) {
            return;
        }

        System.out.println(node.value);
        printPreOrder(node.left);
        printPreOrder(node.right);
    }
}
