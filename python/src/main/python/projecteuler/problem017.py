#!/usr/bin/python
"""
Number letter counts
https://projecteuler.net/problem=17
"""
units = ["", "one", "two", "three", "four", "five", "six", "seven", "eight",
         "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen",
         "sixteen", "seventeen", "eighteen", "nineteen"]
tens = ["", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"]
total = []


def main():
    for i in range(1, 100):
        if i < 10:
            total.append(units[i])
        if 10 <= i < 20:
            total.append(units[i])
        if 20 <= i < 100:
            total.append(tens[int(list(str(i))[0]) % 10] + units[i % 10])
    for i in range(100, 1000):
        if 100 <= i < 110:
            if units[i % 10] == "":
                total.append(units[int(list(str(i))[0]) % 10] + "hundred")
            else:
                total.append(units[int(list(str(i))[0]) % 10] + "hundred and" + units[i % 10])
        if 110 <= i < 120:
            total.append(units[int(list(str(i))[0]) % 10] + "hundred and" + units[i % 100])
        if 120 <= i < 200:
            if units[i % 10] == "":
                total.append(units[int(list(str(i))[0]) % 10] + "hundred and" + tens[
                    int(list(str(i))[1]) % 10])
            else:
                total.append(units[int(list(str(i))[0]) % 10] + "hundred and" + tens[
                    int(list(str(i))[1]) % 10] + units[i % 10])
        if 200 <= i < 210:
            if units[i % 10] == "":
                total.append(units[int(list(str(i))[0]) % 10] + "hundred")
            else:
                total.append(units[int(list(str(i))[0]) % 10] + "hundred and" + units[i % 10])
        if 210 <= i < 220:
            total.append(units[int(list(str(i))[0]) % 10] + "hundred and" + units[i % 100])
        if 220 <= i < 300:
            if units[i % 10] == "":
                total.append(units[int(list(str(i))[0]) % 10] + "hundred and" + tens[
                    int(list(str(i))[1]) % 10])
            else:
                total.append(units[int(list(str(i))[0]) % 10] + "hundred and" + tens[
                    int(list(str(i))[1]) % 10] + units[i % 10])
        if 300 <= i < 310:
            if units[i % 10] == "":
                total.append(units[int(list(str(i))[0]) % 10] + "hundred")
            else:
                total.append(units[int(list(str(i))[0]) % 10] + "hundred and" + units[i % 10])
        if 310 <= i < 320:
            total.append(units[int(list(str(i))[0]) % 10] + "hundred and" + units[i % 100])
        if 320 <= i < 400:
            if units[i % 10] == "":
                total.append(units[int(list(str(i))[0]) % 10] + "hundred and" + tens[
                    int(list(str(i))[1]) % 10])
            else:
                total.append(units[int(list(str(i))[0]) % 10] + "hundred and" + tens[
                    int(list(str(i))[1]) % 10] + units[i % 10])
        if 400 <= i < 410:
            if units[i % 10] == "":
                total.append(units[int(list(str(i))[0]) % 10] + "hundred")
            else:
                total.append(units[int(list(str(i))[0]) % 10] + "hundred and" + units[i % 10])
        if 410 <= i < 420:
            total.append(units[int(list(str(i))[0]) % 10] + "hundred and" + units[i % 100])
        if 420 <= i < 500:
            if units[i % 10] == "":
                total.append(units[int(list(str(i))[0]) % 10] + "hundred and" + tens[
                    int(list(str(i))[1]) % 10])
            else:
                total.append(units[int(list(str(i))[0]) % 10] + "hundred and" + tens[
                    int(list(str(i))[1]) % 10] + units[i % 10])
        if 500 <= i < 510:
            if units[i % 10] == "":
                total.append(units[int(list(str(i))[0]) % 10] + "hundred")
            else:
                total.append(units[int(list(str(i))[0]) % 10] + "hundred and" + units[i % 10])
        if 510 <= i < 520:
            total.append(units[int(list(str(i))[0]) % 10] + "hundred and" + units[i % 100])
        if 520 <= i < 600:
            if units[i % 10] == "":
                total.append(units[int(list(str(i))[0]) % 10] + "hundred and" + tens[
                    int(list(str(i))[1]) % 10])
            else:
                total.append(units[int(list(str(i))[0]) % 10] + "hundred and" + tens[
                    int(list(str(i))[1]) % 10] + units[i % 10])
        if 600 <= i < 610:
            if units[i % 10] == "":
                total.append(units[int(list(str(i))[0]) % 10] + "hundred")
            else:
                total.append(units[int(list(str(i))[0]) % 10] + "hundred and" + units[i % 10])
        if 610 <= i < 620:
            total.append(units[int(list(str(i))[0]) % 10] + "hundred and" + units[i % 100])
        if 620 <= i < 700:
            if units[i % 10] == "":
                total.append(units[int(list(str(i))[0]) % 10] + "hundred and" + tens[
                    int(list(str(i))[1]) % 10])
            else:
                total.append(units[int(list(str(i))[0]) % 10] + "hundred and" + tens[
                    int(list(str(i))[1]) % 10] + units[i % 10])
        if 700 <= i < 710:
            if units[i % 10] == "":
                total.append(units[int(list(str(i))[0]) % 10] + "hundred")
            else:
                total.append(units[int(list(str(i))[0]) % 10] + "hundred and" + units[i % 10])
        if 710 <= i < 720:
            total.append(units[int(list(str(i))[0]) % 10] + "hundred and" + units[i % 100])
        if 720 <= i < 800:
            if units[i % 10] == "":
                total.append(units[int(list(str(i))[0]) % 10] + "hundred and" + tens[
                    int(list(str(i))[1]) % 10])
            else:
                total.append(units[int(list(str(i))[0]) % 10] + "hundred and" + tens[
                    int(list(str(i))[1]) % 10] + units[i % 10])
        if 800 <= i < 810:
            if units[i % 10] == "":
                total.append(units[int(list(str(i))[0]) % 10] + "hundred")
            else:
                total.append(units[int(list(str(i))[0]) % 10] + "hundred and" + tens[
                    int(list(str(i))[1]) % 10] + units[i % 10])
        if 810 <= i < 820:
            total.append(units[int(list(str(i))[0]) % 10] + "hundred and" + units[i % 100])
        if 820 <= i < 900:
            if units[i % 10] == "":
                total.append(units[int(list(str(i))[0]) % 10] + "hundred and" + tens[
                    int(list(str(i))[1]) % 10])
            else:
                total.append(units[int(list(str(i))[0]) % 10] + "hundred and" + tens[
                    int(list(str(i))[1]) % 10] + units[i % 10])
        if 900 <= i < 910:
            if units[i % 10] == "":
                total.append(units[int(list(str(i))[0]) % 10] + "hundred")
            else:
                total.append(units[int(list(str(i))[0]) % 10] + "hundred and" + units[i % 10])
        if 910 <= i < 920:
            total.append(units[int(list(str(i))[0]) % 10] + "hundred and" + units[i % 100])
        if 920 <= i < 1000:
            if units[i % 10] == "":
                total.append(units[int(list(str(i))[0]) % 10] + "hundred and" + tens[
                    int(list(str(i))[1]) % 10])
            else:
                total.append(units[int(list(str(i))[0]) % 10] + "hundred and" + tens[
                    int(list(str(i))[1]) % 10] + units[i % 10])
    total.append("one thousand")
    print(len("".join(total).replace(" ", "")))


if __name__ == "__main__":
    main()
