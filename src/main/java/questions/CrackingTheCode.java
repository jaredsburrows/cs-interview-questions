package questions;

import java.util.Arrays;

public class CrackingTheCode {

    /**
     * Implement an algorithm to determine if a string has all unique
     * characters. What if you can not use additional data structures?
     */
    // O(N)
    public static boolean hasUniqueCharacters(final String str) {
        if (str == null || str.trim().length() == 0) {
            return false;
        }

        if (str.length() > 26) {
            return false;
        }

        long check = 0;

        for (int i = 0; i < str.length(); i++) {
            long val = 1 << (str.charAt(i) - 'a');
            if ((check & val) > 0) {
                return false;
            }
            check |= val;
        }

        return true;
    }

    /**
     * Write a method to replace all spaces in a string with '%20'.
     */
    public static String replaceSpaces(final String str) {
        if (str == null) {
            return null;
        }

        return str.replaceAll("%20", "");
    }

    /**
     * Write a method to decide if two strings are anagrams or not.
     */
    // N LOG(N)
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

    // O(N)
    public static boolean isAnagram2(final String str, final String str2) {
        if (str == null || str2 == null) {
            return false;
        }

        int total = 256;
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
}
