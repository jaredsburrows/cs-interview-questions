package questions.stringarraymatrix;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public final class Substring {

    // Time - O(N), Space - O(N)
    public static String substring(final String input, final int end) {
        return substring(input, 0, end);
    }

    // Time - O(N), Space - O(N)
    public static String substring(final String input, final int start, final int end) {

        if (input == null) {
            return null;
        }

        if (input.isEmpty()) {
            return "";
        }

        if (start < 0 || start > input.length() || start > end) {
            return null;
        }

        if (end < 0 || end > input.length() || end < start) {
            return null;
        }

        final StringBuilder stringBuilder = new StringBuilder();

        for (int i = start; i < end; i++) {
            stringBuilder.append(input.charAt(i));
        }

        return stringBuilder.toString();
    }
}
