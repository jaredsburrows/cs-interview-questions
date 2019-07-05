package leetcode;

/**
 * https://leetcode.com/problems/reverse-vowels-of-a-string/
 */
public final class Problem345ReverseVowelsOfAString {
    public String reverseVowels(String s) {
        if (s == null || s.isEmpty()) {
            return "";
        }

        char[] array = s.toCharArray();
        int i = 0;
        int j = array.length - 1;

        while (i < j) {
            while (!isVowel(array[i]) && i < j) {
                i++;
            }

            while (!isVowel(array[j]) && i < j) {
                j--;
            }

            swap(array, i, j);

            i++;
            j--;
        }

        return new String(array);
    }

    private static void swap(char[] array, int i, int j) {
        char temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a'
            || c == 'e'
            || c == 'i'
            || c == 'o'
            || c == 'u';
    }
}
