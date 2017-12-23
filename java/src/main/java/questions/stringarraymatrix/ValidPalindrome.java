package questions.stringarraymatrix;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public final class ValidPalindrome {
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
            while (i < j && !isChar(array[i]) && !Character.isDigit(array[i])) {
                i++;
            }

            while (i < j && !isChar(array[j]) && !Character.isDigit(array[j])) {
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

    private static boolean isChar(char character) {
        return Character.isLowerCase(character) || Character.isUpperCase(character);
    }
}
