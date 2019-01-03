package leetcode;

/**
 * https://leetcode.com/problems/to-lower-case
 */
public final class Problem709ToLowerCase {
    // Time - O(N), Space - O(1)
    public String toLowerCase(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }

        char[] word = str.toCharArray();
        for (int i = 0; i < word.length; i++) {
            word[i] = Character.toLowerCase(word[i]);
        }

        return new String(word);
    }
}
