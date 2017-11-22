#!/usr/bin/python
"""
Digit fifth powers
https://projecteuler.net/problem=30
"""


def numberexponent(n, e):
    n = list(n)
    total = 0
    for i in range(len(n)):
        total = total + int(n[i]) ** e
    return total


def main():
    total = 0
    for i in range(10, 1000000):
        if numberexponent(str(i), 5) == i:
            total = total + i
    print(total)


if __name__ == "__main__":
    main()
