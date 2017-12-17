package questions.math

import spock.lang.Unroll
import test.BaseSpec

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
final class NumberLengthSpec extends BaseSpec {
    @Unroll def "test getIntegerLength"() {
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
