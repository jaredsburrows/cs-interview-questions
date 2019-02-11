package leetcode

import spock.lang.Specification
import spock.lang.Unroll

final class Problem78SubsetsSpec extends Specification {
    @Unroll def 'subsets(#nums) = #answer'() {
        given:
        def sut = new Problem78Subsets()

        expect:
        sut.subsets(nums as int[]) == answer

        where:
        nums      || answer
        [1, 2, 3] || [[],
                      [1],
                      [1, 2],
                      [1, 2, 3],
                      [1, 3],
                      [2],
                      [2, 3],
                      [3]]
    }
}
