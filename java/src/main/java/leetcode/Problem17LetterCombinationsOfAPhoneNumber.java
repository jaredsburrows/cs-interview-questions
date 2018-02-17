package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/letter-combinations-of-a-phone-number
 */
public final class Problem17LetterCombinationsOfAPhoneNumber {
    public List<String> letterCombinations(String digits) {
        final List<String> combos = new ArrayList<>();
        if (digits == null || digits.isEmpty()) {
            return combos;
        }

        final String[] keys = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

        letterCombinations(keys, combos, digits, "", 0);

        return combos;
    }

    private void letterCombinations(String[] keys, List<String> combos, String digits, String prefix, int offset) {
        if (offset >= digits.length()) {
            combos.add(prefix);
            return;
        }

        final String letters = keys[digits.charAt(offset) - '0'];
        for (int i = 0; i < letters.length(); i++) {
            letterCombinations(keys, combos, digits, prefix + letters.charAt(i), offset + 1);
        }
    }
}
