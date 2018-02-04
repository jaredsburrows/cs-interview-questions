package crackingthecode.part2conceptsandalgorithms

import spock.lang.Unroll
import test.BaseSpec

final class Chapter5BitManipulationSpec extends BaseSpec {
    def sut = new Chapter5BitManipulation()

    @Unroll def "getDiffBits(#a, #b) == '#c'"() {
        expect:
        sut.getDiffBits(a, b) == c
        sut.bitSwapRequired(a, b) == c

        where:
        a  | b  || c
        31 | 14 || 2
        //        4  | 3  | 1 // book answer is wrong, 3?
        4  | 4  || 0
    }

    @Unroll def "getSwapBits(#a) == '#b'"() {
        expect:
        sut.getSwapBits(a) == b

        where:
        a  || b
        10 || 5
    }
}
