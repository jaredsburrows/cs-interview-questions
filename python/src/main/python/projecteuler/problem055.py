#!/usr/bin/python
"""
Lychrel numbers
https://projecteuler.net/problem=55
"""


def isPan(n):
    return n[::-1] == n


def reverse(n):
    return n + int(str(n)[::-1])


def isLychrel(n):
    count = 0
    temp = n
    for i in range(50):
        temp = reverse(temp)
        count = count + 1
        print(count, "\t", temp)
        if isPan(str(temp)):
            break
    if count < 50:
        return True
    else:
        return False


def main():
    c = 0
    for i in range(10000):
        if not isLychrel(i):
            c = c + 1
            print(c, "\t", i)
    print(c)


if __name__ == "__main__":
    main()
