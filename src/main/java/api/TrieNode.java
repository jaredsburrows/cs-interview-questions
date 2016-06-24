package api;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public final class TrieNode<T> {

    private static final int ALPHABET_COUNT = 26;
    public TrieNode<T>[] children;
    public boolean isEnd;

    public TrieNode() {
        this(ALPHABET_COUNT);
    }

    @SuppressWarnings("unchecked")
    public TrieNode(final int length) {
        this.children = (TrieNode<T>[]) Array.newInstance(TrieNode.class, length);
    }

    @Override
    public boolean equals(final Object object) {
        if (this == object) {
            return true;
        }

        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }

        final TrieNode<?> trieNode = (TrieNode<?>) object;

        if (this.isEnd != trieNode.isEnd) {
            return false;
        }

        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(this.children, trieNode.children);
    }

    @Override
    public int hashCode() {
        int result = Arrays.hashCode(this.children);
        result = 31 * result + (this.isEnd ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "TrieNode{" +
                "children=" + Arrays.toString(this.children) +
                ", isEnd=" + this.isEnd +
                '}';
    }
}
