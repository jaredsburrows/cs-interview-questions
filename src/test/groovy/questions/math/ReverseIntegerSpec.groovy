package questions.math

import spock.lang.Specification

class ReverseIntegerSpec extends Specification {

    def "solution"() {
        given:
        ReverseNumber reverseNumber = new ReverseNumber()

        expect:
        reverseNumber.reverse(a) == b

        where:
        a     || b
        0     || 0
        1     || 1
        123   || 321
        -1409 || -9041
    }

}
