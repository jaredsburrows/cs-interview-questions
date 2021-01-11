package codingbat.ap1;

import java.util.ArrayList;
import java.util.List;

/**
 * https://codingbat.com/prob/p183407
 */
public final class WordsWithoutList {
    public List<String> wordsWithoutList(String[] words, int len) {
        List<String> temp = new ArrayList<>(len);

        for (String word : words) {
            if (word.length() != len) {
                temp.add(word);
            }
        }

        return temp;
    }
}
