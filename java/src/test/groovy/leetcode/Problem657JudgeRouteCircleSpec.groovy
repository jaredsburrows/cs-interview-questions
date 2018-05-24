package leetcode

import spock.lang.Specification
import spock.lang.Unroll

final class Problem657JudgeRouteCircleSpec extends Specification {
    @Unroll def "judgeCircle(#moves) = #answer"() {
        given:
        def sut = new Problem657JudgeRouteCircle()

        expect:
        sut.judgeCircle(moves) == answer

        where:
        moves        || answer
        null         || false
        "UD"         || true
        "LL"         || false
        "RLUURDDDLU" || true
    }
}
