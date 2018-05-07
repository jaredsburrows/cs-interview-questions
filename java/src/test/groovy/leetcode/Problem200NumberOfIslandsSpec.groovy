package leetcode

import spock.lang.Specification
import spock.lang.Unroll

final class Problem200NumberOfIslandsSpec extends Specification {
    @Unroll def "numIslands(#grid) = #answer"() {
        given:
        def sut = new Problem200NumberOfIslands()

        expect:
        sut.numIslands(grid as char[][]) == answer

        where:
        grid                        || answer
        [['1', '1', '1', '1', '0'],
         ['1', '1', '0', '1', '0'],
         ['1', '1', '0', '0', '0'],
         ['0', '0', '0', '0', '0']] || 1
        [['1', '1', '0', '0', '0'],
         ['1', '1', '0', '0', '0'],
         ['0', '0', '1', '0', '0'],
         ['0', '0', '0', '1', '1']] || 3
    }
}
