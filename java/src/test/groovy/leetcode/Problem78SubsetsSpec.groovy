package leetcode

import spock.lang.Specification
import spock.lang.Unroll

final class Problem78SubsetsSpec extends Specification {
    @Unroll
    def 'subsets(#nums) = #answer'() {
        given:
        def sut = new Problem78Subsets()

        expect:
        sut.subsets(nums as int[]).sort() == answer.sort()
        sut.subsetsRecursion(nums as int[]).sort() == answer.sort()

        where:
        nums      || answer
        [1, 2, 3] || [[], [1], [1, 2], [1, 2, 3], [1, 3], [2], [2, 3], [3]]
        [0]       || [[], [0]]
        [2, 3, 4] || [[], [2], [3], [2, 3], [4], [2, 4], [3, 4], [2, 3, 4]]
    }
}
