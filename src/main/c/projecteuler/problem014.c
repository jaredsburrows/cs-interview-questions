/* Longest Collatz sequence
 * Problem 14
 * Published on Friday, 5th April 2002, 12:00 pm; Solved by 104601
 * The following iterative sequence is defined for the set of positive 
 * integers:
 * n → n/2 (n is even)
 * n → 3n + 1 (n is odd)
 * Using the rule above and starting with 13, we generate the following 
 * sequence: 13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
 * It can be seen that this sequence (starting at 13 and finishing at 1) 
 * contains 10 terms. Although it has not been proved yet (Collatz Problem
 * ), it is thought that all starting numbers finish at 1.
 * Which starting number, under one million, produces the longest chain? 
 * NOTE: Once the chain starts the terms are allowed to go above one 
 * million. */
#include <stdio.h>
#include <math.h>

long seq(long a)
{
    long count = 0;

    while (a > 0)
    {
        if (a == 1)
            break;

        a = (a % 2 == 0) ? a / 2 : (3 * a) + 1; 

        count++;
    }

    return ++count;
}

 int main()
 {
    long start = 0, num = 0, i = 1000000, temp = 0;

    while (i-- != 13)
    {
        temp = seq(i);
        if (temp > start)
        {
            start = temp;
            num = i;
        }   
    }


    printf("%ld\n", num);

    return 0;
 }
