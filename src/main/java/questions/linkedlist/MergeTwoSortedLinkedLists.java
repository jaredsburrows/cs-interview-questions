package questions.linkedlist;

import api.Node;

public class MergeTwoSortedLinkedLists {

    public static Node<Integer> merge(final Node<Integer> left, final Node<Integer> right) {
        if (left == null || right == null) {
            return null;
        }

        Node<Integer> l = left;
        Node<Integer> r = right;

        final Node<Integer> answer = new Node<>();
        Node<Integer> merge = answer;

        while (l != null && r != null) {
            if (l.value <= r.value) {
                merge.next = l;
                l = l.next;
            } else {
                merge.next = r;
                r = r.next;
            }

            merge = merge.next;
        }

        if (l != null) {
            merge.next = l;
        }

        if (r != null) {
            merge.next = r;
        }

        return answer.next;
    }
}
