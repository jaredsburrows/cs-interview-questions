package leetcode

import spock.lang.Specification
import spock.lang.Unroll

final class Problem1431KidsWithTheGreatestNumberOfCandiesSpec extends Specification {
    @Unroll
    def 'kidsWithCandies(#candies, #extraCandies) = #answer'() {
        given:
        def sut = new Problem1431KidsWithTheGreatestNumberOfCandies()

        expect:
        sut.kidsWithCandies(candies as int[], extraCandies) == answer
        sut.kidsWithCandies2(candies as int[], extraCandies) == answer

        where:
        candies         | extraCandies || answer
        [2, 3, 5, 1, 3] | 3            || [true, true, true, false, true]
        [4, 2, 1, 1, 2] | 1            || [true, false, false, false, false]
        [12, 1, 12]     | 10           || [true, false, true]
    }
}
