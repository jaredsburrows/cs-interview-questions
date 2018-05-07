package leetcode;

import java.util.Objects;
import leetcode.api.ListNode;

/**
 * https://leetcode.com/problems/linked-list-cycle
 */
public final class Problem141LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (Objects.equals(slow, fast)) {
                return true;
            }
        }

        return false;
    }
}
