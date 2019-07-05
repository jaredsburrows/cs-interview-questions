package leetcode

import spock.lang.Specification
import spock.lang.Unroll

final class Problem56MergeIntervalsSpec extends Specification {
    @Unroll def 'merge(#intervals) = #answer'() {
        given:
        def sut = new Problem56MergeIntervals()

        expect:
        sut.merge(intervals as int[][]) == answer as int[][]

        where:
        intervals                           || answer
        [[1, 3], [2, 6], [8, 10], [15, 18]] || [[1, 6], [8, 10], [15, 18]]
        [[1, 4], [4, 5]]                    || [[1, 5]]
    }
}
