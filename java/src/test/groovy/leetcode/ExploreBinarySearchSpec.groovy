package leetcode

import spock.lang.Specification
import spock.lang.Unroll

final class ExploreBinarySearchSpec extends Specification {
    @Unroll def "search(#nums, #target) = #answer"() {
        given:
        def sut = new ExploreBinarySearch()

        expect:
        sut.search(nums as int[], target) == answer

        where:
        nums                 | target || answer
        [-1, 0, 3, 5, 9, 12] | 9      || 4
        [-1, 0, 3, 5, 9, 12] | 2      || -1
    }
}
