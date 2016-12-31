package crackingthecode.part4additionalreviewproblems

import api.Tuple
import spock.lang.Unroll
import test.BaseSpec

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
final class Chapter19ModerateSpec extends BaseSpec {

    def "test swapVar"() {
        given:
        def a = 1
        def b = 2

        when:
//        Chapter19Moderate.swapVar(a, b)
        Chapter19Moderate.swapVar2(a, b)
        a ^= b
        b ^= a
        a ^= b

        then:
        a == 2
        b == 1
    }

    @Unroll def "test 19.2 - checkTicTacToe"() {
        expect:
        Chapter19Moderate.checkTicTacToe(a as int[][]) == b

        where:
        a           | b
        null        | -1
        [[0, 0, 0],
         [0, 1, 0],
         [0, 1, 0]] | -1
        [[0, 1, 0],
         [0, 1, 0],
         [0, 1, 0]] | 1
        [[0, 0, 0],
         [2, 2, 2],
         [0, 0, 0]] | 2
        [[0, 0, 1],
         [0, 1, 0],
         [1, 0, 0]] | 1
        [[2, 0, 0],
         [0, 2, 0],
         [0, 0, 2]] | 2
    }

    @Unroll def "test 19.3 - numZeros"() {
        expect:
        Chapter19Moderate.numZeros(a) == b

        // 26! = 403291461126605635584000000
        where:
        a  | b
        -1 | 0
        10 | 2
        26 | 6
    }

    @Unroll def "test 19.4 - getMax"() {
        expect:
        Chapter19Moderate.getMax(a as long, b as long) == c
        Chapter19Moderate.getMax2(a as long, b as long) == c

        where:
        a   | b   | c
        -1  | -1  | -1     // same value
        10  | 0   | 10     // 0 value
        100 | 50  | 100
        213 | 321 | 321
    }

    @Unroll def "test getMin"() {
        expect:
        Chapter19Moderate.getMin(a as long, b as long) == c

        where:
        a   | b   | c
        -1  | -1  | -1     // same value
        10  | 0   | 0      // 0 value
        100 | 50  | 50
        213 | 321 | 213
    }

    @Unroll def "test 19.5 - getPseudoHits"() {
        expect:
        Chapter19Moderate.getPseudoHits(a, b) == c

        where:
        a      | b      | c
        null   | null   | null
        "RGGB" | null   | null
        null   | "RGGB" | null
        "123"  | "1324" | null
        "RGGB" | "RGGB" | new Tuple<>(4, 0)
        "RGGB" | "YRGB" | new Tuple<>(2, 1)
    }

    @Unroll def "test 19.7 - getMaxSum"() {
        expect:
        Chapter19Moderate.getMaxSum(a as int[]) == b

        where:
        a                               | b
        null                            | 0
        [2, -8, 3, -2, 4, -10]          | 5
        [-2, 1, -3, 4, -1, 2, 1, -5, 4] | 6
    }

    @Unroll def "test 19.8 - getWordOccurrence"() {
        expect:
        Chapter19Moderate.getWordOccurrence(a as String[], b) == c

        where:
        a                     | b      | c
        null                  | null   | -1
        null                  | "test" | -1
        ["test"]              | null   | -1
        ["the", "the", "the"] | "the"  | 3
        ["the", null, "the"]  | "the"  | 2
        ["the", null, "the"]  | "hat"  | 0
        ["the", null, "the"]  | "hat"  | 0
        ["the", "", "the"]  | "hat"  | 0
    }

    def "test 19.10 - rand7"() {
        expect:
        Chapter19Moderate.rand5() in 1..5
        Chapter19Moderate.rand7() in 1..7
        Chapter19Moderate.rand72() in 1..7
    }

    @Unroll def "test 19.11 - getPairSum"() {
        expect:
        Chapter19Moderate.getPairSum(a as int[], b) == c as Map<Integer, Integer>

        where:
        a                  | b | c
        [1, 1]             | 2 | [1: 1]
        [1, 5, 3, 6, 3, 8] | 9 | [6: 3, 8: 1]
    }
}
