package questions.math

import questions.NaturalNumbersSum
import spock.lang.Unroll
import test.BaseSpec

final class NaturalNumbersSumSpec extends BaseSpec {
    @Unroll def "getSumNaturalNumbers(#a) == '#b'"() {
        expect:
        NaturalNumbersSum.getSumNaturalNumbers(a) == b
        NaturalNumbersSum.getSumNaturalNumbers2(a) == b

        where:
        a    || b
        5    || 15
        10   || 55
        15   || 120
        50   || 1275
        75   || 2850
        100  || 5050
        1000 || 500500
    }

    @Unroll def "getSumNaturalNumbersArray(#a) == '#b'"() {
        expect:
        NaturalNumbersSum.getSumNaturalNumbers(a as int[]) == b

        where:
        a                                                   || b
        [1, 2, 3, 4, 5]                                     || 15
        [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]                     || 55
        [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15] || 120
    }
}
