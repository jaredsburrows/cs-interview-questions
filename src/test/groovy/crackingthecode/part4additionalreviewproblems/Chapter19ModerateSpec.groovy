package crackingthecode.part4additionalreviewproblems

import spock.lang.Specification

class Chapter19ModerateSpec extends Specification {

    def "swapVar"() {
        given:
        def a = 1
        def b = 2

        when:
//        Chapter19Moderate.swapVar(a, b)
//        Chapter19Moderate.swapVar2(a, b)
        a ^= b;
        b ^= a;
        a ^= b;

        then:
        a == 2
        b == 1
    }

    def "checkTicTacToe"() {
        expect:
        Chapter19Moderate.checkTicTacToe(a as int[][]) == b

        where:
        a           || b
        null        || -1
        [[0, 1, 0],
         [0, 1, 0],
         [0, 1, 0]] || 1
        [[0, 0, 0],
         [2, 2, 2],
         [0, 0, 0]] || 2
        [[0, 0, 1],
         [0, 1, 0],
         [1, 0, 0]] || 1
        [[2, 0, 0],
         [0, 2, 0],
         [0, 0, 2]] || 2
    }

    def "getTrailingZeros"() {
        expect:
        Chapter19Moderate.numZeros(a) == b

        // 26! = 403291461126605635584000000
        where:
        a || b
//        9   || 0 // none
//        5   || 0 // none
        10 || 2
        26 || 6
    }

    def "getMax"() {
        expect:
        Chapter19Moderate.getMax(a as long, b as long) == c
        Chapter19Moderate.getMax2(a as long, b as long) == c

        where:
        a   | b   || c
        -1  | -1  || -1     // same value
        10  | 0   || 10     // 0 value
        100 | 50  || 100
        213 | 321 || 321
    }

    def "getMin"() {
        expect:
        Chapter19Moderate.getMin(a as long, b as long) == c

        where:
        a   | b   || c
        -1  | -1  || -1     // same value
        10  | 0   || 0      // 0 value
        100 | 50  || 50
        213 | 321 || 213
    }

    def "getMaxSum"() {
        expect:
        Chapter19Moderate.getMaxSum(a as int[]) == b

        where:
        a                      || b
        null                   || 0
        [2, -8, 3, -2, 4, -10] || 5


    }
}
