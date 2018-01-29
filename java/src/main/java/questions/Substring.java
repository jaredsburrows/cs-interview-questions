package questions;

public final class Substring {
    // Time - O(N), Space - O(N)
    public static String substring(String input, int end) {
        return substring(input, 0, end);
    }

    // Time - O(N), Space - O(N)
    public static String substring(String input, int start, int end) {
        if (input == null) {
            return "";
        }

        if (input.isEmpty()) {
            return "";
        }

        if (start < 0 || start > input.length() || start > end) {
            return "";
        }

        if (end < 0 || end > input.length() || end < start) {
            return "";
        }

        final StringBuilder stringBuilder = new StringBuilder();
        for (int i = start; i < end; i++) {
            stringBuilder.append(input.charAt(i));
        }

        return stringBuilder.toString();
    }
}
