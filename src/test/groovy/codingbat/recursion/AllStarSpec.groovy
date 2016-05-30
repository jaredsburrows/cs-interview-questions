package codingbat.recursion

import spock.lang.Specification

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
class AllStarSpec extends Specification {

    def "allStar"() {
        expect:
        AllStar.allStar(a) == b

        where:
        a       || b
        "hello" || "h*e*l*l*o"
        "abc"   || "a*b*c"
        "ab"    || "a*b"
    }
}
