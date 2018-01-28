package questions;

import api.Node;

public final class RemoveEveryOther {
    // Time - O(N), Space - O(1)
    public static void deleteEveryOtherRecursive(Node<Integer> node) {
        if (node != null && node.next != null) {
            node.next = node.next.next;
            deleteEveryOtherRecursive(node.next);
        }
    }
}
