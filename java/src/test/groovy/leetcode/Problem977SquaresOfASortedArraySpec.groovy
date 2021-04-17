package leetcode

import spock.lang.Specification
import spock.lang.Unroll

final class Problem977SquaresOfASortedArraySpec extends Specification {
    @Unroll def 'sortedSquares(#nums) = #answer'() {
        given:
        def sut = new Problem977SquaresOfASortedArray()

        expect:
        sut.sortedSquares(nums as int[]) == answer as int[]
        sut.sortedSquares2(nums as int[]) == answer as int[]
        sut.sortedSquares3(nums as int[]) == answer as int[]
        sut.sortedSquares4(nums as int[]) == answer as int[]

        where:
        nums               || answer
        [-4, -1, 0, 3, 10] || [0, 1, 9, 16, 100]
        [-7, -3, 2, 3, 11] || [4, 9, 9, 49, 121]
    }
}
