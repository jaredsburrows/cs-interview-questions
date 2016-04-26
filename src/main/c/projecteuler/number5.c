/* Smallest multiple
 * Problem 5
 * 2520 is the smallest number that can be divided by each of the numbers 
 * from 1 to 10 without any remainder. What is the smallest positive 
 * number that is evenly divisible by all of the numbers from 1 to 20? */
#include <stdio.h>

int smallest(int n)
{
	int i = 0;
	for (i = 1; i < 21; i++)
		if (n % i)
			return 0;
	return 1;
}


 int main()
 {
 	int i = 1;

 	while (! smallest(i))
 		i++;

 	printf("%d\n", i);

 	return 0;
 }
