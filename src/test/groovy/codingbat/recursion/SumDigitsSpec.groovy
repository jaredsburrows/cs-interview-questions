package codingbat.recursion

import spock.lang.Unroll
import test.BaseSpec

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
final class SumDigitsSpec extends BaseSpec {

    @Unroll def "test sumDigits"() {
        expect:
        SumDigits.sumDigits(a) == b

        where:
        a   || b
        126 || 9
        49  || 13
        12  || 3
    }
}
