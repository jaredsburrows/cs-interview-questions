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
        this.addToEnd(value);
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

    @Override
    public boolean equals(final Object object) {
        if (this == object) {
            return true;
        }

        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }

        final LinkedList<?> linkedList = (LinkedList<?>) object;

        return this.mHead != null ? this.mHead.equals(linkedList.mHead) : linkedList.mHead == null;
    }

    @Override
    public int hashCode() {
        return this.mHead != null ? this.mHead.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "LinkedList{" +
                "mHead=" + this.mHead +
                '}';
    }
}
