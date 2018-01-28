package questions.math

import questions.ReverseNumber
import spock.lang.Unroll
import test.BaseSpec

final class ReverseNumberSpec extends BaseSpec {
    @Unroll def "reverseLong(#a) == '#b'"() {
        expect:
        ReverseNumber.reverseLong(a) == b

        where:
        a          || b
        0          || 0
        1          || 1
        123        || 321
        -1409      || -9041
        1534236469 || 9646324351
    }

    @Unroll def "reverseInt(#a) == '#b'"() {
        expect:
        ReverseNumber.reverseInt(a) == b

        where:
        a          || b
        0          || 0
        1          || 1
        123        || 321
        -1409      || -9041
        1534236469 || 0
    }
}
