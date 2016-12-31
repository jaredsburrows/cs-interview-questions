package questions.stringarraymatrix

import spock.lang.Unroll
import test.BaseSpec

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
final class SubstringSpec extends BaseSpec {

    @Unroll def "test substring"() {
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

    @Unroll def "test substring2"() {
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
