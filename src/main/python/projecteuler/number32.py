#!/usr/bin/python
"""
Pandigital products
Problem 32
We shall say that an n-digit number is pandigital if it makes use of all the digits 1 to n exactly once; for example, the 5-digit number, 15234, is 1 through 5 pandigital.

The product 7254 is unusual, as the identity, 39 x 186 = 7254, containing multiplicand, multiplier, and product is 1 through 9 pandigital.

Find the sum of all products whose multiplicand/multiplier/product identity can be written as a 1 through 9 pandigital.

HINT: Some products can be obtained in more than one way so be sure to only include it once in your sum.
"""

def isPandigital(a):
    count = 10*[0]
    while a != 0:
        if count[a%10] == 1: return False
        count[a%10] += 1
        a /= 10
    return True

def main():
	sum = 0
	q, t, w, final = [], [], [], []
	for i in range(1, 10000):
		for j in range(1, 10000):
			t = [str(i), str(j), str(i * j)]
			q = "".join(t)
			if isPandigital(int(q)) and len(q) == 9 and not "0" in str(q):
				print(i, "\t", t[2])
				w.append(t[2])
	w = list(set(w))
	for i in range(len(w)):
		sum = sum + int(w[i])
	print(sum)

if __name__ == "__main__":
	main()