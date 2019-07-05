package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/occurrences-after-bigram/
 */
public final class Problem1078OccurrencesAfterBigram {
    public String[] findOcurrences(String text, String first, String second) {
        if (text == null || text.isEmpty()) {
            return new String[0];
        }

        List<String> toReturn = new ArrayList<>();
        String[] words = text.split("\\s+", -1);

        for (int i = 2; i < words.length; i++) {
            if (first.equals(words[i - 2]) && second.equals(words[i - 1])) {
                toReturn.add(words[i]);
            }
        }

        return toReturn.toArray(new String[0]);
    }
}
