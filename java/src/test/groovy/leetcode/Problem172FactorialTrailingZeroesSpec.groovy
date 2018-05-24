package leetcode

import spock.lang.Specification
import spock.lang.Unroll

final class Problem172FactorialTrailingZeroesSpec extends Specification {
    @Unroll def "trailingZeroes(#a) = #answer"() {
        given:
        def sut = new Problem172FactorialTrailingZeroes()

        expect:
        sut.trailingZeroes(a) == answer

        where:
        a      || answer
        0      || 0
        123000 || 30747
        3      || 0
        5      || 1
    }
}
