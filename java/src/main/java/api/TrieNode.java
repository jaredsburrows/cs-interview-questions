package api;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Objects;

public final class TrieNode<T> {
    private static final int ALPHABET_COUNT = 26;
    public TrieNode<T>[] children;
    public boolean isEnd;

    public TrieNode() {
        this(ALPHABET_COUNT);
    }

    @SuppressWarnings("unchecked")
    public TrieNode(int length) {
        children = (TrieNode<T>[]) Array.newInstance(TrieNode.class, length);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        TrieNode<?> trieNode = (TrieNode<?>) o;
        return isEnd == trieNode.isEnd
            && Arrays.equals(children, trieNode.children);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(isEnd);
        result = 31 * result + Arrays.hashCode(children);
        return result;
    }

    @Override
    public String toString() {
        return "TrieNode{" +
            "children=" + Arrays.toString(children) +
            ", isEnd=" + isEnd +
            '}';
    }
}
