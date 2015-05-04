package questions.math

import spock.lang.Specification

class TrailingZerosSpec extends Specification {

    def "getTrailingZeros"() {
        given:
        TrailingZeros trailingZeros = new TrailingZeros()

        expect:
        trailingZeros.getTrailingZeros(a) == b

        where:
        a           || b
        0           || 0
        9           || 0 // none
        5           || 0 // none
        10          || 1
        10011013000 || 3
    }
}
