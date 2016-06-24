package questions.stringarraymatrix

import spock.lang.Specification

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
class SubstringSpec extends Specification {

    def "substring"() {
        expect:
        Substring.substring(a, b, c) == d

        where:
        a       | b  | c  || d
        null    | 0  | 0  || null
        ""      | 0  | 0  || ""
        "jared" | -1 | 2  || null
        "jared" | 0  | -1 || null
        "jared" | 50 | 2  || null
        "jared" | 0  | 50 || null
        "01234" | 0  | 3  || "012"
        "hello" | 0  | 3  || "hel"
    }

    def "substring2"() {
        expect:
        Substring.substring(a, c) == d

        where:
        a       | c  || d
        null    | 0  || null
        ""      | 0  || ""
        "jared" | -1 || null
        "jared" | 2  || "ja"
        "jared" | 50 || null
        "01234" | 3  || "012"
        "hello" | 3  || "hel"
    }
}
