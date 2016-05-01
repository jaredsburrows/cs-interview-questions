#!/usr/bin/python
"""
Truncatable primes
Problem 37
The number 3797 has an interesting property. Being prime itself, it is possible to continuously remove digits from left to right, and remain prime at each stage: 3797, 797, 97, and 7. Similarly we can work from right to left: 3797, 379, 37, and 3.

Find the sum of the only eleven primes that are both truncatable from left to right and right to left.

NOTE: 2, 3, 5, and 7 are not considered to be truncatable primes.
"""

def isprime(n):
    n = abs(int(n))
    if n < 2:
        return False
    if n == 2:
        return True
    if not n & 1:
        return False
    for i in range(3, int(n**0.5)+1, 2):
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
