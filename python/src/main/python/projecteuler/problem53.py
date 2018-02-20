#!/usr/bin/python
"""
Combinatoric selections
https://projecteuler.net/problem=53
"""

import math


def chose(x, y):
    return float(math.factorial(x)) / (math.factorial(y) * math.factorial(x - y))


def main():
    total = 0
    for i in range(1, 100 + 1):
        for j in range(1, 100 + 1):
            if i > j:
                if chose(i, j) > 1000000:
                    total = total + 1
    print(total)


if __name__ == "__main__":
    main()
