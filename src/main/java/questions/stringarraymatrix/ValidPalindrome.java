package questions.stringarraymatrix;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public class ValidPalindrome {

    public static boolean isPalindrome(String input) {
        if (input == null) {
            return false;
        }

        if (input.isEmpty() || input.length() < 2) {
            return true;
        }

        input = input.toLowerCase();

        final char[] array = input.toCharArray();

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

    public static boolean isLowerCase(final char character) {
        return character >= 'a' && character <= 'z';
    }

    public static boolean isUpperCase(final char character) {
        return character >= 'A' && character <= 'Z';
    }

    public static boolean isChar(final char character) {
        return isLowerCase(character) || isUpperCase(character);
    }

    public static boolean isNum(final char character) {
        return character >= '0' && character <= '9';
    }
}
