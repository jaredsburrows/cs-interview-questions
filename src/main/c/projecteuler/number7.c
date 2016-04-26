/* 10001st prime
 * Problem 7
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can 
 * see that the 6th prime is 13. What is the 10 001st prime number? */
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
 	int i = 0, count = 0;

 	while (count <= 10001)
 	{
 		i++;
 		if (isPrime(i))
 			count++;
 	}

 	printf("%d\n", i);


 	return 0;
 }
