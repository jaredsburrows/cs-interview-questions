package leetcode

import spock.lang.Specification
import spock.lang.Unroll

final class Problem347TopKFrequentElementsSpec extends Specification {
    @Unroll def 'topKFrequent(#nums, #k) = #answer'() {
        given:
        def sut = new Problem347TopKFrequentElements()

        expect:
        sut.topKFrequent(nums as int[], k) == answer

        where:
        nums               | k || answer
        [1, 1, 1, 2, 2, 3] | 2 || [1, 2]
    }
}
