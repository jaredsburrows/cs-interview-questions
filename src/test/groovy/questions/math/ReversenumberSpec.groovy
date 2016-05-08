package questions.math

import spock.lang.Specification

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
class ReverseNumberSpec extends Specification {

    def "constructor"() {
        expect:
        new ReverseNumber() != null
    }

    def "solution"() {
        expect:
        ReverseNumber.reverse(a) == b

        where:
        a     || b
        0     || 0
        1     || 1
        123   || 321
        -1409 || -9041
    }
}
