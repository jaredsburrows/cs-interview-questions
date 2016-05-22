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

        char[] array = s.toCharArray();
        int i = 0;
        int j = array.length - 1;

        while (i < j) {
            while ((i < j) && !isChar(array[i]) && !inNum(array[i])) {
                i++;
            }

            while ((i < j) && !isChar(array[j]) && !inNum(array[j])) {
                j--;
            }

            if (i >= j) {
                break;
            }

            if (array[i] != array[j]) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }

    public static boolean isChar(final char c) {
        return c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z';
    }

    public static boolean inNum(final char c) {
        return c >= '0' && c <= '9';
    }
}
