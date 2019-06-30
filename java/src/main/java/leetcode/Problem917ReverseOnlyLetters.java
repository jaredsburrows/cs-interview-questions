package leetcode;

/**
 * https://leetcode.com/problems/reverse-only-letters/
 */
public final class Problem917ReverseOnlyLetters {
    public String reverseOnlyLetters(String S) {
        if (S == null || S.isEmpty()) {
            return "";
        }

        if (S.length() == 1) {
            return S;
        }

        char[] characters = S.toCharArray();
        int low = 0;
        int high = characters.length - 1;

        while (low < high) {
            while (low < high && !Character.isLetter(characters[low])) {
                low++;
            }

            while (low < high && !Character.isLetter(characters[high])) {
                high--;
            }

            swap(characters, low, high);

            low++;
            high--;
        }

        return new String(characters);
    }

    private static void swap(char[] array, int left, int right) {
        char temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }
}
