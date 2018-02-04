package leetcode

import spock.lang.Specification
import spock.lang.Unroll

final class Problem371SumOfTwoIntegersSpec extends Specification {
    @Unroll def "getSum"() {
        given:
        def sut = new Problem371SumOfTwoIntegers()

        expect:
        sut.getSum(a, b) == c

        where:
        a  | b  || c
        0  | 0  || 0
        1  | 2  || 3
        15 | 32 || 47
    }
}
