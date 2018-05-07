package leetcode

import spock.lang.Specification
import spock.lang.Unroll

final class Problem49GroupAnagramsSpec extends Specification {
    @Unroll def "groupAnagrams(#strs) = #answer"() {
        given:
        def sut = new Problem49GroupAnagrams()

        expect:
        sut.groupAnagrams(strs as String[]) == answer

        where:
        strs                                       || answer
        ["eat", "tea", "tan", "ate", "nat", "bat"] || [["eat", "tea", "ate"],
                                                       ["bat"],
                                                       ["tan", "nat"]]
    }
}
