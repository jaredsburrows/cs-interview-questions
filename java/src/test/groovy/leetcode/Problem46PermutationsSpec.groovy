package leetcode

import spock.lang.Specification
import spock.lang.Unroll

final class Problem46PermutationsSpec extends Specification {
    @Unroll def 'permute(#nums) = #answer'() {
        given:
        def sut = new Problem46Permutations()

        expect:
        sut.permute(nums as int[]) == answer

        where:
        nums      || answer
        [1, 2]    || [[1, 2],
                      [2, 1]]
        [1, 2, 3] || [[1, 2, 3],
                      [1, 3, 2],
                      [2, 1, 3],
                      [2, 3, 1],
                      [3, 1, 2],
                      [3, 2, 1]]
    }
}
