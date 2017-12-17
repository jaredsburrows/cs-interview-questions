package questions.linkedlist;

import api.Node;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public final class Cycle {

    @SuppressWarnings("ReferenceEquality") // we want to compare reference
    // Time - O(N), Space - O(1)
    public static boolean hasCycle(Node<Integer> head) {
        if (head == null) {
            return false;
        }

        Node<Integer> first = head;
        Node<Integer> runner = head;

        while (first.next != null && runner != null && runner.next != null) {
            first = first.next;
            runner = runner.next.next;

            if (first == runner) {
                return true;
            }
        }

        return false;
    }
}
