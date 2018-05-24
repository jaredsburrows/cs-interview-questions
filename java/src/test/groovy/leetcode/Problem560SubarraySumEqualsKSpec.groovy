package leetcode

import spock.lang.Specification
import spock.lang.Unroll

final class Problem560SubarraySumEqualsKSpec extends Specification {
    @Unroll def "subarraySum(#nums, #k) = #answer"() {
        given:
        def sut = new Problem560SubarraySumEqualsK()

        expect:
        sut.subarraySum(nums as int[], k) == answer

        where:
        nums      | k || answer
        [1, 1, 1] | 2 || 2
    }
}
