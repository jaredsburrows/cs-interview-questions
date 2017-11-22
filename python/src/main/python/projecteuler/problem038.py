#!/usr/bin/python
"""
Pandigital multiples
https://projecteuler.net/problem=38
"""


def isPandigital(a):
    count = 10 * [0]
    while a != 0:
        if count[a % 10] == 1:
            return False
        count[a % 10] += 1
        a /= 10
    return True


def concatenate(n, k):
    q = []
    for i in range(1, k + 1):
        q.append(str(n * i))
    return int("".join(q))


def main():
    test = 0
    for i in range(1, 10000):
        for j in range(1, 10):
            test = concatenate(i, j)
            if len(str(test)) == 9:
                if isPandigital(test):
                    if not "0" in str(test):
                        print(test)


if __name__ == "__main__":
    main()
