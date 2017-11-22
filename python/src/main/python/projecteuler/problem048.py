#!/usr/bin/python
"""
Self powers
https://projecteuler.net/problem=48
"""


def main():
    total = 0
    for i in range(1, 1000):
        total = total + i ** i
    print(str(total)[-10:len(str(total))])


if __name__ == "__main__":
    main()
