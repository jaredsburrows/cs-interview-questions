package leetcode

import spock.lang.Specification
import spock.lang.Unroll

final class Problem1636SortArrayByIncreasingFrequencySpec extends Specification {
    @Unroll def 'frequencySort(#nums) = #answer'() {
        given:
        def sut = new Problem1636SortArrayByIncreasingFrequency()

        expect:
        sut.frequencySort(nums as int[]) == answer as int[]
        sut.frequencySort2(nums as int[]) == answer as int[]

        where:
        nums                           || answer
        [1, 1, 2, 2, 2, 3]             || [3, 1, 1, 2, 2, 2]
        [-1, 1, -6, 4, 5, -6, 1, 4, 1] || [5, -1, 4, 4, -6, -6, 1, 1, 1]
        [2, 3, 1, 3, 2]                || [1, 3, 3, 2, 2]
    }
}
