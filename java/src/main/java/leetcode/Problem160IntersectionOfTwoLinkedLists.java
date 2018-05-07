package leetcode;

import java.util.Objects;
import leetcode.api.ListNode;

/**
 * https://leetcode.com/problems/intersection-of-two-linked-lists
 */
public final class Problem160IntersectionOfTwoLinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }

        ListNode runnerA = headA;
        ListNode runnerB = headB;

        while (!Objects.equals(runnerA, runnerB)) {
            runnerA = runnerA == null ? headB : runnerA.next;
            runnerB = runnerB == null ? headA : runnerB.next;
        }

        return runnerA;
    }
}
