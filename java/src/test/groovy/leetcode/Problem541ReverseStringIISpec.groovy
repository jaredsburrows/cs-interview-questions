package leetcode

import spock.lang.Specification
import spock.lang.Unroll

final class Problem541ReverseStringIISpec extends Specification {
    @Unroll def "reverseStr"() {
        given:
        def sut = new Problem541ReverseStringII()

        expect:
        sut.reverseStr(a, b) == c

        where:
        a         | b || c
        null      | 0 || ""
        "abcdefg" | 2 || "bacdfeg"
        "abcdef"  | 2 || "bacdfe"
        "abcdef"  | 3 || "cbadef"
        //        "abcdefg" | 8 || "cbadef"
    }
}
