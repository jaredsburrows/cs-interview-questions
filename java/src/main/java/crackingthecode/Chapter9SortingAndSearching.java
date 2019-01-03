package crackingthecode;

import api.Pair;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class Chapter9SortingAndSearching {
    /**
     * 9.1 - You are given two sorted arrays, A and B, and A has a large enough buffer at the end to
     * hold B. Write a method to merge B into A in sorted order.
     */
    // Time - O(N), Space - O(1)
    public int[] mergeBInA(int[] arrayA, int[] arrayB, int sizeA) {
        if (arrayA == null) {
            return new int[0];
        }

        if (arrayB == null) {
            return arrayA;
        }

        int indexA = sizeA - 1;
        int indexB = arrayB.length - 1;
        int totalLength = sizeA + indexB; // total elements

        // read in elements backwards
        for (int i = totalLength; i > 0; i--) {
            if (indexA >= 0 && indexB >= 0) {
                if (arrayA[indexA] > arrayB[indexB]) {
                    arrayA[i] = arrayA[indexA--];
                } else {
                    arrayA[i] = arrayB[indexB--];
                }
            } else if (indexB >= 0) {
                arrayA[i] = arrayA[indexB--];
            }
        }

        return arrayA;
    }

    /**
     * 9.2 - Write a method to sort an array of strings so that all the anagrams are next to each
     * other.
     */
    // [anagram, anagram, notanagram, notanagram]?
    // [Aanagram, anagramA, Banagram, anagramB]?
    // Time - O(N^2*LOG(N)), Space - O(n)
    public List<String> sortAnagrams(List<String> anagrams) {
        for (int i = 0; i < anagrams.size(); i++) {
            char[] tempArray = anagrams.get(i).toCharArray();
            Arrays.sort(tempArray);
            anagrams.set(i, new String(tempArray));
        }

        Collections.sort(anagrams);

        return anagrams;
    }

    /**
     * 9.3 - Given a sorted array of n integers that has been rotated an unknown number of times, give
     * an O(LOG(N)) algorithm that finds an element in the array. You may assume that the array was
     * originally sorted in increasing order. EXAMPLE: Input: find 5 in array (15 16 19 20 25 1 3 4 5
     * 7 10 14) Output: 8 (the index of 5 in the array)
     */
    // 15 16 19 20 25 1  3  4  5  7 10 14
    // 0  1  2  3  4  5  6  7  8  9 10 11
    // Time - Best - O(LOG(N)), Space - O(1) - does not work with duplicates
    public int getRotatedIndexOf(int[] array, int target) {
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

    /*
     * 9.4 - If you have a 2 GB file with one string per line, which sorting algorithm would you use
     * to sort the file and why?
     */
    // Since there are 2 GBs of strings we need to sort, I would use Merge Sort because it's average
    // and worst Time complexity is O(N*LOG(N)) and it's Space complexity is O(N).

    // If the interview says that we are limited on memory, then we need to split the 2GB file into
    // smaller chucks such that memory used * number of chunk = 2GBs.

    // External short should be used - sort each chuck separately, then merge them one by one together.

    /**
     * 9.5 - Given a sorted array of strings which is interspersed with empty strings, write a method
     * to find the location of a given string.
     */
    // Time - O(LOG(N))?, Space - O(1) - Binary Search
    public int findString(String[] strings, String target) {
        int min = 0;
        int max = strings.length - 1;

        String first = "tmp";

        // O(N) -- get first not empty string
        for (String anArray : strings) {
            if (!anArray.isEmpty()) {
                first = anArray;
                break;
            }
        }

        // O(N) -- fill in blanks, previous + number
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].isEmpty()) {
                strings[i] = first + i; // O(M + N), we always know i, O(M + 1)
            } else {
                first = strings[i];
            }
        }

        // O(LOG(N)) - binary search
        while (min <= max) {
            int mid = (min + max) / 2;
            if (strings[mid].equals(target)) { // O(N)
                return mid;
            } else if (strings[mid].compareTo(target) < 0) { // O(N)
                min = mid + 1;
            } else {
                max = mid - 1;
            }
        }

        return -1;
    }

    // Time - O(N), Space - O(1) - Linear Search
    public int findString2(String[] strings, String target) {
        int pos = -1;

        for (int i = 0; i < strings.length; i++) {
            if (strings[i].equals(target)) {
                pos = i;
                break;
            }
        }

        return pos;
    }

    // book answer
    public int findString3(String[] strings, String target, int left, int right) {
        while (left <= right) {
            // Ensure there is something at the end
            while (left <= right && strings[right].isEmpty()) {
                right--;
            }

            if (left > right) {
                return -1;
            }

            int midIndex = left + (right - left) / 2;
            while (strings[midIndex].isEmpty()) {
                midIndex++;
            }

            int emptyIndex = strings[midIndex].compareTo(target);
            if (emptyIndex == 0) {
                return midIndex;
            } else if (emptyIndex < 0) {
                left = midIndex + 1;
            } else {
                right = midIndex - 1;
            }
        }

        return -1;
    }

    public int findString3(String[] strings, String target) {
        if (strings == null || target == null) {
            return -1;
        }

        if (target.isEmpty()) {
            for (int i = 0; i < strings.length; i++) {
                if (strings[i].isEmpty()) {
                    return i;
                }
            }
        }

        return findString3(strings, target, 0, strings.length - 1);
    }

    /**
     * 9.6 - Given a matrix in which each row and each column is sorted, write a method to find an
     * element in it.
     */
    // binary search for the 2d array
    // row, col search only?
    // Time - O(N), Space - O(1)
    public boolean findValue(int[][] matrix, int target) {
        if (matrix == null) {
            return false;
        }

        int length = matrix.length - 1;
        int row = 0;
        int col = length;

        // start at top row/col
        while (row < length && col >= 0) {
            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] > target) {
                // go down y
                col--;
            } else {
                // go right x
                row++;
            }
        }

        return false;
    }

    /**
     * 9.7 - A circus is designing a tower routine consisting of people standing atop one another’s
     * shoulders. For practical and aesthetic reasons, each person must be both shorter and lighter
     * than the person below him or her. Given the heights and weights of each person in the circus,
     * write a method to compute the largest possible number of peo- ple in such a tower. EXAMPLE:
     * Input (ht, wt): (65, 100) (70, 150) (56, 90) (75, 190) (60, 95) (68, 110) Output: The longest
     * tower is length 6 and includes from top to bottom: (56, 90) (60,95) (65,100) (68,110) (70,150)
     * (75,190)
     */
    // use map
    // sort by height, sort by weight
    // return new map
    // Time - O(N*LOG(N)), Space -
    public List<Pair<Integer, Integer>> getCircusOrder(List<Pair<Integer, Integer>> original) {
        original.sort((left, right) ->
            left.getRight() < right.getRight() && left.getLeft() < right.getLeft()
                ? -1
                : 1);

        return original;
    }
}
