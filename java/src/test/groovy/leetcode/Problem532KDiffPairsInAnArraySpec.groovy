package leetcode

import spock.lang.Specification
import spock.lang.Unroll

final class Problem532KDiffPairsInAnArraySpec extends Specification {
    @Unroll def 'findPairs(#nums, #k) = #answer'() {
        given:
        def sut = new Problem532KDiffPairsInAnArray()

        expect:
        sut.findPairs(nums as int[], k) == answer

        where:
        nums            | k || answer
        [3, 1, 4, 1, 5] | 2 || 2
        [1, 2, 3, 4, 5] | 1 || 4
        [1, 3, 1, 5, 4] | 0 || 1
    }
}
