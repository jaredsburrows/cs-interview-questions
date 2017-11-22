#!/usr/bin/python
"""
Truncatable primes
https://projecteuler.net/problem=37
"""


def isprime(n):
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


def rtruncateprime(n):
    length = len(str(n))
    count = 0
    while n > 0:
        if isprime(n):
            count = count + 1
        n = n / 10
    if length == count:
        return True
    else:
        return False


def ltruncateprime(n):
    length = len(str(n))
    count = 0
    temp = ""
    while n > 0:
        if isprime(n):
            count = count + 1
        temp = str(n)[1:]
        if len(temp) < 1:
            break
        n = int(temp)
    if length == count:
        return True
    else:
        return False


def main():
    sum = 0
    for i in range(11, 1000000):
        if isprime(i):
            if ltruncateprime(i) and rtruncateprime(i):
                sum = sum + i
    print(sum)


if __name__ == "__main__":
    main()
