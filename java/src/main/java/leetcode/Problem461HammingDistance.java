package leetcode;

/**
 * https://leetcode.com/problems/hamming-distance/
 */
public final class Problem461HammingDistance {
    public int hammingDistance(int x, int y) {
        int distance = 0;
        int currentValue = x ^ y;

        while (currentValue != 0) {
            distance++;

            currentValue &= currentValue - 1;
        }

        return distance;
    }
}
