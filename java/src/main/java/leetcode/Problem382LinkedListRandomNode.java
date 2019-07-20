package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import leetcode.api.ListNode;

/**
 * https://leetcode.com/problems/linked-list-random-node/
 */
@SuppressWarnings("ClassCanBeStatic") // Leetcode is not static
public final class Problem382LinkedListRandomNode {
    final class Solution {
        private final List<Integer> numbers = new ArrayList<>();
        /** @param head The linked list's head.
        Note that the head is guaranteed to be not null, so it contains at least one node. */
        public Solution(ListNode head) {
            while (head != null) {
                numbers.add(head.val);

                head = head.next;
            }
        }

        /** Returns a random node's value. */
        public int getRandom() {
            Collections.shuffle(numbers);

            return numbers.get(ThreadLocalRandom.current().nextInt(numbers.size()));
        }
    }
}
