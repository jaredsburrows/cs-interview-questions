#!/usr/bin/python
"""
Pandigital products
https://projecteuler.net/problem=32
"""


def isPandigital(a):
    count = 10 * [0]
    while a != 0:
        if count[a % 10] == 1:
            return False
        count[a % 10] += 1
        a /= 10
    return True


def main():
    total = 0
    q, t, w = [], [], []
    for i in range(1, 10000):
        for j in range(1, 10000):
            t = [str(i), str(j), str(i * j)]
            q = "".join(t)
            if isPandigital(int(q)) and len(q) == 9 and not "0" in str(q):
                print(i, "\t", t[2])
                w.append(t[2])
    w = list(set(w))
    for i in range(len(w)):
        total = total + int(w[i])
    print(total)


if __name__ == "__main__":
    main()
