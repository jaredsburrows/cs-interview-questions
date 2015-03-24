package crackingthecode.part1datastructures;

import java.util.Arrays;

public class Chapter1ArraysAndStrings {

    /**
     * 1.1 - Implement an algorithm to determine if a string has all unique characters. What if you
     * can not use additional data structures?
     */
    // Time - O(N), Space O(1)
    public static boolean isUniqueCharacters(final String str) {
        if (str == null || str.trim().length() == 0) {
            return false;
        }

        if (str.length() > 26) { // assuming lower case english alphabet
            return false;
        }

        int check = 0;

        for (int i = 0; i < str.length(); i++) {
            int val = 1 << (str.charAt(i) - 'a');
            if ((check & val) > 0) {
                return false;
            }
            check |= val;
        }

        return true;
    }

    // Time - O(N), Space - O(N)
    public static boolean isUniqueCharacters2(final String str) {
        if (str == null || str.trim().length() == 0) {
            return false;
        }

        boolean[] charset = new boolean[256]; // need to increase if charset is greater than 256

        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            if (charset[val]) {
                return false;
            }
            charset[val] = true;
        }

        return true;
    }

    /**
     * 1.2 - Write code to reverse a C-Style String. (C-String means that “abcd” is represented as
     * five characters, including the null character.)
     */
    // Time - O(N), Space - O(1)
    public static char[] reverseString(final char[] cstr) {
        if (cstr == null || cstr.length == 0) {
            return null;
        }

        int i = 0;
        int j = cstr.length - 1;

        while (i < j) {
            char temp = cstr[i];
            cstr[i] = cstr[j];
            cstr[j] = temp;

            i++;
            j--;
        }

        return cstr;
    }

    /**
     * 1.3 - Design an algorithm and write code to remove the duplicate characters in a string
     * without using any additional buffer. NOTE: One or two additional variables are fine. An extra
     * copy of the array is not.
     * FOLLOW UP
     * Write the test cases for this method.
     */
    // TODO
    public static char[] removeDuplicates(char[] cstr) {
        if (cstr == null || cstr.length == 0) {
            return null;
        }
        StringBuilder stringBuilder;
        StringBuffer stringBuffer;

        for (int i = 0; i < cstr.length; i++) {
            if (((i + 1) < cstr.length) && (cstr[i] == cstr[i + 1])) {
                cstr[i] = cstr[i + 1];
                System.out.print(cstr[i]);
            }
        }

        return cstr;
    }

    /**
     * 1.4 - Write a method to decide if two strings are anagrams or not.
     */
    // Time - N LOG(N), Space - O(N)
    public static boolean isAnagram(final String str, final String str2) {
        if (str == null || str2 == null) {
            return false;
        }

        int length = str.length();

        if (length != str2.length() || length < 2) {
            return false;
        }

        char[] chars = str.toCharArray();
        char[] chars2 = str2.toCharArray();

        if (chars.length != chars2.length) {
            return false;
        }

        Arrays.sort(chars);
        Arrays.sort(chars2);

        return Arrays.equals(chars, chars2);
    }

    // Time - O(N), Space - O(N)
    public static boolean isAnagram2(final String str, final String str2) {
        if (str == null || str2 == null) {
            return false;
        }

        int total = 256; // need to increase if charset is greater than 256
        int length = str.length();

        if (length != str2.length() || length < 2) {
            return false;
        }

        int[] counts = new int[total]; // all chars

        for (int i = 0; i < length; i++) {
            counts[str.charAt(i)]++;
            counts[str2.charAt(i)]--;
        }

        for (int i = 0; i < total; i++) {
            if (counts[i] != 0) {
                return false;
            }
        }

        return true;
    }

    /**
     * 1.5 - Write a method to replace all spaces in a string with '%20'.
     */
    // Time - O(N), Space - O(N)
    public static String replaceSpaces(final String str) {
        if (str == null) {
            return null;
        }

        final StringBuilder stringBuilder = new StringBuilder();
        final char[] chars = str.toCharArray();

        for (final char aChar : chars) {
            if (aChar == ' ') {
                stringBuilder.append("%20");
            } else {
                stringBuilder.append(aChar);
            }
        }

        return stringBuilder.toString();
    }

    // Time - O(N), Space - O(N)
    public static String replaceSpaces2(final String str) {
        if (str == null) {
            return null;
        }

        return str.replaceAll(" ", "%20");
    }

    /**
     * 1.6 - Given an image represented by an NxN matrix, where each pixel in the image is 4 bytes,
     * write a method to rotate the image by 90 degrees. Can you do this in place?
     */
    // Time - O(N), Space - O(1)
    public static int[][] rotateImage(final int[][] image) {
        if (image == null) {
            return null;
        }

        int length = image.length;

        for (int i = 0; i < length / 2; i++) {
            int last = length - 1 - i;
            for (int j = i; j < last; j++) {
                int offset = j - i;
                int temp = image[i][j]; // save top
                image[i][j] = image[last - offset][i]; // left -> top
                image[last - offset][i] = image[last][last - offset]; // bottom -> left
                image[last][last - offset] = image[j][last]; // right -> bottom
                image[j][last] = temp; // top -> right
            }
        }

        return image;
    }

    // Time - O(N), Space - O(N)
    public static int[][] rotateImage2(final int[][] image) {
        if (image == null) {
            return null;
        }

        int length = image.length;
        final int[][] newImage = new int[length][length];

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                newImage[i][j] = image[length - j - 1][i];
            }
        }

        return newImage;
    }

    /**
     * 1.7 - Write an algorithm such that if an element in an MxN matrix is 0, its entire row and
     * column is set to 0.
     */
    // Time - O(NM), Space - O(OM)
    public static int[][] markRows(final int[][] matrix) {
        if (matrix == null) {
            return null;
        }

        int rows = matrix.length;
        int cols = matrix[0].length;

        // keep positions of "0"s
        int[] row = new int[rows];
        int[] col = new int[cols];

        // mark the positions of the "0"s
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }

        // finally go back and set row/col to 0
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (row[i] == 1 || col[j] == 1) {
                    matrix[i][j] = 0;
                }
            }
        }

        return matrix;
    }

    /**
     * 1.8 - Assume you have a method isSubstring which checks if one word is a substring of
     * another. Given two strings, s1 and s2, write code to check if s2 is a rotation of s1 using
     * only one call to isSubstring (i.e., “waterbottle” is a rotation of “erbottlewat”).
     */
    // Time - O(n), Space O(N)
    public static boolean isSubstring(final String s1, final String s2) {
        return !(s1 == null || s2 == null) && s1.length() == s2.length() && (s2 + s2).contains(s1);
    }
}
