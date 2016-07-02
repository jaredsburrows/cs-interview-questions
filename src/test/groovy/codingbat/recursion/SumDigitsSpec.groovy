package codingbat.recursion

import spock.lang.Specification

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
class SumDigitsSpec extends Specification {

    def "sumDigits"() {
        expect:
        SumDigits.sumDigits(a) == b

        where:
        a   | b
        126 | 9
        49  | 13
        12  | 3
    }
}
