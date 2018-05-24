package leetcode

import spock.lang.Specification
import spock.lang.Unroll

final class Problem20ValidParenthesesSpec extends Specification {
    @Unroll def "isValid(#s) = #answer"() {
        given:
        def sut = new Problem20ValidParentheses()

        expect:
        sut.isValid(s) == answer

        where:
        s        || answer
        "()"     || true
        "()[]{}" || true
        "(]"     || false
        "([)]"   || false
        "{[]}"   || true
    }
}
