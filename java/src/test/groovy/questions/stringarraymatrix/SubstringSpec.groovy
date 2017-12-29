package questions.stringarraymatrix

import spock.lang.Unroll
import test.BaseSpec

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
final class SubstringSpec extends BaseSpec {
    @Unroll def "substring(#a, #b, #c) == '#d'"() {
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

    @Unroll def "substring2(#a, #b) == '#c'"() {
        expect:
        Substring.substring(a, b) == c

        where:
        a       | b  || c
        null    | 0  || null
        ""      | 0  || ""
        "jared" | -1 || null
        "jared" | 2  || "ja"
        "jared" | 50 || null
        "01234" | 3  || "012"
        "hello" | 3  || "hel"
    }
}
