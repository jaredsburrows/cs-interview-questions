package crackingthecode.part1datastructures;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public class Chapter1ArraysAndStrings {

    /**
     * 1.1 - Implement an algorithm to determine if a string has all unique characters. What if you
     * can not use additional data structures?
     */
    // Time - O(N), Space - O(1)
    public static boolean isUniqueCharacters(final String input) {
        if (input == null || input.trim().isEmpty()) {
            return false;
        }

        // Assumes lower case english alphabet
        if (input.length() > 26) {
            return false;
        }

        int check = 0;

        for (int i = 0; i < input.length(); i++) {
            final int value = 1 << (input.charAt(i) - 'a');

            // Check the bit, bit = (number >> x) & 1;
            final boolean hasValue = (check & value) > 0;
            if (hasValue) {
                return false;
            }

            // Set the bit, number |= 1 << x;
            check |= value;
        }

        return true;
    }

    // Time - O(N), Space - O(N)
    public static boolean isUniqueCharacters2(final String input) {
        if (input == null || input.trim().isEmpty()) {
            return false;
        }

        // Need to increase if charset is greater than 256
        final boolean[] charset = new boolean[256];

        for (int i = 0; i < input.length(); i++) {
            final int value = input.charAt(i);
            final boolean isTrue = charset[value];
            if (isTrue) {
                return false;
            }

            charset[value] = true;
        }

        return true;
    }

    /**
     * 1.2 - Write code to reverse a methodC-Style String. (methodC-String means that “abcd” is represented as
     * five characters, including the null character.)
     */
    // Time - O(N), Space - O(1)
    public static char[] reverseString(final char[] input) {
        if (input == null) {
            return null;
        }

        if (input.length == 0) {
            return input;
        }

        int i = 0;
        int j = input.length - 1;

        while (i < j) {
            final char temp = input[i];
            input[i] = input[j];
            input[j] = temp;

            i++;
            j--;
        }

        return input;
    }

    /**
     * 1.3 - Design an algorithm and write code to remove the duplicate characters in a string
     * without using any additional buffer. NOTE: One or two additional variables are fine. An extra
     * copy of the array is not.
     * FOLLOW UP
     * Write the test cases for this method.
     */
    // TODO with char[], in java you can print the bytes and show that '\0' is not removing chars, the book answer does this
    // the book answer fails for strings like "baaaaaaaaaad"
    public static String removeDuplicates(final String input) {
        if (input == null) {
            return null;
        }

        if (input.isEmpty()) {
            return input;
        }

        final Set<Character> characterSet = new HashSet<>();
        final StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            final char value = input.charAt(i);
            if (!characterSet.contains(value)) {
                characterSet.add(value);
                stringBuilder.append(value);
            }
        }

        return stringBuilder.toString();
    }

    /**
     * 1.4 - Write a method to decide if two strings are anagrams or not.
     */
    // Time - O(NLOG(N)), Space - O(N)
    public static boolean isAnagram(final String input, final String input2) {
        if (input == null || input2 == null) {
            return false;
        }

        final int length = input.length();

        if (length != input2.length() || length < 2) {
            return false;
        }

        final char[] chars = input.toCharArray();
        final char[] chars2 = input2.toCharArray();

        Arrays.sort(chars);
        Arrays.sort(chars2);

        return Arrays.equals(chars, chars2);
    }

    // Time - O(N), Space - O(N)
    public static boolean isAnagram2(final String input, final String input2) {
        if (input == null || input2 == null) {
            return false;
        }

        // Need to increase if charset is greater than 256
        final int total = 256;
        final int length = input.length();

        if (length != input2.length() || length < 2) {
            return false;
        }

        // All chars
        final int[] counts = new int[total];

        for (int i = 0; i < length; i++) {
            counts[input.charAt(i)]++;
            counts[input2.charAt(i)]--;
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
    public static String replaceSpaces(final String input) {
        if (input == null) {
            return null;
        }

        final StringBuilder stringBuilder = new StringBuilder();
        final char[] chars = input.toCharArray();

        for (final char c : chars) {
            stringBuilder.append(c == ' ' ? "%20" : c);
        }

        return stringBuilder.toString();
    }

    // Time - O(N), Space - O(N)
    public static String replaceSpaces2(final String input) {
        if (input == null) {
            return null;
        }

        return input.replaceAll(" ", "%20");
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

        final int length = image.length;

        for (int i = 0; i < length / 2; i++) {
            final int last = length - 1 - i;
            for (int j = i; j < last; j++) {
                final int offset = j - i;
                final int tmp = last - offset;
                final int temp = image[i][j];       // save top
                image[i][j] = image[tmp][i];        // left -> top
                image[tmp][i] = image[last][tmp];   // bottom -> left
                image[last][tmp] = image[j][last];  // right -> bottom
                image[j][last] = temp;              // top -> right
            }
        }

        return image;
    }

    // Time - O(N), Space - O(N)
    public static int[][] rotateImage2(final int[][] image) {
        if (image == null) {
            return null;
        }

        final int length = image.length;
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

        final int rows = matrix.length;
        final int cols = matrix[0].length;

        // keep positions of "0"s
        final int[] row = new int[rows];
        final int[] col = new int[cols];

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
    public static boolean isSubstring(final String input, final String input2) {
        if (input == null || input2 == null) {
            return false;
        }

        if (input.length() != input2.length()) {
            return false;
        }

        // waterbottle -> wat|erbottlewat|erbottle
        final String rotationString = input2 + input2;
        return rotationString.contains(input);
    }
}
