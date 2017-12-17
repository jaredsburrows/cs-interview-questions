package questions.linkedlist;

import api.Node;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public final class RemoveEveryOther {
    // Time - O(N), Space - O(1)
    public static void deleteEveryOtherRecursive(Node<Integer> node) {
        if (node != null && node.next != null) {
            node.next = node.next.next;
            deleteEveryOtherRecursive(node.next);
        }
    }
}
