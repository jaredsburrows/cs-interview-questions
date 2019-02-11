package leetcode

import spock.lang.Specification
import spock.lang.Unroll

final class Problem268MissingNumberSpec extends Specification {
    @Unroll def 'missingNumber(#nums) = #answer'() {
        given:
        def sut = new Problem268MissingNumber()

        expect:
        sut.missingNumber(nums as int[]) == answer

        where:
        nums                        || answer
        [3, 0, 1]                   || 2
        [9, 6, 4, 2, 3, 5, 7, 0, 1] || 8
    }
}
