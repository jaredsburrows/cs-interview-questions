package api;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
// Current implementation is for strings, modify to make it generic
public final class Trie<T> {
    private final TrieNode<T> root = new TrieNode<>();

    public Trie() {
    }

    public Trie(T value) {
        insert(String.valueOf(value));
    }

    public void insert(String word) {
        if (word == null) {
            return;
        }

        TrieNode<T> current = root;

        final int length = word.length();

        for (int i = 0; i < length; i++) {
            final char character = word.charAt(i);
            final int index = character - 'a';

            final TrieNode<T> child = current.children[index];
            if (child == null) {
                final TrieNode<T> node = new TrieNode<>();
                current.children[index] = node;
                current = node;
            } else {
                current = child;
            }
        }

        current.isEnd = true;
    }

    public boolean search(String word) {
        final TrieNode<T> current = get(word);
        return current != null && current.isEnd;
    }

    public boolean startsWith(String prefix) {
        return get(prefix) != null;
    }

    @SuppressWarnings("ReferenceEquality") // we want to compare reference
    public TrieNode<T> get(String word) {
        if (word == null || word.isEmpty()) {
            return null;
        }

        TrieNode<T> current = root;

        final int length = word.length();

        for (int i = 0; i < length; i++) {
            final char character = word.charAt(i);
            final int index = character - 'a';

            final TrieNode<T> child = current.children[index];
            if (child == null) {
                return null;
            } else {
                current = child;
            }
        }

        if (current == root) {
            return null;
        }

        return current;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }

        if (object == null || getClass() != object.getClass()) {
            return false;
        }

        final Trie<?> trie = (Trie<?>) object;

        return root != null ? root.equals(trie.root) : trie.root == null;
    }

    @Override
    public int hashCode() {
        return root != null ? root.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Trie{" +
            "root=" + root +
            '}';
    }
}
