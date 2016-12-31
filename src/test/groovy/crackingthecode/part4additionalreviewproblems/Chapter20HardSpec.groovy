package crackingthecode.part4additionalreviewproblems

import spock.lang.Unroll
import test.BaseSpec

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
final class Chapter20HardSpec extends BaseSpec {

    @Unroll def "test 20.1 - addTwoNumbers"() {
        expect:
        Chapter20Hard.addTwoNumbers(a, b) == c

        where:
        a     | b      | c
        1     | 2      | 3
        -12   | 10     | -2
        14123 | 453115 | 467238
    }

    @Unroll def "test subtractTwoNumbers"() {
        expect:
        Chapter20Hard.substractTwoNumbers(a, b) == c

        where:
        a      | b     | c
        3      | 1     | 2
        -2     | -12   | 10
        467238 | 14123 | 453115
    }

    @Unroll def "test 20.4 - countNumber2s"() {
        expect:
        Chapter20Hard.countNumber2s(a) == b
        Chapter20Hard.count2sI(a) == b

        where:
        a  | b
        20 | 3
        35 | 14
    }

    @Unroll def "test 20.6 - getTopMillion"() {
        expect:
        Chapter20Hard.getTopMillion(a) == b

        where:
        a                              | b
        null                           | null
        [0]                            | null
        [1, 5, 2, 6, 4, 7, 3, 9, 3, 5] | [5, 5, 6, 7, 9]
    }

    @Unroll def "test 20.10 - getTransformedList"() {
        expect:
        Chapter20Hard.getTransformedList(a, b, c) == d

        where:
        a                        | b          | c          | d
        null                     | null       | null       | null
        null                     | "DAMP"     | null       | null
        null                     | null       | "DAMP"     | null
        null                     | "DAMP"     | "DAMP"     | null
        ["DAMP": "", "LIKE": ""] | null       | null       | null
        ["DAMP": "", "LIKE": ""] | "DAMP"     | null       | null
        ["DAMP": "", "LIKE": ""] | null       | "DAMP"     | null
        ["DAMP": "", "LIKE": ""] | "DAMP"     | "not here" | null
        ["DAMP": "", "LIKE": ""] | "not here" | "DAMP"     | null
//        ["DAMP": "", "LIKE": ""] | "DAMP"     | "LIKE"     | ["DAMP", "LAMP", "LIMP", "LIME", "LIKE"]
    }
}
