package leetcode;

/**
 * https://leetcode.com/problems/add-strings/
 */
public final class Problem415AddStrings {
    public String addStrings(String num1, String num2) {
        if (num1 == null || num2 == null) {
            return "";
        }

        StringBuilder stringBuilder = new StringBuilder();
        int carry = 0;
        int i = num1.length() - 1;
        int j = num2.length() - 1;

        while (i >= 0 || j >= 0 || carry == 1) {
            int digit1 = i < 0 ? 0 : num1.charAt(i) - '0';
            int digit2 = j < 0 ? 0 : num2.charAt(j) - '0';
            int add = digit1 + digit2 + carry;

            stringBuilder.insert(0, add % 10);
            carry = add / 10;

            i--;
            j--;
        }

        return stringBuilder.toString();
    }
}
