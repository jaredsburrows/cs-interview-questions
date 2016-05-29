package api;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public final class TrieNode<T> {

    public TrieNode<T>[] children;
    public boolean isEnd;

    public TrieNode() {
        this(26);
    }
    @SuppressWarnings("unchecked")
    public TrieNode(final int length) {
        this.children = (TrieNode<T>[]) Array.newInstance(TrieNode.class, length);
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        final TrieNode<?> trieNode = (TrieNode<?>) o;

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
}
