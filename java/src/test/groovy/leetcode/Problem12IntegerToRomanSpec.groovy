package leetcode

import spock.lang.Specification
import spock.lang.Unroll

final class Problem12IntegerToRomanSpec extends Specification {
    @Unroll
    def 'intToRoman(#num) = #answer'() {
        given:
        def sut = new Problem12IntegerToRoman()

        expect:
        sut.intToRoman(num) == answer
        sut.intToRoman2(num) == answer

        where:
        num  || answer
        3    || 'III'
        4    || 'IV'
        9    || 'IX'
        58   || 'LVIII'
        1994 || 'MCMXCIV'
    }
}
