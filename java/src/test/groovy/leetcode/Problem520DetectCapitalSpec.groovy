package leetcode

import spock.lang.Specification
import spock.lang.Unroll

final class Problem520DetectCapitalSpec extends Specification {
    @Unroll def "detectCapitalUse(#word) = #answer"() {
        given:
        def sut = new Problem520DetectCapital()

        expect:
        sut.detectCapitalUse(word) == answer

        where:
        word   || answer
        "USA"  || true
        "FlaG" || false
    }
}
