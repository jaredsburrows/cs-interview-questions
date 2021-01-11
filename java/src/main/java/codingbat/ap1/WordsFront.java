package codingbat.ap1;

/**
 * https://codingbat.com/prob/p183837
 */
public final class WordsFront {
    public String[] wordsFront(String[] words, int n) {
        String[] temp = new String[n];

        for (int i = 0; i < n; i++) {
            if (i < words.length) {
                temp[i] = words[i];
            }
        }

        return temp;
    }
}
