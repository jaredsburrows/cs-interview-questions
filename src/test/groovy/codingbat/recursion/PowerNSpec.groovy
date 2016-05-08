package codingbat.recursion

import spock.lang.Specification

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
class PowerNSpec extends Specification {

    def "PowerN"() {
        expect:
        PowerN.powerN(a, b) == c

        where:
        a | b || c
        3 | 1 || 3
        3 | 2 || 9
        3 | 3 || 27
    }
}
