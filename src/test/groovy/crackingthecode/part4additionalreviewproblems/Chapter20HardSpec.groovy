package crackingthecode.part4additionalreviewproblems

import spock.lang.Ignore
import spock.lang.Specification

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
class Chapter20HardSpec extends Specification {

    def "20.1 - addTwoNumbers"() {
        expect:
        Chapter20Hard.addTwoNumbers(a, b) == c

        where:
        a     || b      || c
        1     || 2      || 3
        -12   || 10     || -2
        14123 || 453115 || 467238
    }

    def "subtractTwoNumbers"() {
        expect:
        Chapter20Hard.substractTwoNumbers(a, b) == c

        where:
        a      || b     || c
        3      || 1     || 2
        -2     || -12   || 10
        467238 || 14123 || 453115
    }

    def "20.4 - countNumber2s"() {
        expect:
        Chapter20Hard.countNumber2s(a) == b
        Chapter20Hard.count2sI(a) == b

        where:
        a  || b
        20 || 3
        35 || 14
    }

    def "20.6 - getTopMillion"() {
        expect:
        Chapter20Hard.getTopMillion(a) == b

        where:
        a                              || b
        null                           || null
        [0]                            || null
        [1, 5, 2, 6, 4, 7, 3, 9, 3, 5] || [5, 5, 6, 7, 9]
    }

    @Ignore
    def "20.10 - getTransformedList"() {
        expect:
        Chapter20Hard.getTransformedList(a as Map<Integer, String>, b, c) == d

        where:
        a                                                       || b      || c      || d
        null                                                    || null   || null   || null
        [0: "DAMP"]                                             || null   || null   || null
        [0: "DAMP"]                                             || "DAMP" || null   || null
        [0: "DAMP"]                                             || "DAMP" || "LAMP" || null
        null                                                    || "DAMP" || "LAMP" || null
        null                                                    || null   || "LAMP" || null
        [0: "DAMP"]                                             || "TEST" || "DAMP" || null
        [0: "DAMP"]                                             || "DAMP" || "TEST" || null
        [0: "DAMP", 1: "LAMP", 2: "LIMP", 3: "LIME", 4: "LIKE"] || "DAMP" || "LIKE" ||
                ["DAMP", "LAMP", "LIMP", "LIME", "LIKE"]
    }
}
