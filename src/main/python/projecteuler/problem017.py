#!/usr/bin/python
"""
Number letter counts
Problem 17
If the numbers 1 to 5 are written out in words: one, two, three, four, five, then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.

If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words, how many letters would be used?


NOTE: Do not count spaces or hyphens. For example, 342 (three hundred and forty-two) contains 23 letters and 115 (one hundred and fifteen) contains 20 letters. The use of "and" when writing out numbers is in compliance with British usage.
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
        if i >= 10 and i < 20:
            total.append(units[i])
        if i >= 20 and i < 100:
            total.append(tens[int(list(str(i))[0]) % 10]+units[i % 10])
    for i in range(100, 1000):
        if i >= 100 and i < 110:
            if units[i % 10] == "":
                total.append(units[int(list(str(i))[0]) % 10]+"hundred")
            else:
                total.append(units[int(list(str(i))[0]) % 10]+"hundred and"+units[i % 10])
        if i >= 110 and i < 120:
            total.append(units[int(list(str(i))[0]) % 10]+"hundred and"+units[i % 100])
        if i >= 120 and i < 200:
            if units[i % 10] == "":
                total.append(units[int(list(str(i))[0]) % 10]+"hundred and"+tens[int(list(str(i))[1]) % 10])
            else:
                total.append(units[int(list(str(i))[0]) % 10]+"hundred and"+tens[int(list(str(i))[1]) % 10]+units[i % 10])
        if i >= 200 and i < 210:
            if units[i % 10] == "":
                total.append(units[int(list(str(i))[0]) % 10]+"hundred")
            else:
                total.append(units[int(list(str(i))[0]) % 10]+"hundred and"+units[i % 10])
        if i >= 210 and i < 220:
            total.append(units[int(list(str(i))[0]) % 10]+"hundred and"+units[i % 100])
        if i >= 220 and i < 300:
            if units[i % 10] == "":
                total.append(units[int(list(str(i))[0]) % 10]+"hundred and"+tens[int(list(str(i))[1]) % 10])
            else:
                total.append(units[int(list(str(i))[0]) % 10]+"hundred and"+tens[int(list(str(i))[1]) % 10]+units[i % 10])
        if i >= 300 and i < 310:
            if units[i % 10] == "":
                total.append(units[int(list(str(i))[0]) % 10]+"hundred")
            else:
                total.append(units[int(list(str(i))[0]) % 10]+"hundred and"+units[i % 10])
        if i >= 310 and i < 320:
            total.append(units[int(list(str(i))[0]) % 10]+"hundred and"+units[i % 100])
        if i >= 320 and i < 400:
            if units[i % 10] == "":
                total.append(units[int(list(str(i))[0]) % 10]+"hundred and"+tens[int(list(str(i))[1]) % 10])
            else:
                total.append(units[int(list(str(i))[0]) % 10]+"hundred and"+tens[int(list(str(i))[1]) % 10]+units[i % 10])
        if i >= 400 and i < 410:
            if units[i % 10] == "":
                total.append(units[int(list(str(i))[0]) % 10]+"hundred")
            else:
                total.append(units[int(list(str(i))[0]) % 10]+"hundred and"+units[i % 10])
        if i >= 410 and i < 420:
            total.append(units[int(list(str(i))[0]) % 10]+"hundred and"+units[i % 100])
        if i >= 420 and i < 500:
            if units[i % 10] == "":
                total.append(units[int(list(str(i))[0]) % 10]+"hundred and"+tens[int(list(str(i))[1]) % 10])
            else:
                total.append(units[int(list(str(i))[0]) % 10]+"hundred and"+tens[int(list(str(i))[1]) % 10]+units[i % 10])
        if i >= 500 and i < 510:
            if units[i % 10] == "":
                total.append(units[int(list(str(i))[0]) % 10]+"hundred")
            else:
                total.append(units[int(list(str(i))[0]) % 10]+"hundred and"+units[i % 10])
        if i >= 510 and i < 520:
            total.append(units[int(list(str(i))[0]) % 10]+"hundred and"+units[i % 100])
        if i >= 520 and i < 600:
            if units[i % 10] == "":
                total.append(units[int(list(str(i))[0]) % 10]+"hundred and"+tens[int(list(str(i))[1]) % 10])
            else:
                total.append(units[int(list(str(i))[0]) % 10]+"hundred and"+tens[int(list(str(i))[1]) % 10]+units[i % 10])
        if i >= 600 and i < 610:
            if units[i % 10] == "":
                total.append(units[int(list(str(i))[0]) % 10]+"hundred")
            else:
                total.append(units[int(list(str(i))[0]) % 10]+"hundred and"+units[i % 10])
        if i >= 610 and i < 620:
            total.append(units[int(list(str(i))[0]) % 10]+"hundred and"+units[i % 100])
        if i >= 620 and i < 700:
            if units[i % 10] == "":
                total.append(units[int(list(str(i))[0]) % 10]+"hundred and"+tens[int(list(str(i))[1]) % 10])
            else:
                total.append(units[int(list(str(i))[0]) % 10]+"hundred and"+tens[int(list(str(i))[1]) % 10]+units[i % 10])
        if i >= 700 and i < 710:
            if units[i % 10] == "":
                total.append(units[int(list(str(i))[0]) % 10]+"hundred")
            else:
                total.append(units[int(list(str(i))[0]) % 10]+"hundred and"+units[i % 10])
        if i >= 710 and i < 720:
            total.append(units[int(list(str(i))[0]) % 10]+"hundred and"+units[i % 100])
        if i >= 720 and i < 800:
            if units[i % 10] == "":
                total.append(units[int(list(str(i))[0]) % 10]+"hundred and"+tens[int(list(str(i))[1]) % 10])
            else:
                total.append(units[int(list(str(i))[0]) % 10]+"hundred and"+tens[int(list(str(i))[1]) % 10]+units[i % 10])
        if i >= 800 and i < 810:
            if units[i % 10] == "":
                total.append(units[int(list(str(i))[0]) % 10]+"hundred")
            else:
                total.append(units[int(list(str(i))[0]) % 10]+"hundred and"+tens[int(list(str(i))[1]) % 10]+units[i % 10])
        if i >= 810 and i < 820:
            total.append(units[int(list(str(i))[0]) % 10]+"hundred and"+units[i % 100])
        if i >= 820 and i < 900:
            if units[i % 10] == "":
                total.append(units[int(list(str(i))[0]) % 10]+"hundred and"+tens[int(list(str(i))[1]) % 10])
            else:
                total.append(units[int(list(str(i))[0]) % 10]+"hundred and"+tens[int(list(str(i))[1]) % 10]+units[i % 10])
        if i >= 900 and i < 910:
            if units[i % 10] == "":
                total.append(units[int(list(str(i))[0]) % 10]+"hundred")
            else:
                total.append(units[int(list(str(i))[0]) % 10]+"hundred and"+units[i % 10])
        if i >= 910 and i < 920:
            total.append(units[int(list(str(i))[0]) % 10]+"hundred and"+units[i % 100])
        if i >= 920 and i < 1000:
            if units[i % 10] == "":
                total.append(units[int(list(str(i))[0]) % 10]+"hundred and"+tens[int(list(str(i))[1]) % 10])
            else:
                total.append(units[int(list(str(i))[0]) % 10]+"hundred and"+tens[int(list(str(i))[1]) % 10]+units[i % 10])
    total.append("one thousand")
    print(len("".join(total).replace(" ", "")))
    
if __name__ == "__main__":
    main()
