package crackingthecode.part2conceptsandalgorithms;

public class Chapter5BitManipulation {

    /**
     * You are given two 32-bit numbers, N and M, and two bit positions, i and j. Write a method to
     * set all bits between i and j in N equal to M (e.g., M becomes a substring of N located at i
     * and starting at j).
     * EXAMPLE:
     * Input: N = 10000000000, M = 10101, i = 2, j = 6
     * Output: N = 10001010100
     */
    public static int setBitPosition(final int n, final int m, final int i, final int j) {
        int max = ~0;
        int left = max - ((1 << j) - 1);
        int right = ((1 << i) - 1);
        int mask = left | right;
        return (n & mask) | (m << i);
    }
}
