package leetcode

import spock.lang.Specification
import spock.lang.Unroll

final class Problem387FirstUniqueCharacterInAStringTest extends Specification {
    @Unroll def "firstUniqChar(#s) = #answer"() {
        given:
        def sut = new Problem387FirstUniqueCharacterInAString()

        expect:
        sut.firstUniqChar(s) == answer

        where:
        s              || answer
        "leetcode"     || 0
        "loveleetcode" || 2
    }
}
