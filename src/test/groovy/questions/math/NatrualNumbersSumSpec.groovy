package questions.math

import spock.lang.Specification

class NatrualNumbersSumSpec extends Specification {

    def "getSumNaturalNumbers"() {
        given:
        NaturalNumbersSum naturalNumbersSum = new NaturalNumbersSum()

        expect:
        naturalNumbersSum.getSumNaturalNumbers(a) == b
        naturalNumbersSum.getSumNaturalNumbers2(a) == b

        where:
        a    || b
        10   || 55
        50   || 1275
        75   || 2850
        100  || 5050
        1000 || 500500
    }
}
