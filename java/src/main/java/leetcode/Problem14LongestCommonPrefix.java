package leetcode;

/**
 * https://leetcode.com/problems/longest-common-prefix
 * https://leetcode.com/explore/learn/card/array-and-string/203/introduction-to-string/1162/
 */
public final class Problem14LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        String prefix = strs[0];
        for (String str : strs) {
            while (str.indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }

        return prefix;
    }
}
