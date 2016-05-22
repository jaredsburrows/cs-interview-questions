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

    def "reverseLong"() {
        expect:
        ReverseNumber.reverseLong(a) == b

        where:
        a          || b
        0          || 0
        1          || 1
        123        || 321
        -1409      || -9041
        1534236469 || 9646324351
    }

    def "reverseInt"() {
        expect:
        ReverseNumber.reverseInt(a) == b

        where:
        a          || b
        0          || 0
        1          || 1
        123        || 321
        -1409      || -9041
        1534236469 || 0
    }
}
