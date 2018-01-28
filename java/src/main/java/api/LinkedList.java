package api;

public final class LinkedList<T> {
    private Node<T> head;

    public LinkedList(T value) {
        head = new Node<>(value);
    }

    public Node<T> getHead() {
        return head;
    }

    public Node<T> getNext() {
        return head.next;
    }

    public void addToFront(T value) {
        final Node<T> node = new Node<>(value);
        node.next = head;
        head = node;
    }

    public void add(T value) {
        addToEnd(value);
    }

    public void addToEnd(T value) {
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
    public boolean equals(Object object) {
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

    @Override
    public String toString() {
        return "LinkedList{" +
            "head=" + head +
            '}';
    }
}
