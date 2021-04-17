package leetcode;

/**
 * https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/
 */
public final class Problem1662CheckIfTwoStringArraysAreEquivalent {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        if (word1 == null && word2 == null) {
            return true;
        }

        if (word1 == null) {
            return false;
        }

        if (word2 == null) {
            return false;
        }

        StringBuilder sb1 = new StringBuilder(word1.length);
        StringBuilder sb2 = new StringBuilder(word2.length);

        for (String s : word1) {
            sb1.append(s);
        }

        for (String s : word2) {
            sb2.append(s);
        }

        String w1 = sb1.toString();
        String w2 = sb2.toString();
        if (w1.length() != w2.length()) {
            return false;
        }

        return w1.equals(w2);
    }

    public boolean arrayStringsAreEqual2(String[] word1, String[] word2) {
        if (word1 == null && word2 == null) {
            return true;
        }

        if (word1 == null) {
            return false;
        }

        if (word2 == null) {
            return false;
        }

        String w1 = String.join("", word1);
        String w2 = String.join("", word2);
        if (w1.length() != w2.length()) {
            return false;
        }

        return w1.equals(w2);
    }
}
