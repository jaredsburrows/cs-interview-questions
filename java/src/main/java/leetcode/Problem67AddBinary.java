package leetcode;

/**
 * https://leetcode.com/problems/add-binary
 * https://leetcode.com/explore/learn/card/array-and-string/203/introduction-to-string/1160/
 */
public final class Problem67AddBinary {
    // Time - O(N), Space - O(N)
    public String addBinary(String a, String b) {
        if (a == null && b == null) {
            return "";
        }

        if (a == null) {
            return b;
        }

        if (b == null) {
            return a;
        }

        StringBuilder stringBuilder = new StringBuilder();

        int carry = 0;
        for (int i = a.length() - 1, j = b.length() - 1; i >= 0 || j >= 0 || carry == 1; i--, j--) {
            int digit1 = i < 0 ? 0 : a.charAt(i) - '0';
            int digit2 = j < 0 ? 0 : b.charAt(j) - '0';
            int sum = digit1 + digit2 + carry;

            stringBuilder.insert(0, sum % 2);
            carry = sum / 2;
        }

        if (carry > 0) {
            stringBuilder.insert(0, 1);
        }

        return stringBuilder.toString();
    }

    // 010101101 - 173
    // 101011010 - 346
    //   173
    // + 346
    // = 519
    // returns 1000000111
    // python - to int      - int('1000000111', 2)
    // python - to binary   - bin(519)
    public String getBinarySumLib(String left, String right) {
        if (left == null && right == null) {
            return "";
        }

        if (left == null) {
            return right;
        }

        if (right == null) {
            return left;
        }

        return Long.toBinaryString(Long.parseLong(left, 2) + Long.parseLong(right, 2));
    }

    //   11
    //   0111    - 7
    //  +1110    - 14
    //  10101    - 21

    // 0 + 0 = 0, 0
    // 1 + 0 = 1, 1
    // 1 + 1 = 2, 1
    // 1 + 1 + 1 = 3, 1 + carry
    // limited by integers
    public String getBinarySum(String binary1, String binary2) {
        if (binary1 == null && binary2 == null) {
            return "";
        }

        if (binary1 == null) {
            return binary2;
        }

        if (binary2 == null) {
            return binary1;
        }

        StringBuilder stringBuilder = new StringBuilder();
        int binLength1 = binary1.length() - 1;
        int binLength2 = binary2.length() - 1;
        int carry = 0;

        while (binLength1 >= 0 || binLength2 >= 0) {
            int sum = carry; // carry over

            if (binLength1 >= 0) {
                sum += binary1.charAt(binLength1) - '0'; // convert string element to int
                binLength1--;
            }

            if (binLength2 >= 0) {
                sum += binary2.charAt(binLength2) - '0';
                binLength2--;
            }

            if (sum == 0) {
                carry = 0;
                stringBuilder.append("0");
            } else if (sum == 1) {
                carry = 0;
                stringBuilder.append("1");
            } else if (sum == 2) {
                carry = 1;
                stringBuilder.append("0");
            }
        }

        if (carry > 0) {
            stringBuilder.append("1");
        }

        return stringBuilder.reverse().toString();
    }

    // 0 >> 1 = 0,  1 >> 1 = 0,  2 >> 1 = 1,  3 >> 1 = 1
    // 0 &  0 = 0,  0 &  1 = 1,  1 &  1 = 1,  2 &  1 = 1
    public String getBinarySumBit(String binary1, String binary2) {
        if (binary1 == null && binary2 == null) {
            return "";
        }

        if (binary1 == null) {
            return binary2;
        }

        if (binary2 == null) {
            return binary1;
        }

        StringBuilder stringBuilder = new StringBuilder();
        int binLength1 = binary1.length() - 1;
        int binLength2 = binary2.length() - 1;
        int carry = 0;

        while (binLength1 >= 0 || binLength2 >= 0) {
            int sum = carry; // carry over

            if (binLength1 >= 0) {
                sum += binary1.charAt(binLength1) - '0'; // convert string element to int
                binLength1--;
            }

            if (binLength2 >= 0) {
                sum += binary2.charAt(binLength2) - '0';
                binLength2--;
            }

            carry = sum >> 1;
            sum &= 1;
            stringBuilder.append(sum == 0 ? '0' : '1');
        }

        if (carry > 0) {
            stringBuilder.append('1');
        }

        return stringBuilder.reverse().toString();
    }
}
