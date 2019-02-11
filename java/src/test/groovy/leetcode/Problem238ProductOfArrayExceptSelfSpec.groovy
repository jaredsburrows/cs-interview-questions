package leetcode

import spock.lang.Ignore
import spock.lang.Specification
import spock.lang.Unroll

final class Problem238ProductOfArrayExceptSelfSpec extends Specification {
    @Ignore
    @Unroll def 'productExceptSelf(#nums) = #answer'() {
        given:
        def sut = new Problem238ProductOfArrayExceptSelf()

        expect:
        sut.productExceptSelf(nums as int[]) == answer as int[]

        where:
        nums         || answer
        null         || []
        [1, 2, 3, 4] || [24, 12, 8, 6]
    }
}
