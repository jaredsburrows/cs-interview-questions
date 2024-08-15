package codingbat.ap1;

/**
 * https://codingbat.com/prob/p124620
 */
public final class WordsCount {
    public int wordsCount(String[] words, int len) {
        int count = 0;

        for (String word : words) {
            if (word.length() == len) {
                count++;
            }
        }

        return count;
    }
}
