package codingbat.recursion

import test.BaseSpec

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
class SumDigitsSpec extends BaseSpec {

    def "test sumDigits"() {
        expect:
        SumDigits.sumDigits(a) == b

        where:
        a   | b
        126 | 9
        49  | 13
        12  | 3
    }
}
