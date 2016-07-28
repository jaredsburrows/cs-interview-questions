/* Sum square difference
 * Problem 6
 * The sum of the squares of the first ten natural numbers is, 12 + 22 +
 * ... + 102 = 385
 * The square of the sum of the first ten natural numbers is, (1 + 2 +
 * ... + 10)2 = 552 = 3025
 * Hence the difference between the sum of the squares of the first ten
 * natural numbers and the square of the sum is 3025 − 385 = 2640. Find
 * the difference between the sum of the squares of the first one hundred
 * natural numbers and the square of the sum. */
#include <stdio.h>

int problem006() {
    int sum = 0;
    int sum2 = 0;
    int i = 0;

    for (i = 1; i < 101; i++) {
        sum += i * i;
        sum2 += i;
    }

    printf("%d\n", (sum2 * sum2) - sum);

    return 0;
}
