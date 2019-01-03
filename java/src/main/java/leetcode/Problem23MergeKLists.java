package leetcode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import leetcode.api.ListNode;

/**
 * https://leetcode.com/problems/merge-k-sorted-lists
 */
@SuppressWarnings("ClassCanBeStatic") // TODO move to api package
public final class Problem23MergeKLists {
    // Time - O(N*LOG(K))
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }

        Queue<ListNode> queue =
            new PriorityQueue<>(Comparator.comparingInt(left -> left.val));

        for (ListNode listNode : lists) {
            if (listNode != null) {
                queue.add(listNode);
            }
        }

        ListNode head = new ListNode(0);
        ListNode tail = head;

        while (!queue.isEmpty()) {
            tail.next = queue.poll();
            tail = tail.next;

            if (tail.next != null) {
                queue.add(tail.next);
            }
        }

        return head.next;
    }

    // Time - O(N*LOG(K))
    public List<Integer> mergeKLists(int[][] arrays) {
        List<Integer> toReturn = new ArrayList<>();
        if (arrays == null || arrays.length == 0 || arrays[0].length == 0) {
            return toReturn;
        }

        Queue<Node> queue = new PriorityQueue<>((left, right) -> {
            if (left.hasData() && right.hasData()) {
                return Integer.compare(left.array[left.pos], right.array[right.pos]);
            }

            return left.hasData() ? left.array[left.pos] : right.array[right.pos];
        });

        for (int[] array : arrays) {
            Node node = new Node(array);
            queue.add(node);
        }

        while (!queue.isEmpty()) {
            Node node = queue.poll();
            if (node.hasData()) {
                toReturn.add(node.array[node.pos]);
                node.pos++;
                queue.add(node);
            }
        }

        return toReturn;
    }

    private class Node {
        final int[] array;
        int pos;

        public Node(int[] array) {
            this.array = array;
        }

        public boolean hasData() {
            return pos < array.length;
        }
    }
}
