package projecteuler;

public class Number4 {

    public boolean isPalidrome(final int n) {
        final String temp = Integer.toString(n);
        return temp.equals(new StringBuilder(temp).reverse().toString());
    }

    public long getLargestPalindromeProduct() {
        int max = 0;
        for (int i = 999; i > 99; i--) {
            for (int j = 999; j > 99; j--) {
                final int tmp = i * j;
                if (isPalidrome(tmp) && tmp > max) {
                    max = tmp;
                    break;
                }
            }
        }

        return max;
    }
}
