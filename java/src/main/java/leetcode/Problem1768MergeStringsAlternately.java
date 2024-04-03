package leetcode;

/**
 * https://leetcode.com/problems/merge-strings-alternately/
 */
public final class Problem1768MergeStringsAlternately {
    // Performance - 0ms runtime - 100%
    public String mergeAlternately(String word1, String word2) {
        int index1 = 0;
        int index2 = 0;
        int length1 = word1.length();
        int length2 = word2.length();
        StringBuilder sb = new StringBuilder(length1 + length2);

        while (index1 < length1 && index2 < length2) {
            sb.append(word1.charAt(index1++));
            sb.append(word2.charAt(index2++));
        }

        sb.append(word1.substring(index1)).append(word2.substring(index2));

        return sb.toString();
    }

    // StringBuilder
    public String mergeAlternately2(String word1, String word2) {
        if (word1 == null || word1.isEmpty()) {
            return word2;
        }
        if (word2 == null || word2.isEmpty()) {
            return word1;
        }

        int index1 = 0;
        int index2 = 0;
        int length1 = word1.length();
        int length2 = word2.length();
        int count = 0;
        StringBuilder sb = new StringBuilder(length1 + length2);

        while (index1 < length1 && index2 < length2) {
            if (count % 2 == 0) {
                sb.append(word1.charAt(index1++));
            } else {
                sb.append(word2.charAt(index2++));
            }
            count++;
        }

        while (index1 < length1) {
            sb.append(word1.charAt(index1++));
        }

        while (index2 < length2) {
            sb.append(word2.charAt(index2++));
        }

        return sb.toString();
    }

    // char[]
    public String mergeAlternately3(String word1, String word2) {
        if (word1 == null && word2 == null) {
            return "";
        }

        if (word1 == null) {
            return word2;
        }

        if (word2 == null) {
            return word1;
        }

        int length1 = word1.length();
        int length2 = word2.length();
        int index1 = 0;
        int index2 = 0;
        int count = 0;
        char[] toReturn = new char[length1 + length2];

        while (index1 < length1 && index2 < length2) {
            if (count % 2 == 0) {
                toReturn[count] = word1.charAt(index1++);
            } else {
                toReturn[count] = word2.charAt(index2++);
            }
            count++;
        }

        while (index1 < length1) {
            toReturn[count] = word1.charAt(index1++);
            count++;
        }

        while (index2 < length2) {
            toReturn[count] = word2.charAt(index2++);
            count++;
        }

        return new String(toReturn);
    }
}
