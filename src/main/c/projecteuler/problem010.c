/* Summation of primes
 * Problem 10
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 * Find the sum of all the primes below two million.*/
#include <stdio.h>
#include <math.h>

int isPrime(int n)
{   
    int i = 0;

    if (n < 4)
        return 1;

    if (! (n % 2))
        return 0;

    for (i = 3; i <= pow(n, 0.5); i+=2)
        if (! (n % i))
            return 0;

    return 1;
}

 int main()
 {
    long i = 2000000, sum = 0;

    while (i--)
        if (isPrime(i))
            sum += i;

    printf("%ld\n", --sum);

    return 0;
 }
