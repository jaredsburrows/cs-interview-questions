package questions.bitmanipulation;

public class AddTwoNumbers {

    // 010101101 - 173
    // 101011010 - 346
    //   173
    // + 346
    // = 519
    // returns 1000000111
    // python - to int      - int('1000000111', 2)
    // python - to binary   - bin(519)
    public static String getBinarySumLib(final String binary1, final String binary2) {
        if (binary1 == null && binary2 == null) {
            return null;
        }

        if (binary1 == null) {
            return binary2;
        }

        if (binary2 == null) {
            return binary1;
        }

        return Long.toBinaryString(Long.parseUnsignedLong(binary1, 2) + Long.parseUnsignedLong(binary2, 2));
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
    public static String getBinarySum(final String binary1, final String binary2) {
        if (binary1 == null && binary2 == null) {
            return null;
        }

        if (binary1 == null) {
            return binary2;
        }

        if (binary2 == null) {
            return binary1;
        }

        final StringBuilder stringBuilder = new StringBuilder();
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
    public static String getBinarySumBit(final String binary1, final String binary2) {
        if (binary1 == null && binary2 == null) {
            return null;
        }

        if (binary1 == null) {
            return binary2;
        }

        if (binary2 == null) {
            return binary1;
        }

        final StringBuilder stringBuilder = new StringBuilder();
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
