package leetcode

import spock.lang.Specification
import spock.lang.Unroll

final class Problem724FindPivotIndexSpec extends Specification {
    @Unroll def "pivotIndex(#nums) = #answer"() {
        given:
        def sut = new Problem724FindPivotIndex()

        expect:
        sut.pivotIndex(nums as int[]) == answer

        where:
        nums               || answer
        [1, 7, 3, 6, 5, 6] || 3
        [1, 2, 3]          || -1
    }
}
