#!/usr/bin/python
"""
Powerful digit counts
Problem 63
The 5-digit number, 16807=75, is also a fifth power. Similarly, the 9-digit number, 134217728=89, is a ninth power.

How many n-digit positive integers exist which are also an nth power?
"""

def main():
	count = 0
	test = 0
	for i in range(1, 30):
		for j in range(1, 30):
			test = i**j
			if len(str(int(test))) == j:
				count = count + 1
	print(count)

if __name__ == "__main__":
	main()