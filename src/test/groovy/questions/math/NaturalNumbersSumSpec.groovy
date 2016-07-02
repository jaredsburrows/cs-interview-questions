package questions.math

import test.BaseSpec

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
class NaturalNumbersSumSpec extends BaseSpec {

    def "getSumNaturalNumbers"() {
        expect:
        NaturalNumbersSum.getSumNaturalNumbers(a) == b
        NaturalNumbersSum.getSumNaturalNumbers2(a) == b

        where:
        a    | b
        10   | 55
        50   | 1275
        75   | 2850
        100  | 5050
        1000 | 500500
    }
}
