package leetcode

import spock.lang.Specification
import spock.lang.Unroll

final class Problem179LargestNumberSpec extends Specification {
    @Unroll def "largestNumber(#nums) = #answer"() {
        given:
        def sut = new Problem179LargestNumber()

        expect:
        sut.largestNumber(nums as int[]) == answer

        where:
        nums              || answer
        [10, 2]           || "210"
        [3, 30, 34, 5, 9] || "9534330"
    }
}
