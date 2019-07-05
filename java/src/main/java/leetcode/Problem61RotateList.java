package leetcode;

import leetcode.api.ListNode;

/**
 * https://leetcode.com/problems/rotate-list/
 * https://leetcode.com/explore/learn/card/linked-list/213/conclusion/1295/
 */
public final class Problem61RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || k < 0) {
            return head;
        }

        ListNode copy = head;
        int length = 1;

        while (copy.next != null) {
            copy = copy.next;

            length++;
        }

        copy.next = head;

        for (int i = 1; i < length - k % length; i++) {
            head = head.next;
        }

        copy = head.next;
        head.next = null;

        return copy;
    }
}
