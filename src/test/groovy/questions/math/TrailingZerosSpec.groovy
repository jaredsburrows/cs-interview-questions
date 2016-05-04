package questions.math

import spock.lang.Specification

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
class TrailingZerosSpec extends Specification {

    def "getTrailingZeros"() {
        expect:
        TrailingZeros.getTrailingZeros(a) == b

        where:
        a           || b
        0           || 0
        9           || 0 // none
        5           || 0 // none
        10          || 1
        10011013000 || 3
    }
}
