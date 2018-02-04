package leetcode

import spock.lang.Specification
import spock.lang.Unroll

final class Problem7ReverseIntegerSpec extends Specification {
    @Unroll def "reverse"() {
        given:
        def sut = new Problem7ReverseInteger()

        expect:
        sut.reverse(a) == b

        where:
        a          || b
        0          || 0
        123        || 321
        -123       || -321
        1534236469 || 0
    }
}
