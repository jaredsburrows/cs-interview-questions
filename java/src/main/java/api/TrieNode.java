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
        children = (TrieNode<T>[]) Array.newInstance(TrieNode.class, length);
    }

    @Override
    public boolean equals(final Object object) {
        if (this == object) {
            return true;
        }

        if (object == null || getClass() != object.getClass()) {
            return false;
        }

        final TrieNode<?> node = (TrieNode<?>) object;

        if (isEnd != node.isEnd) {
            return false;
        }

        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(children, node.children);
    }

    @Override
    public int hashCode() {
        int result = Arrays.hashCode(children);
        result = 31 * result + (isEnd ? 1 : 0);
        return result;
    }
}
