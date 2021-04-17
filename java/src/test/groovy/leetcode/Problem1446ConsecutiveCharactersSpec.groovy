package leetcode

import spock.lang.Specification
import spock.lang.Unroll

final class Problem1446ConsecutiveCharactersSpec extends Specification {
    @Unroll def 'maxPower(#s) = #answer'() {
        given:
        def sut = new Problem1446ConsecutiveCharacters()

        expect:
        sut.maxPower(s) == answer

        where:
        s                     || answer
        "j"                   || 1
        "ccbccbb"             || 2
        "leetcode"            || 2
        "abbcccddddeeeeedcba" || 5
        "triplepillooooow"    || 5
        "hooraaaaaaaaaaay"    || 11
        "tourist"             || 1
    }
}
