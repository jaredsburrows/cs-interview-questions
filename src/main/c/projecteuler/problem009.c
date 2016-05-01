/* Special Pythagorean triplet
 * Problem 9
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for 
 * which, a2 + b2 = c2 For example, 32 + 42 = 9 + 16 = 25 = 52. There 
 * exists exactly one Pythagorean triplet for which a + b + c = 1000. Find
 * the product abc.*/
#include <stdio.h>

 int main()
 {
    int i = 0, j = 0, k = 0, flag = 0;

    for (i = 1; flag != 1; i++)
    {
        for (j = 1; j < 998; j++)
        {
            for (k = 1; k < 998; k++)
            {
                if (i < j && j < k && (i + j + k) == 1000 && ((i * i) + (j * j) == (k * k)))
                {
                    flag = 1;
                    printf("%d\n", i * j * k);
                    break;
                }
            }
        }
    }

    return 0;
 }
