package questions.linkedlist;

import api.Node;

public class LinkedList<T> {

    public Node<T> head;

    public LinkedList(final T value) {
        this.head = new Node<>(value);
    }

    public Node<T> getPrevious() {
        return this.head.getPrevious();
    }

    public Node<T> getHead() {
        return this.head;
    }

    public Node<T> getNext() {
        return this.head.getNext();
    }

    public void addtoFront(final T value) {
        Node<T> newNode = new Node<>(value);
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
        head = head.getNext();
    }

    public void removeLast() {
        Node<T> temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }
}
