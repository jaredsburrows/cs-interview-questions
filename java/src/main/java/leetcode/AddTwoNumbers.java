package leetcode;

import api.Node;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public final class AddTwoNumbers {
    // Time - O(MAX(M, N)), Space - O(MAX(M, N))
    public static Node<Integer> addTwoNumbers(Node<Integer> node, Node<Integer> node2) {
        if (node == null || node2 == null) {
            return null;
        }

        final Node<Integer> answer = new Node<>();
        Node<Integer> head = answer;
        int carry = 0;

        while (node != null || node2 != null) {
            if (node != null) {
                carry += node.value;
                node = node.next;
            }

            if (node2 != null) {
                carry += node2.value;
                node2 = node2.next;
            }

            final int lastInt = carry % 10;
            head.next = new Node<>(lastInt);
            head = head.next;
            carry = carry / 10;
        }

        if (carry == 1) {
            head.next = new Node<>(1);
        }

        return answer.next;
    }
}
