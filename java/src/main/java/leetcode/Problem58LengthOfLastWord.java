package leetcode;

/**
 * https://leetcode.com/problems/length-of-last-word/
 */
public final class Problem58LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }

        s = s.trim();
        String[] strings = s.split("\\s+", -1);
        return strings[strings.length - 1].length();
    }
}
