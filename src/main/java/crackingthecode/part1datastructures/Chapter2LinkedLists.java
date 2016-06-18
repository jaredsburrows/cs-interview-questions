package crackingthecode.part1datastructures;

import api.Node;

import java.util.HashSet;
import java.util.Set;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public class Chapter2LinkedLists {

    /**
     * 2.1 - Write code to remove duplicates from an unsorted linked list.
     * FOLLOW UP
     * How would you solve this problem if a temporary buffer is not allowed?
     */
    // Time - O(N)
    public static void removeDuplicates(final Node<Integer> node) {
        if (node == null) {
            return;
        }

        final Set<Integer> integers = new HashSet<>();

        Node<Integer> current = node;
        Node<Integer> previous = null;

        while (current != null) {
            if (integers.contains(current.value)) {
                if (previous != null) {
                    previous.next = current.next;
                }
            } else {
                integers.add(current.value);
                previous = current;
            }
            current = current.next;
        }
    }

    // Time - O(N^2), Space - O(1)
    public static void removeDuplicates2(final Node<Integer> node) {
        if (node == null) {
            return;
        }

        Node<Integer> runner = node;
        Node<Integer> runner2 = node;
        Node<Integer> previous = null;

        while (runner != null) {
            while (runner2.next != null) {
                if (runner.value.equals(runner2.value)) {
                    if (previous != null) {
                        previous.next = runner2.next;
                    }
                } else {
                    previous = runner2;
                }
                runner2 = runner2.next;
            }
            runner = runner.next;
        }
    }

    // Time - O(N^2)
    public static void removeDuplicates3(final Node<Integer> node) {
        if (node == null) {
            return;
        }

        Node<Integer> current = node;

        while (current != null) {
            Node<Integer> runner = current;
            while (runner.next != null) {
                if (runner.next.value.equals(current.value)) {
                    runner.next = runner.next.next;
                } else {
                    runner = runner.next;
                }
            }
            current = current.next;
        }
    }

    // book
    public static void deleteDupsC(final Node<Integer> head) {
        if (head == null) {
            return;
        }

        Node<Integer> previous = head;
        Node<Integer> current = previous.next;
        while (current != null) {
            // Look backwards for dups, and remove any that you see.
            Node<Integer> runner = head;
            while (runner != current) {
                if (runner.value.equals(current.value)) {
                    Node<Integer> tmp = current.next;
                    previous.next = tmp;
                    current = tmp;
                    /* We know we can't have more than one dup preceding
                     * our element since it would have been removed
                     * * earlier. */
                    break;
                }
                runner = runner.next;
            }

            /* If runner == current, then we didn't find any duplicate
             * elements in the previous for loop.  We then need to
             * increment current.
             * If runner != current, then we must have hit the ‘break’
             * condition, in which case we found a dup and current has
             * already been incremented.*/
            if (runner == current) {
                previous = current;
                current = current.next;
            }
        }
    }

    /**
     * 2.2 - Implement an algorithm to find the nth to last element of a singly linked list.
     */
    // Time - O(N), Space - O(1)
    public static Node<Integer> findNthLastElement(Node<Integer> head, final int position) {
        if (head == null || position < 1) {
            return null;
        }

        Node<Integer> temp = head;
        int count = 0;
        int newCount = 0;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        int element = count - position;

        while (head != null) {
            if (newCount == element) {
                return head;
            }
            newCount++;
            head = head.next;
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
    // Time - O(1)
    public static void deleteMiddleNode(final Node<Character> node) {
        if (node == null || node.next == null) {
            return;
        }

        final Node<Character> temp = node.next;
        node.value = temp.value; // the trick
        node.next = temp.next;
    }

    /**
     * 2.4 - You have two numbers represented by a linked list, where each node contains a single
     * digit. The digits are stored in reverse order, such that the 1’s digit is at the head of the
     * list. Write a function that adds the two numbers and returns the sum as a linked list.
     * <p>
     * EXAMPLE
     * Input: (3 -> 1 -> 5) + (5 -> 9 -> 2)
     * Output: 8 -> 0 -> 8
     */
    // Linked list  - 3-1-5 (513)
    // Linked list2 - 5-9-2 (295)
    // sum          - 8-0-8
    public static Node<Integer> addTwoLists(Node<Integer> node, Node<Integer> node2) {
        if (node == null || node2 == null) {
            return null;
        }

        int carry = 0;
        final Node<Integer> sum = new Node<>(0);
        Node<Integer> head = sum;

        while (node != null || node2 != null) {
            if (node != null) {
                carry += node.value;
                node = node.next;
            }

            if (node2 != null) {
                carry += node2.value;
                node2 = node2.next;
            }

            head.next = new Node<>(carry % 10);
            head = head.next;
            carry /= 10;
        }

        if (carry == 1) {
            head.next = new Node<>(1);
        }

        return sum.next;
    }

    /**
     * 2.5 - Given a circular linked list, implement an algorithm which returns node at the
     * beginning of the loop.
     * DEFINITION
     * Circular linked list: A (corrupt) linked list in which a node’s next pointer points to an
     * earlier node, so as to make a loop in the linked list.
     * EXAMPLE
     * input: A -> B -> C -> D -> E -> C [the same C as earlier]
     * output: C
     */
    // Book has a longer solution but seems very unnecessary
    public static Node<Integer> getCircular(final Node<Integer> node) {
        if (node == null) {
            return null;
        }

        Node<Integer> first = node;
        Node<Integer> second = node;

        while (first.next != null && second.next != null) {
            first = first.next;
            second = second.next.next;

            if (first.equals(second)) {
                return first;
            }
        }

        return null;
    }
}
