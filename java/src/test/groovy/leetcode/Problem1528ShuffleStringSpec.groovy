package leetcode

import spock.lang.Specification
import spock.lang.Unroll

final class Problem1528ShuffleStringSpec extends Specification {
    @Unroll def 'restoreString(#s, #indices) = #answer'() {
        given:
        def sut = new Problem1528ShuffleString()

        expect:
        sut.restoreString(s, indices as int[]) == answer
        sut.restoreString2(s, indices as int[]) == answer

        where:
        s          | indices                  || answer
        "codeleet" | [4, 5, 6, 7, 0, 2, 1, 3] || "leetcode"
        "abc"      | [0, 1, 2]                || "abc"
        "aiohn"    | [3, 1, 4, 2, 0]          || "nihao"
        "aaiougrt" | [4, 0, 2, 6, 7, 3, 1, 5] || "arigatou"
        "art"      | [1, 0, 2]                || "rat"
    }
}
