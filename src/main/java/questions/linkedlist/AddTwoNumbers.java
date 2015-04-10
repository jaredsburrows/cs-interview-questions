package questions.linkedlist;

import util.ListNode;

public class AddTwoNumbers {
    /**
     * You are given two linked lists representing two non-negative numbers. The digits are stored
     * in reverse order and each of their nodes contain a single digit. Add the two numbers and
     * return it as a linked list.
     * <p/>
     * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
     * Output: 7 -> 0 -> 8
     */
    // node1 and node2 numbers are stored forwards
    // the answer node is backwards
    public static ListNode addTwoNumbers(ListNode node1, ListNode node2) {
        if (node1 == null || node2 == null) {
            return null;
        }

        int carry = 0;
        final ListNode answer = new ListNode(0);
        ListNode head = answer;

        while (node1 != null || node2 != null) {
            if (node1 != null) {
                carry += node1.value;
                node1 = node1.next;
            }

            if (node2 != null) {
                carry += node2.value;
                node2 = node2.next;
            }

            head.next = new ListNode(carry % 10);
            head = head.next;
            carry /= 10;
        }

        if (carry == 1) {
            head.next = new ListNode(1);
        }

        return answer.next;
    }
}
