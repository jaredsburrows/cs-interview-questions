package leetcode

import spock.lang.Specification
import spock.lang.Unroll

final class Problem292NimGameSpec extends Specification {
    @Unroll def "canWinNim(#n) = #answer"() {
        given:
        def sut = new Problem292NimGame()

        expect:
        sut.canWinNim(n) == answer

        where:
        n || answer
        1 || true
        2 || true
        3 || true
        4 || false
    }
}
