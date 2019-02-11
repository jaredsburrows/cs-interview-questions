package leetcode

import spock.lang.Specification
import spock.lang.Unroll

final class Problem42TrappingRainWaterSpec extends Specification {
    @Unroll def 'trap(#height) = #answer'() {
        given:
        def sut = new Problem42TrappingRainWater()

        expect:
        sut.trap(height as int[]) == answer

        where:
        height                               || answer
        [0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1] || 6
    }
}
