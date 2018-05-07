package leetcode

import spock.lang.Specification
import spock.lang.Unroll

final class Problem151ReverseWordsInAStringSpec extends Specification {
    @Unroll def "reverseWords(#s) = #answer"() {
        given:
        def sut = new Problem151ReverseWordsInAString()

        expect:
        sut.reverseWords(s) == answer

        where:
        s                 || answer
        "the sky is blue" || "blue is sky the"
    }
}
