package leetcode;

import leetcode.api.ListNode;

/**
 * https://leetcode.com/problems/merge-two-sorted-lists https://leetcode.com/explore/learn/card/recursion-i/253/conclusion/2382/
 */
public final class Problem21MergeTwoSortedLists {
    // Iterative - Time - O(min(N, M)), Space - O(1) with starter node reference
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
            return null;
        }

        if (l1 == null) {
            return l2;
        }

        if (l2 == null) {
            return l1;
        }

        ListNode p1 = l1;
        ListNode p2 = l2;

        ListNode toReturn = new ListNode(0);
        ListNode head = toReturn;

        while (p1 != null && p2 != null) {
            if (p1.val <= p2.val) {
                head.next = p1;
                p1 = p1.next;
            } else {
                head.next = p2;
                p2 = p2.next;
            }

            head = head.next;
        }

        if (p1 != null) {
            head.next = p1;
        }

        if (p2 != null) {
            head.next = p2;
        }

        return toReturn.next;
    }

    // Recursive - Time - Time - O(min(N, M))
    public ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
            return null;
        }

        if (l1 == null) {
            return l2;
        }

        if (l2 == null) {
            return l1;
        }

        if (l1.val < l2.val) {
            return new ListNode(l1.val, mergeTwoLists2(l1.next, l2));
        } else {
            return new ListNode(l2.val, mergeTwoLists2(l1, l2.next));
        }
    }
}
