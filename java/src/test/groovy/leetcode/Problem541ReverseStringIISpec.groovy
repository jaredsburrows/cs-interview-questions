package leetcode

import spock.lang.Specification
import spock.lang.Unroll

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
final class Problem541ReverseStringIISpec extends Specification {
    @Unroll def "testReverseStr"() {
        expect:
        Problem541ReverseStringII.reverseStr(a, b) == c

        where:
        a         | b || c
        null      | 0 || null
        "abcdefg" | 2 || "bacdfeg"
        "abcdef"  | 2 || "bacdfe"
        "abcdef"  | 3 || "cbadef"
        //        "abcdefg" | 8 || "cbadef"
    }
}
