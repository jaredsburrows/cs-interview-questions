package questions.math

import spock.lang.Specification

class PowSpec extends Specification {

    def "pow"() {
        given:
        Pow pow = new Pow()

        expect:
        pow.pow(a, b) == c

        where:
        a  || b  || c
        -2 || 2  || 4
        -1 || 5  || -1
        -1 || -1 || 0
        0  || 0  || 0
        1  || 1  || 1
        2  || 1  || 2
        2  || 2  || 4
    }
}
