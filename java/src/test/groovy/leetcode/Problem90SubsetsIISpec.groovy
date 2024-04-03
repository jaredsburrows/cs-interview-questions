package leetcode

import spock.lang.Specification
import spock.lang.Unroll

final class Problem90SubsetsIISpec extends Specification {
    @Unroll
    def 'subsetsWithDup(#nums) = #answer'() {
        given:
        def sut = new Problem90SubsetsII()

        expect:
        sut.subsetsWithDup(nums as int[]).sort() == answer.sort()

        where:
        nums      || answer
        [1, 2, 2] || [[], [1], [1, 2], [1, 2, 2], [2], [2, 2]]
        [0]       || [[], [0]]
        [2, 3, 4] || [[], [2], [2, 3], [2, 3, 4], [2, 4], [3], [3, 4], [4]]
    }
}
