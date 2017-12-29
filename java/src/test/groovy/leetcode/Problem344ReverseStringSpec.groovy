package leetcode

import spock.lang.Specification
import spock.lang.Unroll

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
final class Problem344ReverseStringSpec extends Specification {
    @Unroll def "reverseString"() {
        expect:
        Problem344ReverseString.reverseString(a) == b

        where:
        a                                    || b
        null                                 || null
        "hello"                              || "olleh"
        "the lazy fox jumped over the fence" || "ecnef eht revo depmuj xof yzal eht"
    }
}
