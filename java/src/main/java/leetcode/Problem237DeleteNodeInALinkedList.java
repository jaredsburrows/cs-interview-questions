package leetcode;

import api.Node;

/**
 * https://leetcode.com/problems/delete-node-in-a-linked-list
 *
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public final class Problem237DeleteNodeInALinkedList {
    // Time - O(1), Space - (1)
    public static void deleteNode(Node<Integer> node) {
        if (node == null) {
            return;
        }

        node.value = node.next.value;
        node.next = node.next.next;
    }
}
