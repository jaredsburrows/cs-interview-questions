package leetcode

import spock.lang.Specification
import spock.lang.Unroll

final class Problem709ToLowerCaseTest extends Specification {
    @Unroll def "toLowerCase(#str) = #answer"() {
        given:
        def sut = new Problem709ToLowerCase()

        expect:
        sut.toLowerCase(str) == answer

        where:
        str      || answer
        "Hello"  || "hello"
        "here"   || "here"
        "LOVELY" || "lovely"
    }
}
