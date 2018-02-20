package leetcode;

/**
 * https://leetcode.com/problems/base-7
 */
public final class Problem504Base7 {
    public String convertToBase7(int num) {
        if (num == 0) {
            return "0";
        }

        final boolean isNegative = num < 0;
        final StringBuilder stringBuilder = new StringBuilder();
        num = Math.abs(num);

        while (num != 0) {
            int digit = num % 7;
            num /= 7;
            stringBuilder.insert(0, digit);
        }

        if (isNegative) {
            stringBuilder.insert(0, "-");
        }

        return stringBuilder.toString();
    }
}
