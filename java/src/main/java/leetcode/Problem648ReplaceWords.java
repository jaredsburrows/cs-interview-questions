package leetcode;

import java.util.List;

/**
 * https://leetcode.com/problems/replace-words/
 */
public final class Problem648ReplaceWords {
    public String replaceWords(List<String> dict, String sentence) {
        if (dict == null || dict.isEmpty() || sentence == null || sentence.isEmpty()) {
            return "";
        }

        String[] array = sentence.split("\\s+", -1);

        for (String s : dict) {
            for (int j = 0; j < array.length; j++) {
                if (array[j].startsWith(s)) {
                    array[j] = s;
                }
            }
        }

        StringBuilder stringBuilder = new StringBuilder(array.length);
        for (String s : array) {
            stringBuilder.append(s);
            stringBuilder.append(' ');
        }

        return stringBuilder.toString().trim();
    }
}
