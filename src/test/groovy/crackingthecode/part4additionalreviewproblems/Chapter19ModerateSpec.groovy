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
}
