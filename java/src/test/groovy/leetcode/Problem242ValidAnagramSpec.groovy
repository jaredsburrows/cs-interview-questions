package leetcode

import spock.lang.Specification
import spock.lang.Unroll

@SuppressWarnings("GroovyPointlessBoolean")
final class Problem242ValidAnagramSpec extends Specification {
    @Unroll def "isAnagram(#s, #t) = #answer"() {
        given:
        def sut = new Problem242ValidAnagram()

        expect:
        sut.isAnagram(s, t) == answer

        where:
        s         | t         || answer
        "anagram" | "nagaram" || true
        "rat"     | "cat"     || false
    }
}
