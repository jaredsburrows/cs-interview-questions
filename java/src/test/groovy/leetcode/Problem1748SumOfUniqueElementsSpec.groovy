package leetcode

import spock.lang.Specification
import spock.lang.Unroll

final class Problem1748SumOfUniqueElementsSpec extends Specification {
    @Unroll def 'sumOfUnique(#nums) = #answer'() {
        given:
        def sut = new Problem1748SumOfUniqueElements()

        expect:
        sut.sumOfUnique(nums as int[]) == answer
        sut.sumOfUnique2(nums as int[]) == answer

        where:
        nums            || answer
        [1, 2, 3, 2]    || 4
        [1, 1, 1, 1, 1] || 0
        [1, 2, 3, 4, 5] || 15
    }
}
