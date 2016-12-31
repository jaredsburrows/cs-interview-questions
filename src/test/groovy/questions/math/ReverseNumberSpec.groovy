package questions.math

import spock.lang.Unroll
import test.BaseSpec

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
final class ReverseNumberSpec extends BaseSpec {

    @Unroll def "test reverseLong"() {
        expect:
        ReverseNumber.reverseLong(a) == b

        where:
        a          | b
        0          | 0
        1          | 1
        123        | 321
        -1409      | -9041
        1534236469 | 9646324351
    }

    @Unroll def "test reverseInt"() {
        expect:
        ReverseNumber.reverseInt(a) == b

        where:
        a          | b
        0          | 0
        1          | 1
        123        | 321
        -1409      | -9041
        1534236469 | 0
    }
}
