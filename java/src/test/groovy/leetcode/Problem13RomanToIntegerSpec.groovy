package leetcode

import spock.lang.Specification
import spock.lang.Unroll

final class Problem13RomanToIntegerSpec extends Specification {
    @Unroll def "romanToInt(#s) = #answer"() {
        given:
        def sut = new Problem13RomanToInteger()

        expect:
        sut.romanToInt(s) == answer

        where:
        s         || answer
        "III"     || 3
        "IV"      || 4
        "IX"      || 9
        "LVIII"   || 58
        "MCMXCIV" || 1994
    }
}
