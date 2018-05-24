package leetcode

import spock.lang.Specification
import spock.lang.Unroll

final class Problem371SumOfTwoIntegersSpec extends Specification {
    @Unroll def "getSum(#a, #b) = #answer"() {
        given:
        def sut = new Problem371SumOfTwoIntegers()

        expect:
        sut.getSum(a, b) == answer

        where:
        a  | b  || answer
        1  | 2  || 3
        0  | 0  || 0
        1  | 2  || 3
        15 | 32 || 47
    }
}
