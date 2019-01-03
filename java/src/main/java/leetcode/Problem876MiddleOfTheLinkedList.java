package leetcode;

import leetcode.api.ListNode;

/**
 * https://leetcode.com/problems/middle-of-the-linked-list/
 */
public final class Problem876MiddleOfTheLinkedList {
    // Time - O(N), Space - O(1)
    public ListNode middleNode(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}
