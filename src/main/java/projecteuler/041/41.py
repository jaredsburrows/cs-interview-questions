#!/usr/bin/python
"""
Pandigital prime
Problem 41
We shall say that an n-digit number is pandigital if it makes use of all the digits 1 to n exactly once. For example, 2143 is a 4-digit pandigital and is also prime.

What is the largest n-digit pandigital prime that exists?
"""

def isPrime(n):
	n = abs(int(n))
	if n < 2:
		return False
	if n == 2:
		return True
	if not n & 1:
		return False
	for i in range(3, int(n**0.5)+1, 2):
		if n % i == 0:
			return False
	return True

def isOneToN(n):
	n.sort()
	tmp = 0
	temp = int(n[0])
	for i in range(len(n)):
		if temp != int(n[i]):
			return False
		temp += 1
	return True

def getHighest(n):
	n = list(str(n))
	n.sort()
	return n[len(n) - 3]

def ispandigital19(n):
	count = 0
	q = []
	n = list(str(n))
	for i in range(len(n)):
		if n[i] in q or n[i] == "0":
			return False
		else:
			q.append(n[i])
	if (isOneToN(q) and len(q) == int(getHighest(q))):
		return True
	else:
		return False

def main():
	for i in range(7654321, 0, -2):
		if (isPrime(i)):
			if (ispandigital19(i)):
				print(i)
				break

if __name__ == "__main__":
	main()