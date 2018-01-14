package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/**
 * https://leetcode.com/problems/keyboard-row
 *
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public final class Problem500KeyboardRow {
    // Time - , Space -
    public static String[] findWords(String[] words) {
        if (words == null) {
            return new String[0];
        }

        final List<String> wordList = new ArrayList<>();
        final Pattern rowOnePattern = Pattern.compile("^[QWERTYUIOPqwertyuiop]+$");
        final Pattern rowTwoPattern = Pattern.compile("^[ASDFGHJKLasdfghjkl]+$");
        final Pattern rowThreePattern = Pattern.compile("^[ZXCVBNMzxcvbnm]+$");

        for (String word : words) {
            if (rowOnePattern.matcher(word).matches()
                || rowTwoPattern.matcher(word).matches()
                || rowThreePattern.matcher(word).matches()) {
                wordList.add(word);
            }
        }

        return wordList.toArray(new String[0]);
    }
}
