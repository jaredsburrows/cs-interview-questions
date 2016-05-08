package questions.linkedlist;

import api.Node;

public class RemoveEveryOther {

    // Time - O(N)
    public static void deleteEveryOtherRecursive(Node<Integer> node) {
        if (node != null && node.next != null) {
            node.next = node.next.next;
            deleteEveryOtherRecursive(node.next);
        }
    }
}
