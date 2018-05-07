package leetcode

import spock.lang.Specification
import spock.lang.Unroll

final class Problem26RemoveDuplicatesFromSortedArraySpec extends Specification {
    @Unroll def "removeDuplicates(#nums) = #answer"() {
        given:
        def sut = new Problem26RemoveDuplicatesFromSortedArray()

        expect:
        sut.removeDuplicates(nums as int[]) == answer
        sut.removeDuplicates2(nums as int[]) == answer

        where:
        nums                           || answer
        [1, 1, 2]                      || 2
        [0, 0, 1, 1, 1, 2, 2, 3, 3, 4] || 5
    }

    @Unroll def "removeDuplicates2(#nums) = #answer"() {
        given:
        def sut = new Problem26RemoveDuplicatesFromSortedArray()

        expect:
        sut.removeDuplicates2(nums as int[]) == answer

        where:
        nums                           || answer
        [1, 1, 2]                      || 2
        [0, 0, 1, 1, 1, 2, 2, 3, 3, 4] || 5
    }
}
