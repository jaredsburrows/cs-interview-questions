package api;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
// TODO Current implementation is for strings, modify to make it generic
public final class Trie<T> {

    private TrieNode<T> mRoot = new TrieNode<>();

    public void insert(final String word) {
        if (word == null) {
            return;
        }

        TrieNode<T> current = this.mRoot;

        final int length = word.length();

        for (int i = 0; i < length; i++) {
            final char character = word.charAt(i);
            final int index = character - 'a';

            TrieNode<T> child = current.children[index];
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

    public boolean search(final String word) {
        final TrieNode<T> current = this.get(word);
        return current != null && current.isEnd;
    }

    public boolean startsWith(final String prefix) {
        final TrieNode<T> current = this.get(prefix);
        return current != null;
    }

    public TrieNode<T> get(final String word) {
        if (word == null || word.isEmpty()) {
            return null;
        }

        TrieNode<T> current = this.mRoot;

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

        if (current == this.mRoot) {
            return null;
        }

        return current;
    }
}
