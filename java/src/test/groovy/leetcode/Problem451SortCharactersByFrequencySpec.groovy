package leetcode

import spock.lang.Specification
import spock.lang.Unroll

final class Problem451SortCharactersByFrequencySpec extends Specification {
    @Unroll def 'frequencySort(#s) = #answer'() {
        given:
        def sut = new Problem451SortCharactersByFrequency()

        expect:
        sut.frequencySort(s) == answer

        where:
        s        || answer
        "tree"   || "eert"
        "cccaaa" || "aaaccc"
        "Aabb"   || "bbAa"
    }
}
