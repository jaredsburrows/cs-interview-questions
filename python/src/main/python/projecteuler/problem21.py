#!/usr/bin/python
"""
Amicable numbers
https://projecteuler.net/problem=21
"""


def d(n):
    q = []
    for i in range(1, n / 2 + 1, 1):
        if n % i == 0:
            q.append(i)
    return sum(q)


def main():
    w = []
    for i in range(1, 10000, 1):
        if i == d(d(i)) and i != d(i):
            print(i)
            w.append(i)
    print(sum(w))


if __name__ == "__main__":
    main()
