package projecteuler;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public final class Number004 {

    public static boolean isPalindrome(final int number) {
        final String temp = Integer.toString(number);
        return temp.equals(new StringBuilder(temp).reverse().toString());
    }

    public static long getLargestPalindromeProduct() {
        int max = 0;

        for (int i = 999; i > 99; i--) {
            for (int j = 999; j > 99; j--) {
                final int tmp = i * j;
                if (isPalindrome(tmp) && tmp > max) {
                    max = tmp;
                    break;
                }
            }
        }

        return max;
    }
}
