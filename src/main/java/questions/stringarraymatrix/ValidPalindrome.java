package questions.stringarraymatrix;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public class ValidPalindrome {

    public static boolean isPalindrome(String s) {
        if (s == null) {
            return false;
        }

        if (s.isEmpty() || s.length() < 2) {
            return true;
        }

        s = s.toLowerCase();

        final char[] array = s.toCharArray();

        for (int i = 0, j = array.length - 1; i < j; i++, j--) {
            while (i < j && !isChar(array[i]) && !isNum(array[i])) {
                i++;
            }

            while (i < j && !isChar(array[j]) && !isNum(array[j])) {
                j--;
            }

            if (i >= j) {
                break;
            }

            if (array[i] != array[j]) {
                return false;
            }
        }

        return true;
    }

    public static boolean isChar(final char character) {
        return character >= 'a' && character <= 'z' || character >= 'A' && character <= 'Z';
    }

    public static boolean isNum(final char character) {
        return character >= '0' && character <= '9';
    }
}
