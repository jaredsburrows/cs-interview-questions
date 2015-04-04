package questions.util;

public class ListNode {
    public ListNode next;
    public ListNode previous;
    public int value = 0;

    public ListNode(final int val) {
        this.next = null;
        this.value = val;
    }
}
