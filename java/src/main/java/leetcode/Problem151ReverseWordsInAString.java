package leetcode;

/**
 * https://leetcode.com/problems/reverse-words-in-a-string
 */
public final class Problem151ReverseWordsInAString {
    // Time - O(N), Space - O(N)
    public String reverseWords(String s) {
        if (s == null) {
            return "";
        }

        s = s.trim();

        if (s.isEmpty()) {
            return s;
        }

        String[] sentence = s.split("\\s+", -1);
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0, j = sentence.length - 1; i < j; i++, j--) {
            swap(sentence, i, j);
        }

        for (String word : sentence) {
            stringBuilder.append(word);
            stringBuilder.append(" ");
        }

        return stringBuilder.toString().trim();
    }

    // Time - O(1), Space - O(1)
    private void swap(String[] array, int left, int right) {
        String temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }
}
