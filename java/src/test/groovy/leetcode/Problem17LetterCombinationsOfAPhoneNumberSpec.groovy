package leetcode

import spock.lang.Specification
import spock.lang.Unroll

final class Problem17LetterCombinationsOfAPhoneNumberSpec extends Specification {
    @Unroll def "letterCombinations(#digits) = #answer"() {
        given:
        def sut = new Problem17LetterCombinationsOfAPhoneNumber()

        expect:
        sut.letterCombinations(digits) == answer

        where:
        digits || answer
        "23"   || ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"]
    }
}
