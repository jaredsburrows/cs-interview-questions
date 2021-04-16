package leetcode

import spock.lang.Specification
import spock.lang.Unroll

final class Problem414ThirdMaximumNumberSpec extends Specification {
    @Unroll def 'thirdMax(#nums) = #answer'() {
        given:
        def sut = new Problem414ThirdMaximumNumber()

        expect:
        sut.thirdMax(nums as int[]) == answer

        where:
        nums         || answer
        [3, 2, 1]    || 1
        [1, 2]       || 2
        [2, 2, 3, 1] || 1
    }
}
