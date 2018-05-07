package leetcode

import spock.lang.Ignore
import spock.lang.Specification
import spock.lang.Unroll

final class Problem189RotateArraySpec extends Specification {
    @Ignore
    @Unroll def "rotate(#nums, #k) = #answer"() {
        given:
        def sut = new Problem189RotateArray()

        expect:
        sut.rotate(nums as int[], k) == answer

        where:
        nums                  | k || answer
        [1, 2, 3, 4, 5, 6, 7] | 3 || [5, 6, 7, 1, 2, 3, 4]
        [-1, -100, 3, 99]     | 2 || [3, 99, -1, -100]
    }
}
