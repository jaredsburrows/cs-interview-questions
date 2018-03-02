package leetcode;

import leetcode.api.ListNode;

/**
 * https://leetcode.com/problems/add-two-numbers
 */
public final class Problem2AddTwoNumbers {
    // Time - O(MAX(M, N)), Space - O(MAX(M, N))
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null || l2 == null) {
            return null;
        }

        final ListNode answer = new ListNode(0);
        ListNode runner = answer;
        int carry = 0;

        while (l1 != null || l2 != null) {
            if (l1 != null) {
                carry += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                carry += l2.val;
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
