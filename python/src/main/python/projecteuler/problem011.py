#!/usr/bin/python
"""
Largest product in a grid
https://projecteuler.net/problem=11
"""

array = []
with open("11.txt") as f:
    for x in f:
        x = x.strip().split(" ")
        array.append(x)


def checMax(n):
    max_number, temp = 0, 0
    for i in range(len(array) + 1):
        for j in range(len(array[0]) + 1):
            if j + 4 < len(array) and i + 4 < len(array):
                temp = int(array[i][j]) * \
                       int(array[i][j + 1]) * \
                       int(array[i][j + 2]) * \
                       int(array[i][j + 3])
                max_number = temp if temp > max_number else max_number
                temp = int(array[i][j]) \
                       * int(array[i + 1][j]) \
                       * int(array[i + 2][j]) \
                       * int(array[i + 3][j])
                max_number = temp if temp > max_number else max_number
                temp = int(array[i + 3][j]) \
                       * int(array[i + 2][j + 1]) \
                       * int(array[i + 1][j + 2]) \
                       * int(array[i][j + 3])
                max_number = temp if temp > max_number else max_number
                temp = int(array[i][j + 3]) * int(array[i + 1][j + 2]) * int(
                    array[i + 2][j + 1]) * int(array[i + 3][j + 1])
                max_number = temp if temp > max_number else max_number
    return max_number


def main():
    print(checMax(array))


if __name__ == "__main__":
    main()
