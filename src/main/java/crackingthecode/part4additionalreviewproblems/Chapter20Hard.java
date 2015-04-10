package crackingthecode.part4additionalreviewproblems;

public class Chapter20Hard {

    // binary bitwise
    // &  AND
    // ^  exclusive OR (XOR)
    // |  inclusive OR
    // unary bitwise
    // ~  complement (NOT)

    // TOGGLING
    // x = x ^ mask;
    // (or shorthand x ^= mask;)
    // XOR truth table
    // 0 ^ 0 = 0
    // 1 ^ 0 = 1
    // 0 ^ 1 = 1
    // 1 ^ 1 = 0

    // x = x & (~mask);
    // (or x &= (~mask);)
    // AND truth table
    // 0 & 0 = 0
    // 1 & 0 = 0
    // 0 & 1 = 0
    // 1 & 1 = 1

    // x = x | mask;
    // (or x |= mask;)
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

}
