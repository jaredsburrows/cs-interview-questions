package leetcode

import spock.lang.Specification
import spock.lang.Unroll

final class Problem28ImplementStrStrSpec extends Specification {
    @Unroll def "strStr(#haystack, #needle) = #answer"() {
        given:
        def sut = new Problem28ImplementStrStr()

        expect:
        sut.strStr(haystack, needle) == answer

        where:
        haystack | needle || answer
        "hello"  | "ll"   || 2
        "aaaaa"  | "bba"  || -1
    }
}
