package leetcode

import spock.lang.Specification
import spock.lang.Unroll

final class Problem692TopKFrequentWordsSpec extends Specification {
    @Unroll def "topKFrequent(#words, #k) = #answer"() {
        given:
        def sut = new Problem692TopKFrequentWords()

        expect:
        sut.topKFrequent(words as String[], k) == answer

        where:
        words                                                                   | k || answer
        ["i", "love", "leetcode", "i", "love", "coding"]                        | 2 || ["i", "love"]
        ["the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"] | 4 ||
            ["the", "is", "sunny", "day"]
    }
}
