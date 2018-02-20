#!/usr/bin/python
"""
XOR decryption
https://projecteuler.net/problem=59
"""

import itertools
import re
import string


def main():
    cipher_file = open("cipher1.txt").read().split(",")

    for key in itertools.permutations(string.ascii_lowercase[:26], r=3):
        temp, t, total = "", "", 0
        for i in range(len(cipher_file)):
            t = chr(int(cipher_file[i]) ^ ord(key[i % 3]))
            temp += t
            total += ord(t)
        if re.match("^[A-Za-z0-9(),';.! ]*$", temp):
            print(total, key)
            break


if __name__ == "__main__":
    main()
