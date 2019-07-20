package leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/remove-vowels-from-a-string/
 */
public final class Problem1119RemoveVowelsFromAString {
    public String removeVowels(String S) {
        if (S == null || S.isEmpty()) {
            return "";
        }

        Set<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');

        StringBuilder stringBuilder = new StringBuilder();
        for (char character : S.toCharArray()) {
            if (!set.contains(character)) {
                stringBuilder.append(character);
            }
        }

        return stringBuilder.toString();
    }
}
