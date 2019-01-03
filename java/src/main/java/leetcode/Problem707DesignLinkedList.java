package leetcode;

import leetcode.api.ListNode;

/**
 * https://leetcode.com/problems/design-linked-list/
 */
@SuppressWarnings("ClassCanBeStatic") // class MyLinkedList submitted to Leetcode is not static
public final class Problem707DesignLinkedList {
    public class MyLinkedList {

        private ListNode head;
        private int size;

        public MyLinkedList() {
            head = null;
            size = 0;
        }

        public int get(int index) {
            if (index >= size || index < 0) {
                return -1;
            }

            ListNode temp = head;
            while (index > 0) {
                temp = temp.next;
                index--;
            }
            return temp.val;
        }

        public void addAtHead(int val) {
            final ListNode newHead = new ListNode(val);
            newHead.next = head;
            head = newHead;

            size++;
        }

        public void addAtTail(int val) {
            final ListNode newTail = new ListNode(val);
            if (head == null) {
                head = newTail;
            }

            ListNode temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newTail;

            size++;
        }

        public void addAtIndex(int index, int val) {
            if (index > size) {
                return;
            }

            if (index == size) {
                addAtTail(val);
                return;
            }

            if (index <= 0) {
                addAtHead(val);
                return;
            }

            ListNode temp = head;
            index--;

            while (index > 0) {
                temp = temp.next;
                index--;
            }

            final ListNode newNode = new ListNode(val);
            newNode.next = temp.next;
            temp.next = newNode;

            size++;
        }

        public void deleteAtIndex(int index) {
            if (index < 0 || index >= size) {
                return;
            }

            if (index == 0) {
                head = head.next;
            }

            ListNode previous = head;
            ListNode current = head.next;
            index--;

            while (index > 0) {
                previous = current;
                current = current.next;
                index--;
            }
            previous.next = current.next;

            size--;
        }
    }
}
