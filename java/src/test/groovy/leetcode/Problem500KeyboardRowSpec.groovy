package leetcode

import spock.lang.Specification
import spock.lang.Unroll

final class Problem500KeyboardRowSpec extends Specification {
    @Unroll def 'findWords(#words) = #answer'() {
        given:
        def sut = new Problem500KeyboardRow()

        expect:
        sut.findWords(words as String[]) == answer as String[]

        where:
        words                               || answer
        null                                || []
        ['Hello', 'Alaska', 'Dad', 'Peace'] || ['Alaska', 'Dad']
    }
}
