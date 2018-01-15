package leetcode;

import leetcode.api.ListNode;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public final class Problem2AddTwoNumbers {
    // Time - O(MAX(M, N)), Space - O(MAX(M, N))
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null || l2 == null) {
            return null;
        }

        final ListNode answer = new ListNode(0);
        ListNode runner = answer;
        int carry = 0;

        while (l1 != null || l2 != null) {
            if (l1 != null) {
                carry += l1.value;
                l1 = l1.next;
            }

            if (l2 != null) {
                carry += l2.value;
                l2 = l2.next;
            }

            runner.next = new ListNode(carry % 10);
            runner = runner.next;
            carry /= 10;
        }

        if (carry == 1) {
            runner.next = new ListNode(1);
        }

        return answer.next;
    }
}
