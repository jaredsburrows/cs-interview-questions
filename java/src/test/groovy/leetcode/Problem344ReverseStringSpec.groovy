package leetcode

import spock.lang.Specification
import spock.lang.Unroll

final class Problem344ReverseStringSpec extends Specification {
    @Unroll def "reverseString"() {
        given:
        def sut = new Problem344ReverseString()

        expect:
        sut.reverseString(a) == b

        where:
        a                                    || b
        null                                 || ""
        "hello"                              || "olleh"
        "the lazy fox jumped over the fence" || "ecnef eht revo depmuj xof yzal eht"
    }
}
