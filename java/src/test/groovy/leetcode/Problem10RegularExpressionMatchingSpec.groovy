package leetcode

import spock.lang.Specification
import spock.lang.Unroll

final class Problem10RegularExpressionMatchingSpec extends Specification {
    @Unroll def 'isMatch(#s, #p) = #answer'() {
        given:
        def sut = new Problem10RegularExpressionMatching()

        expect:
        sut.isMatch(s, p) == answer

        where:
        s             | p            || answer
        'aa'          | 'a'          || false
        'aa'          | 'a*'         || true
        'ab'          | '.*'         || true
        'aab'         | 'c*a*b'      || true
        'mississippi' | 'mis*is*p*.' || false
    }
}
