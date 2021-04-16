package leetcode

import spock.lang.Specification
import spock.lang.Unroll

final class Problem7ReverseIntegerSpec extends Specification {
    @Unroll def 'reverse(#x) == #answer'() {
        given:
        def sut = new Problem7ReverseInteger()

        expect:
        sut.reverse(x) == answer
        sut.reverse2(x) == answer

        where:
        x                 || answer
        0                 || 0
        123               || 321
        -123              || -321
        120               || 21
        1534236469        || 0
        Integer.MIN_VALUE || 0
        Integer.MAX_VALUE || 0
    }
}
