package leetcode

import spock.lang.Specification
import spock.lang.Unroll

final class Problem273IntegerToEnglishWordsSpec extends Specification {
    @Unroll def "numberToWords(#num) = #answer"() {
        given:
        def sut = new Problem273IntegerToEnglishWords()

        expect:
        sut.numberToWords(num) == answer

        where:
        num     || answer
        123     || "One Hundred Twenty Three"
        12345   || "Twelve Thousand Three Hundred Forty Five"
        1234567 || "One Million Two Hundred Thirty Four Thousand Five Hundred Sixty Seven"
    }
}
