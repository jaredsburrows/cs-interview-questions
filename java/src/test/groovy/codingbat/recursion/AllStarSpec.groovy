package codingbat.recursion

import spock.lang.Unroll
import test.BaseSpec

final class AllStarSpec extends BaseSpec {
    @Unroll def "allStar(#a) == '#b'"() {
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
