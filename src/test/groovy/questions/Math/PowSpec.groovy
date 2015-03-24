package questions.Math

import questions.Math.Pow
import spock.lang.Specification

class PowSpec extends Specification {

    def "Test [Correct Values]"() {
        expect:
        Pow.pow(a, b) == c

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
