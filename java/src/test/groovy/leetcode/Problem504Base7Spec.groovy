package leetcode

import spock.lang.Specification
import spock.lang.Unroll

final class Problem504Base7Spec extends Specification {
    @Unroll def "convertToBase7(#num) = #answer"() {
        given:
        def sut = new Problem504Base7()

        expect:
        sut.convertToBase7(num) == answer

        where:
        num || answer
        100 || "202"
        -7  || "-10"
    }
}
