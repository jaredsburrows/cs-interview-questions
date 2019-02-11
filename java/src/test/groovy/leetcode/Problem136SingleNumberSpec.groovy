package leetcode

import spock.lang.Specification
import spock.lang.Unroll

final class Problem136SingleNumberSpec extends Specification {
    @Unroll def 'singleNumber(#nums) = #answer'() {
        given:
        def sut = new Problem136SingleNumber()

        expect:
        sut.singleNumber(nums as int[]) == answer

        where:
        nums                        || answer
        null                        || 0
        [1, 1, 2, 2, 3, 4, 4, 5, 5] || 3
        [2, 2, 1]                   || 1
        [4, 1, 2, 1, 2]             || 4
    }
}
