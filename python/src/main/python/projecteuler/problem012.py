#!/usr/bin/python
"""
Highly divisible triangular number
https://projecteuler.net/problem=12
"""


def trianglenumber(n):
    return .5 * n * (n + 1)


def trianglenumbers(n):
    num = []
    for i in range(1, n + 1):
        num.append(trianglenumber(i))
    return num


def tau(n):
    sqroot, t = int(n ** 0.5), 0
    for factor in range(1, sqroot + 1):
        if n % factor == 0:
            t += 2
    if sqroot * sqroot == n:
        t = t - 1
    return t


def main():
    q = trianglenumbers(100000)
    for i in range(len(q)):
        if tau(q[i]) > 500:
            print(int(q[i]))
            break


if __name__ == "__main__":
    main()
