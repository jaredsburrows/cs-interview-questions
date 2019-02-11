package leetcode

import spock.lang.Specification
import spock.lang.Unroll

final class Problem14LongestCommonPrefixSpec extends Specification {
    @Unroll def 'longestCommonPrefix(#strs) = #answer'() {
        given:
        def sut = new Problem14LongestCommonPrefix()

        expect:
        sut.longestCommonPrefix(strs as String[]) == answer

        where:
        strs                         || answer
        ['flower', 'flow', 'flight'] || 'fl'
        ['dog', 'racecar', 'car']    || ''
    }
}
