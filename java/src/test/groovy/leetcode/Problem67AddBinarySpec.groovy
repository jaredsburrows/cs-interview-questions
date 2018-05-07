package leetcode

import spock.lang.Specification
import spock.lang.Unroll

final class Problem67AddBinarySpec extends Specification {
    @Unroll def "addBinary(#a, #b) = #answer"() {
        given:
        def sut = new Problem67AddBinary()

        expect:
        sut.addBinary(a, b) == answer

        where:
        a      | b      || answer
        "11"   | "1"    || "100"
        "1010" | "1011" || "10101"
    }
}
