package leetcode

import spock.lang.Specification
import spock.lang.Unroll

final class Problem345ReverseVowelsOfAStringSpec extends Specification {
    @Unroll
    def 'reverseVowels(#s) = #result'() {
        given:
        def sut = new Problem345ReverseVowelsOfAString()

        expect:
        sut.reverseVowels(s) == result
        sut.reverseVowels2(s) == result

        where:
        s          | result
        "hello"    | "holle"
        "leetcode" | "leotcede"
        "aA"       | "Aa"
    }
}
