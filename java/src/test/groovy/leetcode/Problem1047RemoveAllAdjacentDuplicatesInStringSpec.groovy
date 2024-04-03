package leetcode

import spock.lang.Specification
import spock.lang.Unroll

class Problem1047RemoveAllAdjacentDuplicatesInStringSpec extends Specification {
    @Unroll
    def 'removeDuplicates(#S) = #answer'() {
        given:
        def sut = new Problem1047RemoveAllAdjacentDuplicatesInString()

        expect:
        sut.removeDuplicates(S) == answer
        sut.removeDuplicates2(S) == answer
        sut.removeDuplicates3(S) == answer

        where:
        S | answer
        "abbaca" | "ca"
        "azxxzy" | "ay"
    }
}
