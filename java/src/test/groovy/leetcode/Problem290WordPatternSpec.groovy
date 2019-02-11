package leetcode

import spock.lang.Specification
import spock.lang.Unroll

final class Problem290WordPatternSpec extends Specification {
    @Unroll def 'wordPattern(#pattern, #str) = #answer'() {
        given:
        def sut = new Problem290WordPattern()

        expect:
        sut.wordPattern(pattern, str) == answer

        where:
        pattern | str                || answer
        'abba'  | 'dog cat cat dog'  || true
        'abba'  | 'dog cat cat fish' || false
        'aaaa'  | 'dog cat cat dog'  || false
        'abba'  | 'dog dog dog dog'  || false
    }
}
