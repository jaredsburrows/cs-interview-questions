package leetcode;

import leetcode.api.ListNode;

/**
 * https://leetcode.com/problems/reverse-linked-list
 * https://leetcode.com/explore/featured/card/recursion-i/251/scenario-i-recurrence-relation/2378/
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
            ListNode temp = current.next;
            current.next = previous;
            previous = current;
            current = temp;
        }

        return previous;
    }

    // recursive
    public ListNode reverseList2(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode listNode = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return listNode;
    }
}
