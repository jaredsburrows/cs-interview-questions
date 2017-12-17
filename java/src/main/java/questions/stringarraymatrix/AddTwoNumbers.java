package questions.stringarraymatrix;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public final class AddTwoNumbers {
    // Time - O(MAX(M, N)), Space - O(MAX(M, N))
    public static String addTwoNumbers(String left, String right) {
        if (left == null && right == null) {
            return null;
        }

        if (left == null) {
            return right;
        }

        if (right == null) {
            return left;
        }

        // Process from right to left
        final int leftLength = left.length() - 1;
        final int rightLength = right.length() - 1;
        final int max = leftLength > rightLength ? leftLength : rightLength;
        final StringBuilder sum = new StringBuilder(max);

        int indexLeft = leftLength;
        int indexRight = rightLength;

        int carry = 0;

        while (indexLeft >= 0 || indexRight >= 0) {

            if (indexLeft >= 0) {
                carry += left.charAt(indexLeft) - '0';
                indexLeft--;
            }

            if (indexRight >= 0) {
                carry += right.charAt(indexRight) - '0';
                indexRight--;
            }

            final int lastInt = carry % 10;
            sum.append(lastInt);
            carry = carry / 10;
        }

        if (carry == 1) {
            sum.append(1);
        }

        return sum.reverse().toString();
    }
}
