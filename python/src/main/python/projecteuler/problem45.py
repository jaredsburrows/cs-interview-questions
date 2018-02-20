#!/usr/bin/python
"""
Triangular, pentagonal, and hexagonal
https://projecteuler.net/problem=45
"""


def trianglenumber(n):
    return .5 * n * (n + 1)


def trianglenumbers(n):
    q = []
    for i in range(1, n + 1):
        q.append(trianglenumber(i))
    return q


def pentagonalnumber(n):
    return n * (3 * n - 1) * .5


def pentagonalnumbers(n):
    q = []
    for i in range(1, n + 1):
        q.append(pentagonalnumber(i))
    return q


def hexagonalnumber(n):
    return n * (2 * n - 1)


def hexagonalnumbers(n):
    q = []
    for i in range(1, n + 1):
        q.append(hexagonalnumber(i))
    return q


def main():
    hold = 0
    t = trianglenumbers(100000)
    h = hexagonalnumbers(100000)
    p = pentagonalnumbers(100000)
    for i in range(len(t)):
        if t[i] in h and t[i] in p:
            hold = i
    print(t[hold])


if __name__ == "__main__":
    main()
