package questions.math

import questions.TrailingZeros
import spock.lang.Unroll
import test.BaseSpec

final class TrailingZerosSpec extends BaseSpec {
    @Unroll def "getTrailingZeros(#a) == '#b'"() {
        expect:
        TrailingZeros.getTrailingZeros(a) == b

        where:
        a           || b
        0           || 0
        9           || 0 // none
        5           || 0 // none
        10          || 1
        10011013000 || 3
    }
}
