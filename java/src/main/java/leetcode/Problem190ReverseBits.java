package leetcode;

/**
 * https://leetcode.com/problems/reverse-bits/
 */
public final class Problem190ReverseBits {
    public int reverseBits(long num) {
        int reverse = 0;
        for (int i = 0; i < 32; i++) {
            reverse = (int) (reverse + (num & 1));
            num >>>= 1;
            if (i < 31) {
                reverse <<= 1;
            }
        }
        return reverse;
    }
}
