#!/usr/bin/python
"""
Self powers
Problem 48
The series, 11 + 22 + 33 + ... + 1010 = 10405071317.

Find the last ten digits of the series, 11 + 22 + 33 + ... + 10001000.
"""

def main():
	sum = 0
	for i in range(1, 1000):
		sum = sum + i**i
	print(str(sum)[-10:len(str(sum))])

if __name__ == "__main__":
	main()