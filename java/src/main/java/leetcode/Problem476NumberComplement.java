package leetcode;

/**
 * https://leetcode.com/problems/number-complement/
 */
public final class Problem476NumberComplement {
    public int findComplement(int num) {
        return ~num & ((Integer.highestOneBit(num) << 1) - 1);
    }
}
