package leetcode;

/**
 * https://leetcode.com/problems/base-7
 */
public final class Problem504Base7 {
    public String convertToBase7(int num) {
        if (num == 0) {
            return "0";
        }

        String result = fromDecimal(Math.abs(num), 7);
        return num < 0 ? "-" + result : result;
    }

    private String fromDecimal(long num, int base) {
        StringBuilder stringBuilder = new StringBuilder();

        num &= 0x00000000ffffffffL;

        while (num > 0) {
            stringBuilder.insert(0, getChar(num % base));
            num /= base;
        }

        return stringBuilder.toString();
    }

    // Time - O(1), Space - O(1)
    private char getChar(long num) {
        if (num >= 0 && num <= 9) {
            return (char) (num + '0');
        } else {
            return (char) (num - 10 + 'a');
        }
    }
}
