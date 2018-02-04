package leetcode;

import leetcode.api.ListNode;

/**
 * https://leetcode.com/problems/linked-list-cycle/description
 */
public final class Problem141LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }
}
