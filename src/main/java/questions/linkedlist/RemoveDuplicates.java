package questions.linkedlist;

import api.Node;

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

    public static void deleteEveryOtherRecursive(Node<Integer> node) {
        if (node != null && node.next != null) {
            node.next = node.next.next;
            deleteEveryOtherRecursive(node.next);
        }
    }
}
