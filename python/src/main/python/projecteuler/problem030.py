#!/usr/bin/python
"""
Digit fifth powers
https://projecteuler.net/problem=30
"""


def numberexponent(n, e):
    n = list(n)
    sum = 0
    for i in range(len(n)):
        sum = sum + int(n[i]) ** e
    return sum


def main():
    sum = 0
    for i in range(10, 1000000):
        if numberexponent(str(i), 5) == i:
            sum = sum + i
    print(sum)


if __name__ == "__main__":
    main()
