package util;

public class ListNode {
    public ListNode next;
    public ListNode previous;
    public int value = 0;

    public ListNode(final int value) {
        this.next = null;
        this.value = value;
    }
}
