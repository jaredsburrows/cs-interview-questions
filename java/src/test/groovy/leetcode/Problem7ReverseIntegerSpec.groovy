package leetcode

import spock.lang.Specification
import spock.lang.Unroll

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
final class Problem7ReverseIntegerSpec extends Specification {
    @Unroll def "reverse"() {
        expect:
        Problem7ReverseInteger.reverse(a) == b

        where:
        a          || b
        0          || 0
        123        || 321
        -123       || -321
        1534236469 || 0
    }
}
