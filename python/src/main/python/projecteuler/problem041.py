#!/usr/bin/python
"""
Pandigital prime
https://projecteuler.net/problem=41
"""


def isPrime(n):
    n = abs(int(n))
    if n < 2:
        return False
    if n == 2:
        return True
    if not n & 1:
        return False
    for i in range(3, int(n ** 0.5) + 1, 2):
        if n % i == 0:
            return False
    return True


def isOneToN(n):
    n.sort()
    temp = int(n[0])
    for i in range(len(n)):
        if temp != int(n[i]):
            return False
        temp += 1
    return True


def getHighest(n):
    n = list(str(n))
    n.sort()
    return n[len(n) - 3]


def ispandigital19(n):
    q = []
    n = list(str(n))
    for i in range(len(n)):
        if n[i] in q or n[i] == "0":
            return False
        else:
            q.append(n[i])
    if isOneToN(q) and len(q) == int(getHighest(q)):
        return True
    else:
        return False


def main():
    for i in range(7654321, 0, -2):
        if isPrime(i):
            if ispandigital19(i):
                print(i)
                break


if __name__ == "__main__":
    main()
