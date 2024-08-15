package projecteuler;

public final class Number004 {
    public static boolean isPalindrome(int number) {
        String temp = Integer.toString(number);
        return temp.contentEquals(new StringBuilder(temp).reverse());
    }

    public static long getLargestPalindromeProduct() {
        int max = 0;

        for (int i = 999; i > 99; i--) {
            for (int j = 999; j > 99; j--) {
                int tmp = i * j;
                if (isPalindrome(tmp) && tmp > max) {
                    max = tmp;
                    break;
                }
            }
        }

        return max;
    }
}
