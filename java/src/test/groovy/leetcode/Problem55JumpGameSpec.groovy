package leetcode

import spock.lang.Specification
import spock.lang.Unroll

final class Problem55JumpGameSpec extends Specification {
    @Unroll def 'canJump(#nums) = #answer'() {
        given:
        def sut = new Problem55JumpGame()

        expect:
        sut.canJump(nums as int[]) == answer

        where:
        nums            || answer
        [2, 3, 1, 1, 4] || true
        [3, 2, 1, 0, 4] || false
    }
}
