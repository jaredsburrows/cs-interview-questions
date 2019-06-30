package api;

import java.util.Objects;
import javax.annotation.Nullable;

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

        for (int i = 0; i < word.length(); i++) {
            char character = word.charAt(i);
            int index = character - 'a';

            TrieNode<T> child = current.children[index];
            if (child == null) {
                TrieNode<T> node = new TrieNode<>();
                current.children[index] = node;
                current = node;
            } else {
                current = child;
            }
        }

        current.isEnd = true;
    }

    public boolean search(String word) {
        if (word == null || word.isEmpty()) {
            return false;
        }

        TrieNode<T> current = get(word);
        return current != null && current.isEnd;
    }

    public boolean startsWith(String prefix) {
        return prefix != null && !prefix.isEmpty() && get(prefix) != null;
    }

    @Nullable
    public TrieNode<T> get(String word) {
        if (word == null || word.isEmpty()) {
            return null;
        }

        TrieNode<T> current = root;

        for (int i = 0; i < word.length(); i++) {
            char character = word.charAt(i);
            int index = character - 'a';

            TrieNode<T> child = current.children[index];
            if (child == null) {
                return null;
            } else {
                current = child;
            }
        }

        return Objects.equals(current, root) ? null : current;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Trie<?> trie = (Trie<?>) o;
        return Objects.equals(root, trie.root);
    }

    @Override
    public int hashCode() {
        return Objects.hash(root);
    }

    @Override
    public String toString() {
        return "Trie{" +
            "root=" + root +
            '}';
    }
}
