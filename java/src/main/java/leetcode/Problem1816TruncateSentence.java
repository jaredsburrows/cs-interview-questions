package leetcode;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/truncate-sentence/
 */
public final class Problem1816TruncateSentence {
    // Time - O(N), Space - O(N), StringBuilder
    public String truncateSentence(String s, int k) {
        if (s == null || s.isEmpty()) {
            return null;
        }

        if (k < 0) {
            return s;
        }

        StringBuilder sb = new StringBuilder();
        int count = 0;

        for (char c : s.toCharArray()) {
            if (c == ' ') {
                count++;
            }

            if (count == k) {
                break;
            }

            sb.append(c);
        }

        return sb.toString();
    }

    // Time - O(N), Space - O(N), Arrays.copyOfRange
    public String truncateSentence2(String s, int k) {
        if (s == null || s.isEmpty()) {
            return null;
        }

        if (k < 0) {
            return s;
        }

        char[] sentence = s.toCharArray();
        int spaceCount = 0;
        int charCount = 0;

        for (char c : sentence) {
            if (c == ' ') {
                spaceCount++;
            }

            if (spaceCount == k) {
                break;
            }

            charCount++;
        }

        return new String(Arrays.copyOfRange(sentence, 0, charCount));
    }

    // Time - O(N), Space - O(N), String.substring
    public String truncateSentence3(String s, int k) {
        if (s == null || s.isEmpty()) {
            return null;
        }

        if (k < 0) {
            return s;
        }

        int spaceCount = 0;
        int charCount = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                spaceCount++;
            }

            if (spaceCount == k) {
                break;
            }

            charCount++;
        }

        return s.substring(0, charCount);
    }
}
