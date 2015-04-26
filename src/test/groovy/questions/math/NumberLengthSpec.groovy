package questions.math

import spock.lang.Specification

class NumberLengthSpec extends Specification {

    def "getIntegerLength"() {
        given:
        NumberLength numberLength = new NumberLength()

        expect:
        numberLength.getIntegerLength(a) == b
        numberLength.lenHelper(a) == b
        numberLength.getIntegerLogLength(a) == b

        where:
        a     || b
        5     || 1
        12    || 2
        105   || 3
        16293 || 5
    }

}
