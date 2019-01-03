package leetcode;

import java.util.Objects;
import leetcode.api.ListNode;
import leetcode.api.TreeNode;

/**
 * https://leetcode.com/problems/convert-sorted-list-to-binary-search-tree
 */
public final class Problem109ConvertSortedListToBinarySearchTree {
    public TreeNode sortedListToBST(ListNode head) {
        if (head == null) {
            return null;
        }

        return sortedListToBST(head, null);
    }

    private static TreeNode sortedListToBST(ListNode head, ListNode tail) {
        ListNode slow = head;
        ListNode fast = head;

        if (Objects.equals(slow, tail)) {
            return null;
        }

        while (!Objects.equals(fast, tail) && Objects.equals(fast.next, tail)) {
            slow = slow.next;
            fast = fast.next.next;
        }

        final TreeNode node = new TreeNode(slow.val);
        node.left = sortedListToBST(head, slow);
        node.right = sortedListToBST(slow.next, tail);
        return node;
    }
}
