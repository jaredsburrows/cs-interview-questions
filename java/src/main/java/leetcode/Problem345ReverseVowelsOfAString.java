package leetcode;

/**
 * https://leetcode.com/problems/reverse-vowels-of-a-string/
 */
public final class Problem345ReverseVowelsOfAString {
    // Performance - 2ms runtime - 99.07%
    public String reverseVowels(String s) {
        char[] toReturn = s.toCharArray();
        int left = 0;
        int right = toReturn.length - 1;

        while (left < right) {
            if (!isVowel(toReturn[left])) {
                left++;
            } else if (!isVowel(toReturn[right])) {
                right--;
            } else {
                swap(toReturn, left, right);

                left++;
                right--;
            }
        }

        return new String(toReturn);
    }

    private static void swap(char[] array, int i, int j) {
        final char temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private static boolean isVowel(char c) {
        return c == 'a' || c == 'A'
            || c == 'e' || c == 'E'
            || c == 'i' || c == 'I'
            || c == 'o' || c == 'O'
            || c == 'u' || c == 'U';
    }

    public String reverseVowels2(String s) {
        if (s == null || s.isEmpty()) {
            return "";
        }

        char[] array = s.toCharArray();
        int i = 0;
        int j = array.length - 1;

        while (i < j) {
            while (!isVowel2(array[i]) && i < j) {
                i++;
            }

            while (!isVowel2(array[j]) && i < j) {
                j--;
            }

            swap(array, i, j);

            i++;
            j--;
        }

        return new String(array);
    }

    private static boolean isVowel2(char c) {
        c = Character.toLowerCase(c);
        return c == 'a'
            || c == 'e'
            || c == 'i'
            || c == 'o'
            || c == 'u';
    }
}
