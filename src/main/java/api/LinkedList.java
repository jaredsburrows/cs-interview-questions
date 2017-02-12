package api;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public final class LinkedList<T> {

    private Node<T> head;

    public LinkedList(final T value) {
        head = new Node<>(value);
    }

    public Node<T> getHead() {
        return head;
    }

    public Node<T> getNext() {
        return head.next;
    }

    public void addToFront(final T value) {
        final Node<T> newNode = new Node<>(value);
        newNode.next = head;
        head = newNode;
    }

    public void add(final T value) {
        addToEnd(value);
    }

    public void addToEnd(final T value) {
        Node<T> temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node<>(value);
    }

    public void removeFront() {
        head = head.next;
    }

    public void removeLast() {
        Node<T> temp = head;
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

        if (object == null || getClass() != object.getClass()) {
            return false;
        }

        final LinkedList<?> linkedList = (LinkedList<?>) object;

        return head != null ? head.equals(linkedList.head) : linkedList.head == null;
    }

    @Override
    public int hashCode() {
        return head != null ? head.hashCode() : 0;
    }
}
