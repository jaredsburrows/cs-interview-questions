package questions.math

import questions.NumberLength
import spock.lang.Specification
import spock.lang.Unroll

final class NumberLengthSpec extends Specification {
    @Unroll def 'getIntegerLength(#a) == #b'() {
        expect:
        NumberLength.getIntegerLength(a) == b
        NumberLength.lenHelper(a) == b
        NumberLength.getIntegerLogLength(a) == b

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
