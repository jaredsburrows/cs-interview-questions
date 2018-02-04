package leetcode

import spock.lang.Specification
import spock.lang.Unroll

final class Problem500KeyboardRowSpec extends Specification {
    @Unroll def "findWords"() {
        given:
        def sut = new Problem500KeyboardRow()

        expect:
        sut.findWords(a as String[]) == b as String[]

        where:
        a                                   || b
        null                                || []
        ["Hello", "Alaska", "Dad", "Peace"] || ["Alaska", "Dad"]
    }
}
