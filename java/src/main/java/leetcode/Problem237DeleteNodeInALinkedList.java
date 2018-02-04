package leetcode;

import leetcode.api.ListNode;

/**
 * https://leetcode.com/problems/delete-node-in-a-linked-list
 */
public final class Problem237DeleteNodeInALinkedList {
    // Time - O(1), Space - (1)
    public void deleteNode(ListNode node) {
        if (node == null) {
            return;
        }

        node.val = node.next.val;
        node.next = node.next.next;
    }
}
