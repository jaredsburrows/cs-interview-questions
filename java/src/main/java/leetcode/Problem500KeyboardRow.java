package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/**
 * https://leetcode.com/problems/keyboard-row
 */
public final class Problem500KeyboardRow {
    // Time - , Space -
    public String[] findWords(String[] words) {
        if (words == null) {
            return new String[0];
        }

        List<String> wordList = new ArrayList<>();
        Pattern rowOnePattern = Pattern.compile("^[QWERTYUIOPqwertyuiop]+$");
        Pattern rowTwoPattern = Pattern.compile("^[ASDFGHJKLasdfghjkl]+$");
        Pattern rowThreePattern = Pattern.compile("^[ZXCVBNMzxcvbnm]+$");

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
