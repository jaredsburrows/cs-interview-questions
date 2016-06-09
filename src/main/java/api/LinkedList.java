package api;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public final class LinkedList<T> {

    private Node<T> mHead;

    public LinkedList(final T value) {
        this.mHead = new Node<>(value);
    }

    public Node<T> getHead() {
        return this.mHead;
    }

    public Node<T> getNext() {
        return this.mHead.next;
    }

    public void addToFront(final T value) {
        final Node<T> newNode = new Node<>(value);
        newNode.next = this.mHead;
        this.mHead = newNode;
    }

    public void add(final T value) {
        addToEnd(value);
    }

    public void addToEnd(final T value) {
        Node<T> temp = this.mHead;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node<>(value);
    }

    public void removeFront() {
        this.mHead = this.mHead.next;
    }

    public void removeLast() {
        Node<T> temp = this.mHead;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }
}
