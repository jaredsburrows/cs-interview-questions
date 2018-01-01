/* Largest prime factor
 * Problem 3
 * The prime factors of 13195 are 5, 7, 13 and 29. What is the largest
 * prime factor of the number 600851475143 ? */
#include <stdio.h>
#include <math.h>

int isPrime003(int n) {
    int i = 0;

    if (n < 4) {
        return 1;
    }

    if (! (n % 2)) {
        return 0;
    }

    for (i = 3; i <= pow(n, 0.5); i+=2) {
        if (! (n % i)) {
            return 0;
        }
    }

    return 1;
}

int problem003() {
    long num = 600851475143;
    long i = pow(num, 0.5) + 1;

    while (i -= 2) {
        if (! (num % i) && isPrime003(i)) {
            break;
        }
    }

    printf("%ld", i);

    return 0;
}
