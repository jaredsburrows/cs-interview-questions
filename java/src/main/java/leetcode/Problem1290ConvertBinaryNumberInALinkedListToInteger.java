package leetcode;

import leetcode.api.ListNode;

/**
 * https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/
 */
public final class Problem1290ConvertBinaryNumberInALinkedListToInteger {
    // Bitwise operators
    public int getDecimalValue(ListNode head) {
        if (head == null) {
            return 0;
        }

        int sum = 0;
        while (head != null) {
            sum = (sum << 1) | head.val;
            head = head.next;
        }
        return sum;
    }

    // Bitwise + adding
    public int getDecimalValue2(ListNode head) {
        int sum = 0;
        while (head != null) {
            sum <<= 1;
            sum += head.val;
            head = head.next;
        }
        return sum;
    }

    // Reverse + adding
    public int getDecimalValue3(ListNode head) {
        if (head == null) {
            return 0;
        }

        ListNode current = head;
        ListNode previous = null;

        while (current != null) {
            ListNode temp = current.next;
            current.next = previous;
            previous = current;
            current = temp;
        }

        int count = 0;
        int sum = 0;
        while (previous != null) {
            sum = (int) (sum + (previous.val % 10) * Math.pow(2, count++));
            previous = previous.next;
        }

        return sum;
    }
}
