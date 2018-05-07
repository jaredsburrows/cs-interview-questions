package leetcode;

import java.util.Objects;
import leetcode.api.ListNode;

/**
 * https://leetcode.com/problems/linked-list-cycle-ii
 */
public final class Problem142LinkedListCycleII {
    public ListNode detectCycle(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (Objects.equals(slow, fast)) {
                break;
            }
        }

        if (fast == null || fast.next == null) {
            return null;
        }

        slow = head;

        while (!Objects.equals(slow, fast)) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }
}
