package leetcode;

import leetcode.api.ListNode;

/**
 * https://leetcode.com/problems/remove-duplicates-from-sorted-list/description
 */
public final class Problem83RemoveDuplicatesFromSortedList {
    // Time - O(N), Space - O(1)
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode current = head;

        while (current.next != null) {
            if (current.val == current.next.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

        return head;
    }
}
