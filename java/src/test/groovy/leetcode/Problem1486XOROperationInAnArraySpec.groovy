package leetcode

import spock.lang.Specification
import spock.lang.Unroll

final class Problem1486XOROperationInAnArraySpec extends Specification {
    @Unroll def 'xorOperation(#n, #start) = #answer'() {
        given:
        def sut = new Problem1486XOROperationInAnArray()

        expect:
        sut.xorOperation(n, start) == answer

        where:
        n  | start || answer
        5  | 0     || 8
        4  | 3     || 8
        1  | 7     || 7
        10 | 5     || 2
    }
}
