package leetcode

import spock.lang.Specification
import spock.lang.Unroll

final class Problem1816TruncateSentenceSpec extends Specification {
    @Unroll def 'truncateSentence(#s, #k) == #answer'() {
        given:
        def sut = new Problem1816TruncateSentence()

        expect:
        sut.truncateSentence(s, k) == answer
        sut.truncateSentence2(s, k) == answer
        sut.truncateSentence3(s, k) == answer

        where:
        s                                      | k || answer
        "Hello how are you Contestant"         | 4 || "Hello how are you"
        "What is the solution to this problem" | 4 || "What is the solution"
        "chopper is not a tanuki"              | 5 || "chopper is not a tanuki"
    }
}
