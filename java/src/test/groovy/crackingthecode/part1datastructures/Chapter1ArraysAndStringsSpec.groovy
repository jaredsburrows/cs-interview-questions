package crackingthecode.part1datastructures

import spock.lang.Shared
import spock.lang.Unroll
import test.BaseSpec

@SuppressWarnings("GroovyPointlessBoolean")
final class Chapter1ArraysAndStringsSpec extends BaseSpec {
    @Shared def sut

    def "setup"() {
        sut = new Chapter1ArraysAndStrings()
    }

    @Unroll def "isUniqueCharacters(#a) == '#b'"() {
        expect:
        sut.isUniqueCharacters(a) == b
        sut.isUniqueCharacters2(a) == b

        where:
        a                             || b
        null                          || false
        ""                            || false
        "abc"                         || true
        "aab"                         || false
        "qazwsxedcrfvtgbyhnujmikolp"  || true
        "qwertyuiopplkjhgfdsazxcvbnm" || false
    }

    @Unroll def "reverseString(#a) == '#b'"() {
        expect:
        sut.reverseString(a as char[]) == b as char[]

        where:
        a            || b
        null         || ""
        ""           || ""
        "bad"        || "dab"
        "1234567890" || "0987654321"
        "test"       || "tset"
    }

    @Unroll def "removeDuplicates(#a) == '#b'"() {
        expect:
        sut.removeDuplicates(a) == b

        where:
        a              || b
        null           || ""
        ""             || ""
        "baaaaaaaaaad" || "bad"
        "1123"         || "123"
        "abcc"         || "abc"
    }

    @Unroll def "isAnagram(#a) == '#b'"() {
        expect:
        sut.isAnagram(a, b) == c
        sut.isAnagram2(a, b) == c

        where:
        a            | b            || c
        null         | "abc"        || false
        "abx"        | null         || false
        "a"          | "a"          || false
        "abc"        | "ababc"      || false
        "abc"        | "abc"        || true
        "has"        | "ash"        || true
        "gas"        | "sag"        || true
        "Deductions" | "Discounted" || true
        "fall"       | "foul"       || false
    }

    @Unroll def "replaceSpace(#a) == '#b'"() {
        expect:
        sut.replaceSpaces(a) == b
        sut.replaceSpaces2(a) == b

        where:
        a      || b
        null   || ""
        " "    || "%20"
        "abc"  || "abc"
        "a bc" || "a%20bc"
        "  "   || "%20%20"
    }

    @Unroll def "rotateImage(#a) == '#b'"() {
        expect:
        sut.rotateImage(a as int[][]) == b as int[][]
        sut.rotateImage2(a as int[][]) == b as int[][]

        where:
        a              || b
        null           || []
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

    @Unroll def "markRows(#a) == '#b'"() {
        expect:
        sut.markRows(a as int[][]) == b as int[][]

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

    @Unroll def "isSubstring(#a, #b) == '#c'"() {
        expect:
        sut.isSubstring(a, b) == c

        where:
        a             | b             || c
        null          | null          || false
        null          | "asdf"        || false
        "asdfs"       | null          || false
        "abc"         | "abdefd"      || false
        "waterbottle" | "erbottlewat" || true
        "apple"       | "pleap"       || true
        "apple"       | "ppale"       || false
    }
}
