package api;

import java.util.Objects;

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
        Node<T> node = new Node<>(value);
        node.next = head;
        head = node;
    }

    public void add(T value) {
        addToEnd(value);
    }

    public void addToEnd(T value) {
        Node<T> node = head;
        while (node.next != null) {
            node = node.next;
        }
        node.next = new Node<>(value);
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
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        LinkedList<?> that = (LinkedList<?>) o;
        return Objects.equals(head, that.head);
    }

    @Override
    public int hashCode() {
        return Objects.hash(head);
    }

    @Override
    public String toString() {
        return "LinkedList{" +
            "head=" + head +
            '}';
    }
}
