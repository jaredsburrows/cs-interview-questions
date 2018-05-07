package leetcode

import spock.lang.Specification
import spock.lang.Unroll

final class Problem80RemoveDuplicatesFromSortedArrayIISpec extends Specification {
    @Unroll def "removeDuplicates(#nums) = #answer"() {
        given:
        def sut = new Problem80RemoveDuplicatesFromSortedArrayII()

        expect:
        sut.removeDuplicates(nums as int[]) == answer

        where:
        nums                        || answer
        [1, 1, 1, 2, 2, 3]          || 5
        [0, 0, 1, 1, 1, 1, 2, 3, 3] || 7
    }
}
