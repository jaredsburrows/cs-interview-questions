package leetcode

import spock.lang.Specification
import spock.lang.Unroll

final class Problem344ReverseStringSpec extends Specification {
    @Unroll def 'reverseString(#s) = #answer'() {
        given:
        def sut = new Problem344ReverseString()

        expect:
        sut.reverseStringAnswer(s as char[]) == answer
        sut.reverseStringAnswer2(s as char[]) == answer

        where:
        s                                    || answer
        'hello'                              || 'olleh'
        'the lazy fox jumped over the fence' || 'ecnef eht revo depmuj xof yzal eht'
    }
}
