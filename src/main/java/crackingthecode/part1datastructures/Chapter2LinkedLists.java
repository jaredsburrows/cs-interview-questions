package crackingthecode.part1datastructures;

import java.util.HashSet;
import java.util.Set;

import api.Node;

public class Chapter2LinkedLists {

    /**
     * 2.1 - Write code to remove duplicates from an unsorted linked list.
     * FOLLOW UP
     * How would you solve this problem if a temporary buffer is not allowed?
     */
    // Time - O(N)
    public void removeDuplicates(final Node<Integer> node) {
        if (node == null) {
            return;
        }

        Set<Integer> integers = new HashSet<>();

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

    // Time - O(N^2)
    public void removeDuplicates2(final Node<Integer> n) {
        if (n == null) {
            return;
        }

        Node<Integer> node = n;
        Node<Integer> node2 = n;
        Node<Integer> node3 = null;

        while (node != null) {
            while (node2.next != null) {
                if (node.value.equals(node2.value)) {
                    if (node3 != null) {
                        node3.next = node2.next;
                    }
                } else {
                    node3 = node2;
                }
                node2 = node2.next;
            }
            node = node.next;
        }
    }

    // Time - O(N^2)
    public void removeDuplicates3(final Node<Integer> n) {
        if (n == null) {
            return;
        }

        Node<Integer> current = n;

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
    public void deleteDupsC(Node<Integer> head) {
        if (head == null) {
            return;
        }
        Node<Integer> previous = head;
        Node<Integer> current = previous.next;
        while (current != null) {
            // Look backwards for dups, and remove any that you see.
            Node<Integer> runner = head;
            while (runner != current) {
                if (runner.value == current.value) {
                    Node<Integer> tmp = current.next;
                    previous.next = tmp;
                    current = tmp;
                    /* We know we can't have more than one dup preceding
                     * our element since it would have been removed
					 * earlier. */
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

    public void deleteEveryOtherRecursive(Node<Integer> node) {
        if (node != null && node.next != null) {
            node.next = node.next.next;
            deleteEveryOtherRecursive(node.next);
        }
    }

    /**
     * 2.2 - Implement an algorithm to find the nth to last element of a singly linked list.
     */
    // Time - O(N), Space - O(1)
    public Node<Integer> findNthLastElement(Node<Integer> node, final int n) {
        if (node == null || n < 1) {
            return null;
        }

        Node<Integer> temp = node;
        int count = 0;
        int newCount = 0;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        int element = count - n;

        while (node != null) {
            if (newCount == element) {
                return node;
            }
            newCount++;
            node = node.next;
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
    public void deleteMiddleNode(Node<Character> n) {
        if (n == null || n.next == null) {
            return;
        }

        Node<Character> next = n.next;
        n.value = next.value; // the trick
        n.next = next.next;
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
    public Node<Integer> addTwoLists(Node<Integer> n, Node<Integer> n2) {
        if (n == null || n2 == null) {
            return null;
        }

        int carry = 0;
        final Node<Integer> sum = new Node<>(0);
        Node<Integer> head = sum;

        while (n != null || n2 != null) {
            if (n != null) {
                carry += n.value;
                n = n.next;
            }

            if (n2 != null) {
                carry += n2.value;
                n2 = n2.next;
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
     * Given a circular linked list, implement an algorithm which returns node at the beginning of
     * the loop.
     * DEFINITION
     * Circular linked list: A (corrupt) linked list in which a node’s next pointer points to an
     * earlier node, so as to make a loop in the linked list.
     * EXAMPLE
     * input: A -> B -> C -> D -> E -> C [the same C as earlier]
     * output: C
     */
    // Book has a longer solution but seems very uneccesary
    public Node<Integer> getCircular(Node<Integer> node) {
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
