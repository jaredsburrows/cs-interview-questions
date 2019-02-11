package leetcode

import spock.lang.Specification
import spock.lang.Unroll

final class Problem760FindAnagramMappingsSpec extends Specification {
    @Unroll def 'anagramMappings(#A, #B) = #answer'() {
        given:
        def sut = new Problem760FindAnagramMappings()

        expect:
        sut.anagramMappings(A as int[], B as int[]) == answer as int[]

        where:
        A                    | B                     | answer
        [12, 28, 46, 32, 50] | [50, 12, 32, 46, 28] || [1, 4, 3, 2, 0]
    }
}
