/* Largest palindrome product
 * Problem 4
 * A palindromic number reads the same both ways. The largest palindrome
 * made from the product of two 2-digit numbers is 9009 = 91 × 99. Find
 * the largest palindrome made from the product of two 3-digit numbers. */
#include <stdio.h>

int isPalindrome(int n) {
    int temp = n;
    int rev = 0;

    while (temp) {
        rev = (rev * 10) + (temp % 10);
        temp /= 10;
    }

    return n == rev ? 1 : 0;
}

int problem004() {
    int i = 0;
    int j = 0;
    int max = 0;

    for (i = 999; i > 0; i--) {
        for (j = 999; j > 0; j--) {
            int tmp = i * j;
            if (isPalindrome(tmp) && tmp > max) {
                max = tmp;
                break;
            }
        }
    }

    printf("%d\n", max);

    return 0;
}
