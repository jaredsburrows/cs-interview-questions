package crackingthecode.part4additionalreviewproblems

import api.Tuple
import test.BaseSpec

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
class Chapter19ModerateSpec extends BaseSpec {

    def "swapVar"() {
        given:
        def a = 1
        def b = 2

        when:
//        Chapter19Moderate.swapVar(a, b)
//        Chapter19Moderate.swapVar2(a, b)
        a ^= b
        b ^= a
        a ^= b

        then:
        a == 2
        b == 1
    }

    def "19.2 - checkTicTacToe"() {
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

    def "19.3 - numZeros"() {
        expect:
        Chapter19Moderate.numZeros(a) == b

        // 26! = 403291461126605635584000000
        where:
        a  | b
        -1 | 0
        10 | 2
        26 | 6
    }

    def "19.4 - getMax"() {
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

    def "getMin"() {
        expect:
        Chapter19Moderate.getMin(a as long, b as long) == c

        where:
        a   | b   | c
        -1  | -1  | -1     // same value
        10  | 0   | 0      // 0 value
        100 | 50  | 50
        213 | 321 | 213
    }

    def "19.5 - getPseudoHits"() {
        expect:
        Tuple<Integer, Integer> tuple = Chapter19Moderate.getPseudoHits("RGGB", "RGGB")
        tuple.getLeft() == 4
        tuple.getRight() == 0
        Tuple<Integer, Integer> tuple2 = Chapter19Moderate.getPseudoHits("RGGB", "YRGB")
        tuple2.getLeft() == 2
        tuple2.getRight() == 1
        Tuple<Integer, Integer> tuple3 = Chapter19Moderate.estimate("RGGB", "RGGB")
        tuple3.getLeft() == 4
        tuple3.getRight() == 0
//        Tuple<Integer, Integer> tuple4 = Chapter19Moderate.estimate("RGGB", "YRGB")
//        tuple4.getLeft() == 2
//        tuple4.getRight() == 1
    }

    def "19.7 - getMaxSum"() {
        expect:
        Chapter19Moderate.getMaxSum(a as int[]) == b

        where:
        a                               | b
        null                            | 0
        [2, -8, 3, -2, 4, -10]          | 5
        [-2, 1, -3, 4, -1, 2, 1, -5, 4] | 6
    }

    def "19.8 - getWordOccurence"() {
        expect:
        Chapter19Moderate.getWordOccurrence(a as String[], b) == c

        where:
        a                                                               | b      | c
        null                                                            | null   | -1
        null                                                            | "test" | -1
//        ["test"]                                                        | null   | -1
//        ["Against", "the", "entrance", "burns", "a", "salt", "ballet."] | "the"  | 1
//        ["the", "the", "the"]                                           | "the"  | 3
//        ["the", null, "the"]                                            | "the"  | 2
    }

    def "19.10 - rand7"() {
        expect:
        Chapter19Moderate.rand5() in 1..5
        Chapter19Moderate.rand7() in 1..7
        Chapter19Moderate.rand72() in 1..7
    }

    def "19.11 - getPairSum"() {
        expect:
        Chapter19Moderate.getPairSum(a as int[], b) == c as Map<Integer, Integer>

        where:
        a                  | b | c
        [1, 1]             | 2 | [1: 1]
        [1, 5, 3, 6, 3, 8] | 9 | [6: 3, 8: 1]
    }
}
