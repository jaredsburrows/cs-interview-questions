package leetcode;

import leetcode.api.ListNode;

/**
 * https://leetcode.com/problems/remove-linked-list-elements/
 * https://leetcode.com/explore/learn/card/linked-list/219/classic-problems/1207/
 */
public final class Problem203RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }

        ListNode current = head;

        while (current.next != null) {
            if (current.next.val == val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

        return head.val == val ? head.next : head;
    }
}
