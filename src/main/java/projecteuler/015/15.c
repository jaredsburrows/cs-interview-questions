/* Lattice paths
 * Problem 15
 * Starting in the top left corner of a 2×2 grid, and only being able to 
 * move to the right and down, there are exactly 6 routes to the bottom 
 * right corner.How many such routes are there through a 20×20 grid? */
#include <stdio.h>
#include <math.h>

 int main()
 {
 	/* (20 * 2!/20!)/20! - > (21 -> 40)/20! */

 	int i = 0, k = 0;
 	double product = 1;
 	for (i = 21, k = 20; i < 41; i++, k--)
 		product *= ((double)i / k);

 	printf("%ld\n", (long)ceil(product));

 	return 0;
 }
