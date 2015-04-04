package crackingthecode.part2conceptsandalgorithms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Chapter9SortingAndSearching {

    /**
     * 9.1 - You are given two sorted arrays, A and B, and A has a large enough buffer at the end to
     * hold B. Write a method to merge B into A in sorted order.
     */
    // Time - O(N), Space - O(1)
    public static int[] mergeBInA(final int[] a, final int[] b, final int sizeA) {
        if (a == null) {
            return null;
        }

        if (b == null) {
            return a;
        }

        int aIndex = sizeA - 1;
        int bIndex = b.length - 1;
        final int totalLength = sizeA + bIndex; // total elements

        // read in elements backwards
        for (int i = totalLength; i > 0; i--) {
            if (aIndex >= 0 && bIndex >= 0) {
                if (a[aIndex] > b[bIndex]) {
                    a[i] = a[aIndex--];
                } else {
                    a[i] = b[bIndex--];
                }
            } else if (bIndex >= 0) {
                a[i] = a[bIndex--];
            }
        }

        return a;
    }

    /**
     * 9.2 - Write a method to sort an array of strings so that all the anagrams are next to each
     * other.
     */
    // [anagram, anagram, notanagram, notanagram]?
    // [Aanagram, anagramA, Banagram, anagramB]?
    // Time - O(N^2 LOG N), Space - O(n)
    public static List<String> sortAnagrams(List<String> anagrams) {
        for (int i = 0; i < anagrams.size(); i++) {
            char[] tempArray = anagrams.get(i).toCharArray();
            Arrays.sort(tempArray);
            anagrams.set(i, new String(tempArray));
        }

        Collections.sort(anagrams);

        return anagrams;
    }

    /**
     * 9.3 - Given a sorted array of n integers that has been rotated an unknown number of times,
     * give an O(log n) algorithm that finds an element in the array. You may assume that the array
     * was originally sorted in increasing order.
     * EXAMPLE:
     * Input: find 5 in array (15 16 19 20 25 1 3 4 5 7 10 14)
     * Output: 8 (the index of 5 in the array)
     */
    // TODO - review
    // 15 16 19 20 25 1  3  4  5  7 10 14
    // 0  1  2  3  4  5  6  7  8  9 10 11
    // Time - Best - O(LOG N), Space - O(1) - does not work with duplicates
    public static int getRotatedIndexOf(final int[] array, final int target) {
        if (array == null) {
            return -1;
        }

        int min = 0;
        int max = array.length - 1;

        while (min <= max) {
            int mid = (max + min) / 2;

            if (array[mid] == target) {
                return mid;
            } else if (array[min] <= array[mid]) {
                if (array[mid] < target) {
                    min = mid + 1;
                } else if (array[mid] > target) {
                    max = mid - 1;
                } else {
                    min = mid + 1;
                }
            } else if (target < array[mid]) {
                max = mid - 1;
            } else if (target <= array[max]) {
                min = mid + 1;
            } else {
                max = mid - 1;
            }
        }

        return -1;
    }

    /**
     * 9.4 - If you have a 2 GB file with one string per line, which sorting algorithm would you use
     * to sort the file and why?
     */
    // Since there are 2 GBs of strings we need to sort, I would use Merge Sort because it's average
    // and worst Time complexity is O(N LG N) and it's Space complexity is O(N).

    // If the interview says that we are limited on memory, then we need to split the 2GB file into
    // smaller chucks such that memory used * number of chunk = 2GBs.

    // External short should be used - sort each chuck separately, then merge them one by one together.

    /**
     * 9.5 - Given a sorted array of strings which is interspersed with empty strings, write a
     * method to find the location of a given string.
     */
    // Time - LOG(N), Space - O(1) - Binary Search
    // TODO
    public static int findString(final String[] array, final String target) {
        int min = 0;
        int max = array.length - 1;

        while (min <= max) {
            int middle = (min + max) / 2;
            if (array[middle].equals(target)) {
                return middle;
            } else if (array[middle].equals("")) {
            } else if (array[middle].compareTo(target) < 0) {
                min = middle + 1;
            } else {
                max = middle - 1;
            }
        }

        return -1;
    }

    // Time - O(N), Space - O(1) - Linear Search
    public static int findString2(final String[] array, final String target) {
        int pos = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(target)) {
                pos = i;
                break;
            }
        }

        return pos;
    }

    /**
     * 9.6 - Given a matrix in which each row and each column is sorted, write a method to find an
     * element in it.
     */
    // binary search for the 2d array
    // row, col search only?
    // Time - O(N), Space - O(1)
    public static boolean findValue(final int[][] matrix, final int target) {
        if (matrix == null) {
            return false;
        }

        int length = matrix.length - 1;
        int row = 0;
        int col = length;

        while ((row < length) && (col >= 0)) {
            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] > target) {
                col--;
            } else {
                row++;
            }
        }

        return false;
    }

    /**
     * 9.7 - A circus is designing a tower routine consisting of people standing atop one another’s
     * shoulders. For practical and aesthetic reasons, each person must be both shorter and lighter
     * than the person below him or her. Given the heights and weights of each person in the circus,
     * write a method to compute the largest possible number of peo- ple in such a tower.
     * EXAMPLE:
     * Input (ht, wt): (65, 100) (70, 150) (56, 90) (75, 190) (60, 95) (68, 110)
     * Output: The longest tower is length 6 and includes from top to bottom: (56, 90) (60,95)
     * (65,100) (68,110) (70,150) (75,190)
     */
    // use map
    // sort by height, sort by weight
    // return new map
}
