#!/usr/bin/python
import math

"""
Combinatoric selections
Problem 53
There are exactly ten ways of selecting three from five, 12345:

123, 124, 125, 134, 135, 145, 234, 235, 245, and 345

In combinatorics, we use the notation, 5C3 = 10.

In general,

nCr =
n!
r!(n-r)!
,where r <= n, n! = nx(n-1)x...x3x2x1, and 0! = 1.
It is not until n = 23, that a value exceeds one-million: 23C10 = 1144066.

How many, not necessarily distinct, values of  nCr, for 1 ≤ n ≤ 100, are greater than one-million?
"""

def chose(x, y):
    return float(math.factorial(x)) / (math.factorial(y) * math.factorial(x - y))

def main():
    sum = 0
    for i in range(1, 100 + 1):
        for j in range(1, 100 + 1):
            if i > j:
                if chose(i, j) > 1000000:
                    sum = sum + 1
    print(sum)

if __name__ == "__main__":
    main()
