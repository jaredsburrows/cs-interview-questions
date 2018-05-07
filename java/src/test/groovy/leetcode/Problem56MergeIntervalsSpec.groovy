package leetcode

import leetcode.api.Interval
import spock.lang.Specification
import spock.lang.Unroll

final class Problem56MergeIntervalsSpec extends Specification {
    @Unroll def "merge(#intervals) = #answer"() {
        given:
        def sut = new Problem56MergeIntervals()

        expect:
        sut.merge(intervals as List<Interval>) == answer

        where:
        intervals              || answer
        [new Interval(1, 3),
         new Interval(2, 6),
         new Interval(8, 10),
         new Interval(15, 18)] || [new Interval(1, 6),
                                   new Interval(8, 10),
                                   new Interval(15, 18)]
        [new Interval(1, 4),
         new Interval(4, 5)]   || [new Interval(1, 5)]
    }
}
