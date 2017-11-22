#!/usr/bin/python
"""
Lattice paths
https://projecteuler.net/problem=15
"""

import math


def main():
    print(int((math.factorial(20 * 2) / math.factorial(20)) / math.factorial(20)))


if __name__ == "__main__":
    main()
