package api;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public final class LinkedList<T> {

    private Node<T> head;

    public LinkedList(final T value) {
        this.head = new Node<>(value);
    }

    public Node<T> getHead() {
        return this.head;
    }

    public Node<T> getNext() {
        return this.head.next;
    }

    public void addToFront(final T value) {
        Node<T> newNode = new Node<>(value);
        newNode.next = head;
        this.head = newNode;
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
        this.head = head.next;
    }

    public void removeLast() {
        Node<T> temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }
}
