#!/usr/bin/python
"""
Largest prime factor
https://projecteuler.net/problem=3
"""


def main():
    n = 13195
    factors = [x for x in range(1, n / 2, 1) if n % x == 0]
    print(factors)
    # primeFactors = [x for x in factors if for y in range(3, n / 2, 2) if n % i == 0]
    # print(primeFactors)


if __name__ == "__main__":
    main()
