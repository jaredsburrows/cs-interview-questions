package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * https://leetcode.com/problems/uncommon-words-from-two-sentences/
 */
public final class Problem884UncommonWordsFromTwoSentences {
    public String[] uncommonFromSentences(String A, String B) {
        if ((A == null || A.isEmpty()) || (B == null || B.isEmpty())) {
            return new String[0];
        }

        String words = A + " " + B;
        String[] sentence = words.split("\\s+", -1);
        Map<String, Integer> wordMap = new HashMap<>();
        List<String> toReturn = new ArrayList<>();

        for (String word : sentence) {
            wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);
        }
        for (String word : sentence) {
            if (wordMap.get(word) == 1) {
                toReturn.add(word);
            }
        }

        return toReturn.toArray(new String[0]);
    }

    // Not as fast on leetcode
    public String[] uncommonFromSentences2(String A, String B) {
        if ((A == null || A.isEmpty()) || (B == null || B.isEmpty())) {
            return new String[0];
        }

        String words = A + " " + B;
        String[] sentence = words.split("\\s+", -1);
        Map<String, Integer> wordMap = new HashMap<>();

        for (String word : sentence) {
            wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);
        }

        return wordMap.entrySet().stream()
            .filter(x -> x.getValue() == 1)
            .map(Map.Entry::getKey)
            .toArray(String[]::new);
    }
}
