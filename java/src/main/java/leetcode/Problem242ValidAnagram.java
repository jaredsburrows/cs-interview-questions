package leetcode;

/**
 * https://leetcode.com/problems/valid-anagram
 */
public final class Problem242ValidAnagram {
    // Time - O(N), Space - O(N)
    public boolean isAnagram(String s, String t) {
        if (s == null || t == null) {
            return false;
        }

        if (s.length() != t.length()) {
            return false;
        }

        int[] checker = new int[26];

        for (int i = 0; i < s.length(); i++) {
            checker[s.charAt(i) - 'a']--;
        }

        for (int i = 0; i < t.length(); i++) {
            checker[t.charAt(i) - 'a']++;
        }

        for (int check : checker) {
            if (check != 0) {
                return false;
            }
        }

        return true;
    }
}
