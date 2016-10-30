package crackingthecode.part2conceptsandalgorithms;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public final class Chapter5BitManipulation {

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
     * 5.1 - You are given two 32-bit numbers, N and M, and two bit positions, i and j. Write a
     * method to set all bits between i and j in N equal to M (e.g., M becomes a substring of N
     * located at i and starting at j).
     * EXAMPLE:
     * Input: N = 10000000000, M = 10101, i = 2, j = 6
     * Output: N = 10001010100
     */
    public static int setBitPosition(final int left, final int right, final int positionA, final int positionB) {
        int max = ~0;
        int shiftMax = (max - 1) << (positionB - 1);
        int shift = 1 << (positionA - 1);
        int mask = shiftMax | shift;

        return (left & mask) | (right << positionA);
    }

    /*
     * 5.2 - Given a (decimal - e.g. 3.72) number that is passed in as a string, print the binary
     * representation. If the number can not be represented accurately in binary, print “ERROR”.
     */

    /*
     * 5.3 - Given an integer, print the next smallest and next largest number that have the same
     * number of 1 bits in their binary representation.
     */

    /*
     * 5.4 - Explain what the following code does: ((n & (n-1)) == 0).
     */
    // Prints if number is a power of 2
    // >>> print bin(1)[2:].zfill(8)
    // 00000001
    // >>> print bin(2)[2:].zfill(8)
    // 00000010
    // >>> print bin(4)[2:].zfill(8)
    // 00000100
    // >>> print bin(8)[2:].zfill(8)
    // 00001000
    // >>> print bin(2)[2:].zfill(8)
    // Step 1. (n-1)                - subtracts 1 from n
    // Step 2. (n & (n-1))          - bitwise AND two numbers n and (n-1)
    // Step 3. ((n & (n-1)) == 0)   - returns true if value from step 2 is 0, false is other value

    /**
     * 5.5 - Write a function to determine the number of bits required to convert integer A to
     * integer B.
     * Input: 31, 14
     * Output: 2
     */
    // 0011 - 4
    // 0010 - 3
    // output: 1
    // 1010 - 10
    // 0101 -  5
    // output: ?
    // 00011111 - 31
    // 00001110 - 14
    // output: 2
    // assuming 32 bit integers
    // Time - O(32) == O(1), Space - O(1)
    public static int getDiffBits(final int left, final int right) {

        final int zeroDiff;
        final int oneDiff;
        int zeroA = 0;
        int zeroB = 0;
        int oneA = 0;
        int oneB = 0;

        for (int i = 0; i < 32; i++) {
            final int temp = left >> (32 - i - 1) & 1;
            if (temp == 0) {
                zeroA++;
            } else {
                oneA++;
            }
        }

        for (int i = 0; i < 32; i++) {
            final int temp = right >> (32 - i - 1) & 1;
            if (temp == 0) {
                zeroB++;
            } else {
                oneB++;
            }
        }

        zeroDiff = Math.abs(zeroB - zeroA);
        oneDiff = Math.abs(oneB - oneA);

        if (zeroDiff == oneDiff) {
            return zeroDiff;
        } else {
            return zeroDiff + oneDiff;
        }
    }

    // book answer
    public static int bitSwapRequired(final int left, final int right) {
        int count = 0;
        for (int c = left ^ right; c != 0; c = c >> 1) {
            count += c & 1;
        }
        return count;
    }

    /**
     * 5.6 - Write a program to swap odd and even bits in an integer with as few instructions as
     * possible (e.g., bit 0 and bit 1 are swapped, bit 2 and bit 3 are swapped, etc).
     */
    // 101, so swap 0 and 1?
    // 1010, so swap 1 and 0?
    // so 1010 should become 0101?
    // 0x55555555 = 1431655765 = 01010101010101010101010101010101
    // 0xaaaaaaaa = 2863311530 = 10101010101010101010101010101010
    // book answer
    public static int getSwapBits(final int number) {
        return ((number & 0xaaaaaaaa) >> 1) | ((number & 0x55555555) << 1);
    }

    /*
     * 5.7 - An array A[1...n] contains all the integers from 0 to n except for one number which is
     * missing. In this problem, we cannot access an entire integer in A with a single operation.
     * The elements of A are represented in binary, and the only operation we can use to access them
     * is “fetch the jth bit of A[i]”, which takes constant time. Write code to find the missing
     * integer. Can you do it in O(n) time?
     */
    // A[1..n], 0 to n
    // one number missing
    // numbers in A are in binary
    // “fetch the jth bit of A[i]”, which takes constant time - O(1)
    // add up all the numbers, subtract sum from the array, if sorted - O(N)
}
