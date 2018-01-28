package leetcode

import spock.lang.Specification
import spock.lang.Unroll

final class Problem238ProductOfArrayExceptSelfSpec extends Specification {
    @Unroll def "productExceptSelf"() {
        expect:
        Problem238ProductOfArrayExceptSelf.productExceptSelf(a as int[]) == b as int[]

        where:
        a    || b
        null || []
    }
}
