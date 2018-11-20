package leetcode;

/**
 * https://leetcode.com/problems/convert-a-number-to-hexadecimal
 */
public final class Problem405ConvertANumberToHexadecimal {
    public String toHex(int num) {
        if (num == 0) {
            return "0";
        }

        return fromDecimal(num, 16);
    }

    private String fromDecimal(long num, int base) {
        final StringBuilder stringBuilder = new StringBuilder();

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
