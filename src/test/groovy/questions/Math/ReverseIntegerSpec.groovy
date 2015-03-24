package questions.Math

import questions.Math.ReverseNumber
import spock.lang.Specification

class ReverseIntegerSpec extends Specification {

    def "Test [Correct Values]"() {
        expect:
        ReverseNumber.solution(a) == b

        where:
        a     || b
        0     || 0
        1     || 1
        123   || 321
        -1409 || -9041
    }

}
