package leetcode;

/**
 * https://leetcode.com/problems/reverse-words-in-a-string-iii
 * https://leetcode.com/explore/learn/card/array-and-string/204/conclusion/1165/
 */
public final class Problem557ReverseWordsInAStringIII {
    public String reverseWords(String s) {
        if (s == null) {
            return "";
        }

        String[] sentence = s.split("\\s+", -1);
        StringBuilder stringBuilder = new StringBuilder(sentence.length);
        for (String string : sentence) {
            char[] array = string.toCharArray();

            for (int i = 0, j = array.length - 1; i < j; i++, j--) {
                swap(array, i, j);
            }

            stringBuilder.append(new String(array));
            stringBuilder.append(" ");
        }

        return stringBuilder.toString().trim();
    }

    private void swap(char[] array, int left, int right) {
        char temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }
}
