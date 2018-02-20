#!/usr/bin/python
"""
Permuted multiples
https://projecteuler.net/problem=52
"""


def samedigits(n, m):
    length = (len(str(n)))
    if length != len(str(m)):
        return False
    n = list(str(n))
    m = list(str(m))
    n.sort()
    m.sort()
    count = 0
    for i in range(length):
        if n[i] == m[i]:
            count = count + 1
    if length == count:
        return True
    else:
        return False


def main():
    for i in range(1, 1000000):
        length = len(str(i))
        if length == len(str(2 * i)) and length == len(str(3 * i)) \
            and length == len(str(4 * i)) and length == len(str(5 * i)) \
            and length == len(str(6 * i)):
            if samedigits(i, 2 * i) and samedigits(i, 3 * i) \
                and samedigits(i, 4 * i) and samedigits(i, 5 * i) \
                and samedigits(i, 6 * i):
                print(i)


if __name__ == "__main__":
    main()
