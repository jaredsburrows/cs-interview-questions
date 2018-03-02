package leetcode;

import leetcode.api.TreeLinkNode;

/**
 * https://leetcode.com/problems/populating-next-right-pointers-in-each-node
 */
public final class Problem116PopulatingNextRightPointersInEachNode {
    public void connect(TreeLinkNode root) {
        if (root == null) {
            return;
        }

        TreeLinkNode levelNode = root;
        while (levelNode != null) {
            TreeLinkNode currentNode = levelNode;

            while (currentNode != null) {
                if (currentNode.left != null) {
                    currentNode.left.next = currentNode.right;
                }

                if (currentNode.right != null && currentNode.next != null) {
                    currentNode.right.next = currentNode.next.left;
                }

                currentNode = currentNode.next;
            }

            levelNode = levelNode.left;
        }
    }
}
