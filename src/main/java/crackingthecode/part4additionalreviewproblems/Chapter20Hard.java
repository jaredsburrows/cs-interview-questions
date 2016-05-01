package crackingthecode.part4additionalreviewproblems;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Chapter20Hard {

    // binary bitwise
    // &  AND
    // ^  exclusive OR (XOR)
    // |  inclusive OR
    // unary bitwise
    // ~  complement (NOT)

    // TOGGLING
    // x = x ^ mask;
    // (or shorthand x ^= mask)
    // XOR truth table
    // 0 ^ 0 = 0
    // 1 ^ 0 = 1
    // 0 ^ 1 = 1
    // 1 ^ 1 = 0

    // x = x & (~mask)
    // (or x &= (~mask))
    // AND truth table
    // 0 & 0 = 0
    // 1 & 0 = 0
    // 0 & 1 = 0
    // 1 & 1 = 1

    // x = x | mask
    // (or x |= mask)
    // OR truth table
    // 0 | 0 = 0
    // 1 | 0 = 1
    // 0 | 1 = 1
    // 1 | 1 = 1

    /**
     * 20.1 - Write a function that adds two numbers. You should not use + or any arithmetic
     * operators.
     */
    // Time - O(LOG(N)), Space - O(1)
    public static long addTwoNumbers(long a, long b) {
        // if a = 4, b = 5

        while (b != 0) {
            long carry = a & b;     // 4 = 4 & 5
            a = a ^ b;              // 1 = 4 ^ 5
            b = carry << 1;         // 8 = 4 << 1
        }

        // First pass:
        // 4 = 4 &  5,  carry = 4, a = 4, b = 5
        // 1 = 4 ^  5,  a = 1
        // 8 = 4 << 1,  b = 8
        // Second pass:
        // 0 = 1 &  8,  carry = 0
        // 9 = 1 ^  8,  a = 9
        // 0 = 0 << 1,  b = 0

        return a;
    }

    // Time - O(LOG(N)), Space - O(1)
    public static long substractTwoNumbers(long a, long b) {
        // if a = 5, b = 4

        while (b != 0) {
            long carry = ~(a) & b;  // 0 = -6 & 4
            a = a ^ b;              // 1 = 5 ^ 4
            b = carry << 1;         // 0 = 0 << 1
        }

        // First pass:
        // 0 = -6 & 4,  carry = 0, a = -6, b = 4
        // 1 = 5 ^ 4,  a = 1
        // 0 = 0 << 1,  b = 0

        return a;
    }

    /**
     * 20.2 - Write a method to shuffle a deck of cards. It must be a perfect shuffle - in other
     * words, each 52! permutations of the deck has to be equally likely. Assume that you are given
     * a random number generator which is perfect.
     */
    // TODO

    /**
     * 20.3 - Write a method to randomly generate a set of m integers from an array of size n. Each
     * element must have equal probability of being chosen.
     */
    // TODO

    /**
     * 20.4 - Write a method to count the number of 2s between 0 and n.
     */
    // 2, 12, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 32
    // Time - O(N*M), Space - O(1)
    public static long countNumber2s(int number) {
        long count = 0;

        for (long i = 0; i <= number; i++) { // N
            long temp = i;
            while (temp != 0) { // M
                long num = temp % 10;
                temp /= 10;
                if (num == 2) {
                    count++;
                }
            }
        }

        return count;
    }

    // book answer
    // Time - O(N), Space - O(1)
    // TODO
    public static int count2sI(int num) {
        int countof2s = 0, digit = 0;
        int j = num, seendigits = 0, position = 0, pow10_pos = 1;
        /* maintaining this value instead of calling pow() is an 6x perf
         * gain (48s -> 8s) pow10_posMinus1. maintaining this value
         * instead of calling Numof2s is an 2x perf gain (8s -> 4s).
         * overall > 10x speedup */
        while (j > 0) {
            digit = j % 10;
            int pow10_posMinus1 = pow10_pos / 10;
            countof2s += digit * position * pow10_posMinus1;
            /* we do this if digit <, >, or = 2
             * Digit < 2 implies there are no 2s contributed by this
             * digit.
             * Digit == 2 implies there are 2 * numof2s contributed by
             * the previous position + num of 2s contributed by the
             * presence of this 2 */
            if (digit == 2) {
                countof2s += seendigits + 1;
            /* Digit > 2 implies there are digit * num of 2s by the prev.
             * position + 10^position */
            } else if (digit > 2) {
                countof2s += pow10_pos;
            }
            seendigits = seendigits + pow10_pos * digit;
            pow10_pos *= 10;
            position++;
            j = j / 10;
        }
        return countof2s;
    }

    /**
     * 20.5 - You have a large text file containing words. Given any two words, find the shortest
     * distance (in terms of number of words) between them in the file. Can you make the
     * searching operation in O(1) time? What about the space complexity for your solution?
     */
    // any two words? what about duplicates?

    /**
     * 20.6 - Describe an algorithm to find the largest 1 million numbers in 1 billion numbers.
     * Assume that the computer memory can hold all one billion numbers.
     */
    // only doing 10 for testing
    // Time - O(N *LOG(N)), Space - O(1) -> Time - O(1), Space - O(1), since we already know N and sublist each time
    public static List<Integer> getTopMillion(List<Integer> billion) {
        if (billion == null || billion.size() != 10) { // would be 1,000,000
            return null;
        }

        final List<Integer> integerList = new ArrayList<>(billion);

        // Java 6/7
//        integerList.sort(new Comparator<Integer>() {
//            @Override
//            public int compare(final Integer o1, final Integer o2) {
//                return (o1 > o2) ? 1 : -1;
//            }
//        });

        // Java 8
        integerList.sort((o1, o2) -> (o1 > o2) ? 1 : -1);
        return integerList.subList(5, 10);
    }

    /**
     * 20.7 - Write a program to find the longest word made of other words in a list of words.
     * EXAMPLE
     * Input: test, tester, testertest, testing, testingtester
     * Output: testingtester
     */
    // are we limited on how many words we can join together?

    /**
     * 20.8 - Given a string s and an array of smaller strings T, design a method to search s for
     * each small string in T.
     */
    // s - String
    // T - String[] smaller strings
    // search for what exactly?

    /**
     * 20.9 - Numbers are randomly generated and passed to a method. Write a program to find and
     * maintain the median value as new values are generated.
     */
    // how many random numbers?
    // maintain existing median after adding numbers

    /**
     * 20.10 - Given two words of equal length that are in a dictionary, write a method to transform
     * one word into another word by changing only one letter at a time. The new word you get in
     * each step must be in the dictionary.
     * EXAMPLE
     * Input: DAMP, LIKE
     * Output: DAMP -> LAMP -> LIMP -> LIME -> LIKE
     */
    // what is the data structure of the dictionary? Map<Integer, String>
    public List<String> getTransformedList(Map<Integer, String> dictionary, String word, String word2) {
        if (dictionary == null || word == null || word2 == null) {
            return null;
        }

        if (!dictionary.containsValue(word) || !dictionary.containsValue(word2)) {
            return null;
        }

        final List<String> stringList = new ArrayList<>();
        stringList.add(word);

        char[] temp = word.toCharArray();
        int count = 0;

        while (count <= temp.length) {

            temp[count] = word2.charAt(count);

            String tmp = String.valueOf(temp);

            if (dictionary.containsValue(tmp)) {
                stringList.add(tmp);
                count++;
            }
        }

        return stringList;
    }

    /**
     * 20.11 - Imagine you have a square matrix, where each cell is filled with either black or
     * white. Design an algorithm to find the maximum subsquare such that all four borders are
     * filled with black pixels.
     */

    /**
     * 20.12 - Given an NxN matrix of positive and negative integers, write code to find the
     * submatrix with the largest possible sum.
     */

    /**
     * 20.13 - Given a dictionary of millions of words, give an algorithm to find the largest
     * possible rectangle of letters such that every row forms a word (reading left to right) and
     * every column forms a word (reading top to bottom).
     */
    // dictionary - millions of unique words
    // what about spaces? what separates the words?
}
