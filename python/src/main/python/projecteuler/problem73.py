#!/usr/bin/python
"""
Counting fractions in a range
https://projecteuler.net/problem=73
"""


def main():
    q = []
    for i in range(1, 12000):
        for j in range(1, 12000 + 1):
            if j > i:
                temp = float(i) / j
                if float(1) / 3 < temp < float(1) / 2:
                    q.append(temp)

    print(len(list(set(q))))


if __name__ == "__main__":
    main()
