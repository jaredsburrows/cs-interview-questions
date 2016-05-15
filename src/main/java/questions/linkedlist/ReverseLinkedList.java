package questions.linkedlist;


import api.Node;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public class ReverseLinkedList {

    public static Node<Integer> reverse(final Node<Integer> node) {

        Node<Integer> current = node;
        Node<Integer> previous = null;
        while (current != null) {
            Node<Integer> temp = current.next;
            current.next = previous;
            previous = current;
            current = temp;
        }

        return previous;
    }
}
