package leetcode.api;

import java.util.Objects;

public final class RandomListNode {
    public int label;
    public RandomListNode next;
    public RandomListNode random;

    public RandomListNode(int x) {
        this.label = x;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        final RandomListNode that = (RandomListNode) o;
        return label == that.label
            && Objects.equals(next, that.next)
            && Objects.equals(random, that.random);
    }

    @Override
    public int hashCode() {
        return Objects.hash(label, next, random);
    }

    @Override
    public String toString() {
        return "RandomListNode{" +
            "label=" + label +
            ", next=" + next +
            ", random=" + random +
            '}';
    }
}
