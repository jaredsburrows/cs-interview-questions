package leetcode

import spock.lang.Specification
import spock.lang.Unroll

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
@SuppressWarnings("GroovyPointlessBoolean")
final class Problem657JudgeRouteCircleSpec extends Specification {
    @Unroll def "judgeCircle"() {
        expect:
        Problem657JudgeRouteCircle.judgeCircle(a) == b

        where:
        a            || b
        null         || false
        "UD"         || true
        "LL"         || false
        "RLUURDDDLU" || true
    }
}
