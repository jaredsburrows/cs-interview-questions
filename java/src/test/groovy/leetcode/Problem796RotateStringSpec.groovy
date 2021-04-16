package leetcode

import spock.lang.Specification
import spock.lang.Unroll

final class Problem796RotateStringSpec extends Specification {
    @Unroll def 'rotateString(#A, #B) = #answer'() {
        given:
        def sut = new Problem796RotateString()

        expect:
        sut.rotateString(A, B) == answer

        where:
        A       | B       || answer
        'abcde' | 'cdeab' || true
    }
}
