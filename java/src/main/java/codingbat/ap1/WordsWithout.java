package codingbat.ap1;

import java.util.ArrayList;
import java.util.List;

/**
 * https://codingbat.com/prob/p121236
 */
public final class WordsWithout {
    public String[] wordsWithout(String[] words, String target) {
        List<String> test = new ArrayList<>();
        for (String word : words) {
            if (!word.equals(target)) {
                test.add(word);
            }
        }

        return test.toArray(new String[0]);
    }
}
