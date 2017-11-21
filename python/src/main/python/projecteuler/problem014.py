#!/usr/bin/python
"""
Longest Collatz sequence
Problem 14
The following iterative sequence is defined for the set of positive integers:

n - n/2 (n is even)
n - 3n + 1 (n is odd)

Using the rule above and starting with 13, we generate the following sequence:

13 - 40 - 20 - 10 - 5 - 16 - 8 - 4 - 2 - 1
It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.

Which starting number, under one million, produces the longest chain?

NOTE: Once the chain starts the terms are allowed to go above one million.
"""

def sequence(a):
    n = 0
    while a > 0:
        if a == 1:
            break
        if a % 2 == 0:
            a = a / 2
            n = n + 1
        else:
            a = 3 * a + 1
            n = n + 1
    return n + 1

def main():
    start = 0
    num = 0
    for i in range(13, 1000000):
        temp = sequence(i)
        if temp > start:
            start = temp
            num = i
    print(num)

if __name__ == "__main__":
    main()
