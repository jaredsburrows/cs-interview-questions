package leetcode

import spock.lang.Specification
import spock.lang.Unroll

final class Problem485MaxConsecutiveOnesSpec extends Specification {
    @Unroll def "findMaxConsecutiveOnes(#nums) = #answer"() {
        given:
        def sut = new Problem485MaxConsecutiveOnes()

        expect:
        sut.findMaxConsecutiveOnes(nums as int[]) == answer

        where:
        nums               || answer
        null               || 0
        [1, 1, 0, 1, 1, 1] || 3
        [1, 0, 1, 1, 0, 1] || 2
    }
}
