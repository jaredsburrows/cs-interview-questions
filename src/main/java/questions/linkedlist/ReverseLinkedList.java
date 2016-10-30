package questions.linkedlist;


import api.Node;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public final class ReverseLinkedList {

    public static Node<Integer> reverse(final Node<Integer> node) {

        Node<Integer> current = node;
        Node<Integer> previous = null;

        while (current != null) {
            // Save off next node
            final Node<Integer> temp = current.next;

            // Point the first node to the new "null" node
            current.next = previous;

            // Update the previous
            previous = current;

            // Update the current node with the next node in the original linked list
            current = temp;
        }

        return previous;
    }
}
