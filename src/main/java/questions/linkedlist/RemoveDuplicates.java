package questions.linkedlist;

import util.Node;

public class RemoveDuplicates {

    // Time - O(N)
    public static void removeDuplicatesSorted(final Node<Integer> node) {
        if (node == null) {
            return;
        }

        Node<Integer> current = node;

        while (current.next != null) {
            if (current.value.equals(current.next.value)) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
    }
}
