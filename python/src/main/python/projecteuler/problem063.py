#!/usr/bin/python
"""
Powerful digit counts
https://projecteuler.net/problem=63
"""


def main():
    count = 0
    test = 0
    for i in range(1, 30):
        for j in range(1, 30):
            test = i ** j
            if len(str(int(test))) == j:
                count = count + 1
    print(count)


if __name__ == "__main__":
    main()
