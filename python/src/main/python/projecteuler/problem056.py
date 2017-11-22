#!/usr/bin/python
"""
Powerful digit sum
https://projecteuler.net/problem=56
"""


def digitalsum(n):
    n = list(str(n))
    sum = 0
    for i in range(len(n)):
        sum = sum + int(n[i])
    return sum


def main():
    hold = 0
    for i in range(1, 100):
        for j in range(1, 100):
            temp = digitalsum(i ** j)
            if temp > hold:
                hold = temp
    print(hold)


if __name__ == "__main__":
    main()
