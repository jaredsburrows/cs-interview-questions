package leetcode

import spock.lang.Specification
import spock.lang.Unroll

final class Problem771JewelsAndStonesSpec extends Specification {
    @Unroll def 'isValid(#J, #S) = #answer'() {
        given:
        def sut = new Problem771JewelsAndStones()

        expect:
        sut.numJewelsInStones(J, S) == answer

        where:
        J    | S         || answer
        'aA' | 'aAAbbbb' || 3
        'z'  | 'ZZ'      || 0
    }
}
