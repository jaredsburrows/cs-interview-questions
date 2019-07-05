package leetcode;

import java.util.Objects;
import leetcode.api.ListNode;

/**
 * https://leetcode.com/problems/linked-list-cycle
 * https://leetcode.com/explore/learn/card/linked-list/214/two-pointer-technique/1212/
 */
public final class Problem141LinkedListCycle {
    // Time - O(N), Space - O(1)
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
