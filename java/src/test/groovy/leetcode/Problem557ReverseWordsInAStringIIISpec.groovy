package leetcode

import spock.lang.Specification
import spock.lang.Unroll

final class Problem557ReverseWordsInAStringIIISpec extends Specification {
    @Unroll def 'reverseWords(#s) = #answer'() {
        given:
        def sut = new Problem557ReverseWordsInAStringIII()

        expect:
        sut.reverseWords(s) == answer

        where:
        s                             || answer
        'Let\'s take LeetCode contest' || 's\'teL ekat edoCteeL tsetnoc'
    }
}
