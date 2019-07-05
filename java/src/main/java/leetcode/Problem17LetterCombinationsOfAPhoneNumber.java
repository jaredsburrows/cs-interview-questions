package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/letter-combinations-of-a-phone-number
 * https://leetcode.com/explore/learn/card/recursion-ii/507/beyond-recursion/2905/
 */
public final class Problem17LetterCombinationsOfAPhoneNumber {
    public List<String> letterCombinations(String digits) {
        List<String> combos = new ArrayList<>();
        if (digits == null || digits.isEmpty()) {
            return combos;
        }

        String[] keys = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        letterCombinations(keys, combos, digits, "", 0);

        return combos;
    }

    private void letterCombinations(String[] keys, List<String> combos, String digits, String prefix, int offset) {
        if (offset >= digits.length()) {
            combos.add(prefix);
            return;
        }

        String letters = keys[digits.charAt(offset) - '0'];
        for (int i = 0; i < letters.length(); i++) {
            letterCombinations(keys, combos, digits, prefix + letters.charAt(i), offset + 1);
        }
    }
}
