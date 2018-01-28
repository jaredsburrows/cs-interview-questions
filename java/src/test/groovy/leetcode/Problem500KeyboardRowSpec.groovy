package leetcode

import spock.lang.Specification
import spock.lang.Unroll

final class Problem500KeyboardRowSpec extends Specification {
    @Unroll def "findWords"() {
        expect:
        Problem500KeyboardRow.findWords(a as String[]) == b as String[]

        where:
        a                                   || b
        null                                || []
        ["Hello", "Alaska", "Dad", "Peace"] || ["Alaska", "Dad"]
    }
}
