#!/usr/bin/python
"""
Powerful digit sum
Problem 56
A googol (10100) is a massive number: one followed by one-hundred zeros; 100100 is almost unimaginably large: one followed by two-hundred zeros. Despite their size, the sum of the digits in each number is only 1.

Considering natural numbers of the form, ab, where a, b < 100, what is the maximum digital sum?
"""

def digitalsum(n):
	n = list(str(n))
	sum = 0
	for i in range(len(n)):
		sum = sum + int(n[i])
	return sum

def main():
	hold = 0
	for i in range(1, 100):
	    for j in range(1, 100):
	             temp = digitalsum(i**j)
	             if temp > hold:
	                    hold = temp
	print(hold)

if __name__ == "__main__":
	main()