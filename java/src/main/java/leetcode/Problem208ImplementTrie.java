package leetcode;

/**
 * https://leetcode.com/problems/implement-trie-prefix-tree/
 */
@SuppressWarnings("ClassCanBeStatic") // Leetcode is not static
public final class Problem208ImplementTrie {
    public class Trie {
        private TrieNode root = new TrieNode();

        public void insert(String word) {
            if (word == null) {
                return;
            }

            TrieNode current = root;

            int length = word.length();

            for (int i = 0; i < length; i++) {
                char character = word.charAt(i);
                int index = character - 'a';

                TrieNode child = current.children[index];
                if (child == null) {
                    TrieNode node = new TrieNode();
                    current.children[index] = node;
                    current = node;
                } else {
                    current = child;
                }
            }

            current.isEnd = true;
        }

        // Returns if the word is in the trie.
        public boolean search(String word) {
            TrieNode current = get(word);
            return current != null && current.isEnd;
        }

        public boolean startsWith(String prefix) {
            return get(prefix) != null;
        }

        public TrieNode get(String word) {
            if (word == null || word.isEmpty()) {
                return null;
            }

            TrieNode current = root;

            int length = word.length();

            for (int i = 0; i < length; i++) {
                char character = word.charAt(i);
                int index = character - 'a';

                TrieNode child = current.children[index];
                if (child == null) {
                    return null;
                } else {
                    current = child;
                }
            }

            return current == root ? null : current;
        }
    }

    private static class TrieNode {
        TrieNode[] children = new TrieNode[26];
        boolean isEnd;
    }
}
