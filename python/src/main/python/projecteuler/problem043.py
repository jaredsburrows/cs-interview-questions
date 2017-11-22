#!/usr/bin/python
"""
Sub-string divisibility
https://projecteuler.net/problem=43
"""

import itertools


def isPandigitalString(string):
    digits = len(string)

    if digits >= 11:
        return False

    for i in range(0, digits):
        if str(i) not in string:
            return False
    return True


def div(p, n):
    return int(p[1 + n:2 + n] + p[2 + n:3 + n] + p[3 + n:4 + n])


def main():
    test = list(itertools.permutations([0, 1, 2, 3, 4, 5, 6, 7, 8, 9]))
    total = 0

    for x in range(len(test)):
        i = int(''.join(map(str, test[x])))
        if (div(str(i), 0) % 2 == 0
            and div(str(i), 1) % 3 == 0
            and div(str(i), 2) % 5 == 0
            and div(str(i), 3) % 7 == 0
            and div(str(i), 4) % 11 == 0
            and div(str(i), 5) % 13 == 0
            and div(str(i), 6) % 17 == 0):
            print(i)
            total = total + i
    print(total)


if __name__ == "__main__":
    main()
