package leetcode

import spock.lang.Specification
import spock.lang.Unroll

final class Problem769MaxChunksToMakeSortedSpec extends Specification {
    @Unroll def "maxChunksToSorted(#arr) = #answer"() {
        given:
        def sut = new Problem769MaxChunksToMakeSorted()

        expect:
        sut.maxChunksToSorted(arr as int[]) == answer

        where:
        arr             || answer
        [4, 3, 2, 1, 0] || 1
        [1, 0, 2, 3, 4] || 4
    }
}
