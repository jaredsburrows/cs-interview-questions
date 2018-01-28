package codingbat.recursion

import spock.lang.Unroll
import test.BaseSpec

final class SumDigitsSpec extends BaseSpec {
    @Unroll def "sumDigits(#a) == '#b'"() {
        expect:
        SumDigits.sumDigits(a) == b

        where:
        a   || b
        126 || 9
        49  || 13
        12  || 3
    }
}
