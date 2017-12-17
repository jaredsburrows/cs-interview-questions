package questions.linkedlist;

import api.Node;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public final class MergeTwoSortedLinkedLists {
    // Time - O(N), Space - O(N)
    public static Node<Integer> merge(Node<Integer> left, Node<Integer> right) {
        if (left == null && right == null) {
            return null;
        }

        Node<Integer> leftNode = left;
        Node<Integer> rightNode = right;

        final Node<Integer> answer = new Node<>();
        Node<Integer> merge = answer;

        while (leftNode != null && rightNode != null) {
            if (leftNode.value <= rightNode.value) {
                merge.next = leftNode;
                leftNode = leftNode.next;
            } else {
                merge.next = rightNode;
                rightNode = rightNode.next;
            }

            merge = merge.next;
        }

        if (leftNode != null) {
            merge.next = leftNode;
        }

        if (rightNode != null) {
            merge.next = rightNode;
        }

        return answer.next;
    }
}
