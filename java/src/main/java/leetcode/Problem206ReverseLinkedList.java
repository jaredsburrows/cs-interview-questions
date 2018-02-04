package leetcode;

import leetcode.api.ListNode;

/**
 * https://leetcode.com/problems/reverse-linked-list/description
 */
public final class Problem206ReverseLinkedList {
    // Time - O(N), Space - O(1)
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode current = head;
        ListNode previous = null;

        while (current != null) {
            final ListNode temp = current.next;
            current.next = previous;
            previous = current;
            current = temp;
        }

        return previous;
    }
}
