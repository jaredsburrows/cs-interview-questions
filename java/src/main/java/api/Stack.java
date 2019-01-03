package api;

import java.util.Objects;

// LIFO - Last in first out
public final class Stack<T> {
    public Node<T> top;

    public Stack() {
    }

    public Stack(T value) {
        push(new Node<>(value));
    }

    public Node<T> peek() {
        return top;
    }

    public void push(Node<T> node) {
        if (node != null) {
            node.previous = top;
            top = node;
        }
    }

    public void pop() {
        if (top != null) {
            top = top.previous;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Stack<?> stack = (Stack<?>) o;
        return Objects.equals(top, stack.top);
    }

    @Override
    public int hashCode() {
        return Objects.hash(top);
    }

    @Override
    public String toString() {
        return "Stack{" +
            "top=" + top +
            '}';
    }
}
