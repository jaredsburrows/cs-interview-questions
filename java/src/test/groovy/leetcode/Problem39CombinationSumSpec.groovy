package leetcode

import spock.lang.Specification
import spock.lang.Unroll

final class Problem39CombinationSumSpec extends Specification {
    @Unroll def "combinationSum(#candidates, #target) = #answer"() {
        given:
        def sut = new Problem39CombinationSum()

        expect:
        sut.combinationSum(candidates as int[], target) == answer

        where:
        candidates   | target || answer
        [2, 3, 6, 7] | 7      || [[2, 2, 3],
                                  [7]]
        [2, 3, 5]    | 8      || [[2, 2, 2, 2],
                                  [2, 3, 3],
                                  [3, 5]]
    }
}
