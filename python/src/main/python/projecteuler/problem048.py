#!/usr/bin/python
"""
Self powers
https://projecteuler.net/problem=48
"""


def main():
    sum = 0
    for i in range(1, 1000):
        sum = sum + i ** i
    print(str(sum)[-10:len(str(sum))])


if __name__ == "__main__":
    main()
