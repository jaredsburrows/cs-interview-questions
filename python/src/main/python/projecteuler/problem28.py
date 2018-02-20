#!/usr/bin/python
"""
Number spiral diagonals
https://projecteuler.net/problem=28
"""


def main():
    total = 0
    for i in range(1, 1001 + 1):
        if i % 2 != 0 and i != 1:
            total = total + (i ** 2) + (i ** 2 - i + 1) + (i ** 2 - i * 2 + 2) + (i ** 2 - i * 3 + 3)
    print(total + 1)


if __name__ == "__main__":
    main()
