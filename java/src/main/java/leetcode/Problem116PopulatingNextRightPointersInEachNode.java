package leetcode;

import leetcode.api.Node;

/**
 * https://leetcode.com/problems/populating-next-right-pointers-in-each-node
 */
public final class Problem116PopulatingNextRightPointersInEachNode {
    public Node connect(Node root) {
        if (root == null) {
            return null;
        }

        Node levelNode = root;
        while (levelNode != null) {
            Node currentNode = levelNode;

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

        return root;
    }
}
