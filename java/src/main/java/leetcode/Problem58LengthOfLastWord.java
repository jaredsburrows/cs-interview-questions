package leetcode;

/**
 * https://leetcode.com/problems/length-of-last-word/
 */
public final class Problem58LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }

        String trimmed = s.trim();
        String[] strings = trimmed.split("\\s+", -1);
        return strings[strings.length - 1].length();
    }

    // faster
    public int lengthOfLastWord2(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }

        String trimmed = s.trim();
        return trimmed.length() - trimmed.lastIndexOf(" ") - 1;
    }
}
