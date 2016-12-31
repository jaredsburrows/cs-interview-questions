package codingbat.recursion

import spock.lang.Unroll
import test.BaseSpec

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
@SuppressWarnings("GroovyPointlessBoolean")
final class AllStarSpec extends BaseSpec {

    @Unroll def "test allStar"() {
        expect:
        AllStar.allStar(a) == b

        where:
        a       || b
        null    || null
        ""      || ""
        "1"     || "1"
        "hello" || "h*e*l*l*o"
        "abc"   || "a*b*c"
        "ab"    || "a*b"
    }
}
