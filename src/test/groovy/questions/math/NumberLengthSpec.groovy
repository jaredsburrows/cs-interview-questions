package questions.math

import spock.lang.Specification

class NumberLengthSpec extends Specification {

    def "getIntegerLength"() {
        expect:
        NumberLength.getIntegerLength(a) == b
        NumberLength.lenHelper(a) == b
        NumberLength.getIntegerLogLength(a) == b

        where:
        a     || b
        5     || 1
        12    || 2
        105   || 3
        16293 || 5
    }

}
