package leetcode

import spock.lang.Specification
import spock.lang.Unroll

final class Problem153SumSpec extends Specification {
    @Unroll def 'threeSum(#nums) = #answer'() {
        given:
        def sut = new Problem153Sum()

        expect:
        sut.threeSum(nums as int[]) == answer

        where:
        nums                  || answer
        [-1, 0, 1, 2, -1, -4] || [[-1, -1, 2],
                                  [-1, 0, 1]]
    }
}
