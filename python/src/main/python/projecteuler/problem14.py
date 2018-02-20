#!/usr/bin/python
"""
Longest Collatz sequence
https://projecteuler.net/problem=14
"""


def sequence(a):
    n = 0
    while a > 0:
        if a == 1:
            break
        if a % 2 == 0:
            a = a / 2
            n = n + 1
        else:
            a = 3 * a + 1
            n = n + 1
    return n + 1


def main():
    start = 0
    num = 0
    for i in range(13, 1000000):
        temp = sequence(i)
        if temp > start:
            start = temp
            num = i
    print(num)


if __name__ == "__main__":
    main()
