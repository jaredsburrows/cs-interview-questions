package crackingthecode.part1datastructures

import spock.lang.Ignore
import spock.lang.Specification

class Chapter1ArraysAndStringsSpec extends Specification {

    Chapter1ArraysAndStrings chapter1ArraysAndStrings

    def "setup"() {
        chapter1ArraysAndStrings = new Chapter1ArraysAndStrings()
    }

    def "hasUniqueCharacters"() {
        expect:
        chapter1ArraysAndStrings.isUniqueCharacters(a) == b
        chapter1ArraysAndStrings.isUniqueCharacters2(a) == b

        where:
        a                             || b
        null                          || false
        ""                            || false
        "abc"                         || true
        "aab"                         || false
        "qazwsxedcrfvtgbyhnujmikolp"  || true
        "qwertyuiopplkjhgfdsazxcvbnm" || false
    }

    def "Test - reverseString [Correct Values]"() {
        expect:
        chapter1ArraysAndStrings.reverseString(a as char[]) == b as char[]

        where:
        a            || b
        null         || null
        "bad"        || "dab"
        "1234567890" || "0987654321"
        "test"       || "tset"
    }

    @Ignore
    def "Test - removeDuplicates [Correct Values]"() {
        expect:
        chapter1ArraysAndStrings.removeDuplicates(a as char[]) == b as char[]

        where:
        a              || b
        "baaaaaaaaaad" || "bad"
//        "1123" || "123"
//        "abcc" || "abc"
    }

    def "Test - isAnagram [Correct Values]"() {
        expect:
        chapter1ArraysAndStrings.isAnagram(a, b) == c
        chapter1ArraysAndStrings.isAnagram2(a, b) == c

        where:
        a            || b            || c
        null         || "abc"        || false
        "abc"        || "abc"        || true
        "has"        || "ash"        || true
        "gas"        || "sag"        || true
        "Deductions" || "Discounted" || true
        "fall"       || "foul"       || false
    }

    def "Test - replaceSpace [Correct Values]"() {
        expect:
        chapter1ArraysAndStrings.replaceSpaces(a) == b
        chapter1ArraysAndStrings.replaceSpaces2(a) == b

        where:
        a      || b
        null   || null
        " "    || "%20"
        "abc"  || "abc"
        "a bc" || "a%20bc"
        "  "   || "%20%20"
    }

    def "Test - rotateImage [Correct Values]"() {
        expect:
        chapter1ArraysAndStrings.rotateImage(a as int[][]) == b as int[][]
        chapter1ArraysAndStrings.rotateImage2(a as int[][]) == b as int[][]

        where:
        a              || b
        null           || null
        [[1, 2, 3],
         [1, 2, 3],
         [1, 2, 3]]    || [[1, 1, 1],
                           [2, 2, 2],
                           [3, 3, 3]]
        [[1, 2, 3, 4],
         [5, 6, 7, 8],
         [9, 0, 1, 2],
         [3, 4, 5, 6]] || [[3, 9, 5, 1],
                           [4, 0, 6, 2],
                           [5, 1, 7, 3],
                           [6, 2, 8, 4]]
    }

    def "Test - markRows [Correct Values]"() {
        expect:
        chapter1ArraysAndStrings.markRows(a as int[][]) == b as int[][]

        where:
        a           || b
        null        || null
        [[5, 0, 5],
         [5, 5, 5],
         [5, 5, 5]] || [[0, 0, 0],
                        [5, 0, 5],
                        [5, 0, 5]]
        [[5, 5, 5],
         [5, 0, 5],
         [5, 5, 5]] || [[5, 0, 5],
                        [0, 0, 0],
                        [5, 0, 5]]

    }

    def "Test - isSubstring [Correct Values]"() {
        expect:
        chapter1ArraysAndStrings.isSubstring(a, b) == c

        where:
        a             || b             || c
        null          || null          || false
        "waterbottle" || "erbottlewat" || true
        "apple"       || "pleap"       || true
        "apple"       || "ppale"       || false
    }
}
