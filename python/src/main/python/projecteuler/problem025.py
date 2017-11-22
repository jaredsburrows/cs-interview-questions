#!/usr/bin/python
"""
1000-digit Fibonacci number
https://projecteuler.net/problem=25
"""


def fib(n):
    a, b = 0, 1
    for i in range(n):
        a, b = b, a + b
    return a


def main():
    i = 0
    while len(str(fib(i))) < 1000:
        i = i + 1
    print(i)


if __name__ == "__main__":
    main()
