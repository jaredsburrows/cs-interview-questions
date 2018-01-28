package leetcode;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import leetcode.api.ListNode;

/**
 * https://leetcode.com/problems/merge-k-sorted-lists/description
 */
public final class Problem23MergeKLists {
    public static ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }

        final Queue<ListNode> queue =
            new PriorityQueue<>(Comparator.comparingInt(left -> left.val));

        for (ListNode listNode : lists) {
            if (listNode != null) {
                queue.add(listNode);
            }
        }

        final ListNode head = new ListNode(0);
        ListNode tail = head;

        while (!queue.isEmpty()) {
            tail.next = queue.poll();
            tail = tail.next;

            if (tail.next != null) {
                queue.add(tail.next);
            }
        }

        return head.next;
    }
}
