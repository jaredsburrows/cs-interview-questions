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
        a          || b
        1          || 1
        12         || 2
        123        || 3
        1234       || 4
        12345      || 5
        123456     || 6
        1234567    || 7
        12345678   || 8
        123456789  || 9
        1234567890 || 10
    }
}
