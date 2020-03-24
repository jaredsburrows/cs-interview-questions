package leetcode;

import leetcode.api.ImmutableListNode;

/**
 * https://leetcode.com/problems/print-immutable-linked-list-in-reverse/
 */
public final class Problem1265PrintImmutableLinkedListInReverse {
    public void printLinkedListInReverse(ImmutableListNode head) {
        if (head == null) {
            return;
        }

        printLinkedListInReverse(head.getNext());
        head.printValue();
    }
}
