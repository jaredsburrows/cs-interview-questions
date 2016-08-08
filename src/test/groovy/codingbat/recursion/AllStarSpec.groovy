package codingbat.recursion

import test.BaseSpec

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
class AllStarSpec extends BaseSpec {

    def "test allStar"() {
        expect:
        AllStar.allStar(a) == b

        where:
        a       | b
        null    | null
        ""      | ""
        "1"     | "1"
        "hello" | "h*e*l*l*o"
        "abc"   | "a*b*c"
        "ab"    | "a*b"
    }
}
