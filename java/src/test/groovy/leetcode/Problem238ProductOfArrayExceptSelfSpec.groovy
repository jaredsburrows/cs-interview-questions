package leetcode

import spock.lang.Specification
import spock.lang.Unroll

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
final class Problem238ProductOfArrayExceptSelfSpec extends Specification {
    @Unroll def "testProductExceptSelf"() {
        expect:
        Problem238ProductOfArrayExceptSelf.productExceptSelf(a as int[]) == b as int[]

        where:
        a    || b
        null || []
    }
}
