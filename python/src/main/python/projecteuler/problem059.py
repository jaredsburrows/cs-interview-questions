#!/usr/bin/python
"""
XOR decryption
https://projecteuler.net/problem=59
"""

import itertools
import re
import string


def main():
    cipherFile = open("cipher1.txt").read().split(",")

    for key in itertools.permutations(string.ascii_lowercase[:26], r=3):
        temp, t, sum = "", "", 0
        for i in range(len(cipherFile)):
            t = chr(int(cipherFile[i]) ^ ord(key[i % 3]))
            temp += t
            sum += ord(t)
        if re.match("^[A-Za-z0-9(),';.! ]*$", temp):
            print(sum, key)
            break


if __name__ == "__main__":
    main()
