package crackingthecode.part1datastructures;

import java.util.HashSet;
import java.util.Set;

import util.ListNode;

public class Chapter2LinkedLists {

    /**
     * 2.1 - Write code to remove duplicates from an unsorted linked list.
     * FOLLOW UP
     * How would you solve this problem if a temporary buffer is not allowed?
     */
    public static void removeDuplicates(final ListNode listNode) {
        if (listNode == null) {
            return;
        }
        Set<Integer> unique = new HashSet<>();

        ListNode current = listNode;
        ListNode previous = null;

        boolean del = false;

        while (current != null) {
            if (del) {
                previous = current.next;

                if (current.next != null) {
                    current.next = current.next.next;
                }

                del = false;
            } else {
                current = current.next;
                del = true;
            }
        }

//        while (current != null) {
//            if (unique.contains(current.value)) {
////                current = current.next.next;
//                previous = current.next;
//                current.next = current.next.next;
//            } else {
//                unique.add(current.value);
//            }
//
//            current = previous;
//
////            current = current.next;
//        }

    }

    public static void deleteEveryOtherRecursive(ListNode listNode) {
        if (listNode != null && listNode.next != null) {
            listNode.next = listNode.next.next;
            deleteEveryOtherRecursive(listNode.next);
        }
    }

    /**
     * 2.2 - Implement an algorithm to find the nth to last element of a singly linked list.
     */
    // Time - O(N), Space - O(1)
    public static ListNode findNthLastElement(ListNode listNode, final int n) {
        if (listNode == null || n < 1) {
            return null;
        }

        ListNode temp = listNode;
        int count = 0;
        int newCount = 0;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        int element = count - n;

        while (listNode != null) {
            if (newCount == element) {
                return listNode;
            }
            newCount++;
            listNode = listNode.next;
        }

        return null;
    }

    /**
     * 2.3 - Implement an algorithm to delete a node in the middle of a single linked list, given
     * only access to that node.
     * EXAMPLE
     * Input: the node ‘c’ from the linked list a->b->c->d->e
     * Result: nothing is returned, but the new linked list looks like a->b->d->e
     */

    /**
     * 2.4 - You have two numbers represented by a linked list, where each node contains a single
     * digit. The digits are stored in reverse order, such that the 1’s digit is at the head of the
     * list. Write a function that adds the two numbers and returns the sum as a linked list.
     *
     * EXAMPLE
     * Input: (3 -> 1 -> 5) + (5 -> 9 -> 2)
     * Output: 8 -> 0 -> 8
     */

    /**
     * Given a circular linked list, implement an algorithm which returns node at the beginning of
     * the loop.
     * DEFINITION
     * Circular linked list: A (corrupt) linked list in which a node’s next pointer points to an
     * earlier node, so as to make a loop in the linked list.
     * EXAMPLE
     * input: A -> B -> C -> D -> E -> C [the same C as earlier]
     * output: C
     */

}
