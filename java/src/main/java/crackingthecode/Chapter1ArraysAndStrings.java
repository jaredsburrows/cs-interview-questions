package crackingthecode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public final class Chapter1ArraysAndStrings {
    /**
     * 1.1 - Implement an algorithm to determine if a string has all unique characters. What if you
     * can not use additional data structures?
     */
    // Time - O(N), Space - O(1)
    public boolean isUniqueCharacters(String input) {
        if (input == null || input.trim().isEmpty()) {
            return false;
        }

        // Assumes lower case english alphabet
        if (input.length() > 26) {
            return false;
        }

        int check = 0;

        for (int i = 0; i < input.length(); i++) {
            int value = 1 << (input.charAt(i) - 'a');

            // Check the bit, bit = (number >> x) & 1;
            boolean hasValue = (check & value) > 0;
            if (hasValue) {
                return false;
            }

            // Set the bit, number |= 1 << x;
            check |= value;
        }

        return true;
    }

    // Time - O(N), Space - O(N)
    public boolean isUniqueCharacters2(String input) {
        if (input == null || input.trim().isEmpty()) {
            return false;
        }

        // Need to increase if charset is greater than 256
        boolean[] charset = new boolean[256];

        for (int i = 0; i < input.length(); i++) {
            int value = input.charAt(i);
            if (charset[value]) {
                return false;
            }

            charset[value] = true;
        }

        return true;
    }

    /**
     * 1.2 - Write code to reverse a C-Style String. (C-String means that “abcd” is represented as
     * five characters, including the null character.)
     */
    // Time - O(N), Space - O(1)
    public char[] reverseString(char[] input) {
        if (input == null) {
            return new char[0];
        }

        if (input.length == 0) {
            return input;
        }

        for (int i = 0, j = input.length - 1; i < j; i++, j--) {
            char temp = input[i];
            input[i] = input[j];
            input[j] = temp;
        }

        return input;
    }

    /**
     * 1.3 - Design an algorithm and write code to remove the duplicate characters in a string without
     * using any additional buffer. NOTE: One or two additional variables are fine. An extra copy of
     * the array is not. FOLLOW UP Write the test cases for this method.
     */
    // in java you can print the bytes and show that '\0' is not removing chars, the book answer does this
    // the book answer fails for strings like "baaaaaaaaaad"
    public String removeDuplicates(String input) {
        if (input == null) {
            return "";
        }

        if (input.trim().isEmpty()) {
            return input;
        }

        Set<Character> characterSet = new HashSet<>();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char value = input.charAt(i);
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
    public boolean isAnagram(String input, String input2) {
        if (input == null || input2 == null) {
            return false;
        }

        int length = input.length();
        if (length != input2.length() || length < 2) {
            return false;
        }

        char[] chars = input.toCharArray();
        char[] chars2 = input2.toCharArray();

        Arrays.sort(chars);
        Arrays.sort(chars2);

        return Arrays.equals(chars, chars2);
    }

    // Time - O(N), Space - O(N)
    public boolean isAnagram2(String input, String input2) {
        if (input == null || input2 == null) {
            return false;
        }

        // Need to increase if charset is greater than 256
        int total = 256;
        int length = input.length();

        if (length != input2.length() || length < 2) {
            return false;
        }

        // All chars
        int[] counts = new int[total];

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
    public String replaceSpaces(String input) {
        if (input == null) {
            return "";
        }

        StringBuilder stringBuilder = new StringBuilder();
        char[] chars = input.toCharArray();

        for (char c : chars) {
            stringBuilder.append(c == ' ' ? "%20" : c);
        }

        return stringBuilder.toString();
    }

    // Time - O(N), Space - O(N)
    public String replaceSpaces2(String input) {
        if (input == null) {
            return "";
        }

        return input.replaceAll(" ", "%20");
    }

    /**
     * 1.6 - Given an image represented by an NxN matrix, where each pixel in the image is 4 bytes,
     * write a method to rotate the image by 90 degrees. Can you do this in place?
     */
    // Time - O(N), Space - O(1)
    public int[][] rotateImage(int[][] image) {
        if (image == null) {
            return new int[0][0];
        }

        int length = image.length;
        for (int i = 0; i < length / 2; i++) {
            int last = length - 1 - i;
            for (int j = i; j < last; j++) {
                int offset = j - i;
                int tmp = last - offset;
                int temp = image[i][j];       // save top
                image[i][j] = image[tmp][i];        // left -> top
                image[tmp][i] = image[last][tmp];   // bottom -> left
                image[last][tmp] = image[j][last];  // right -> bottom
                image[j][last] = temp;              // top -> right
            }
        }

        return image;
    }

    // Time - O(N), Space - O(1)
    public int[][] rotateImage2(int[][] image) {
        if (image == null) {
            return new int[0][0];
        }

        int length = image.length;
        int[][] newImage = new int[length][length];

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
    public int[][] markRows(int[][] matrix) {
        if (matrix == null) {
            return new int[0][0];
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
     * 1.8 - Assume you have a method isSubstring which checks if one word is a substring of another.
     * Given two strings, s1 and s2, write code to check if s2 is a rotation of s1 using only one call
     * to isSubstring (i.e., “waterbottle” is a rotation of “erbottlewat”).
     */
    // Time - O(n), Space O(N)
    public boolean isSubstring(String input, String input2) {
        if (input == null || input2 == null) {
            return false;
        }

        if (input.length() != input2.length()) {
            return false;
        }

        // waterbottle -> wat|erbottlewat|erbottle
        String rotationString = input2 + input2;
        return rotationString.contains(input);
    }
}
