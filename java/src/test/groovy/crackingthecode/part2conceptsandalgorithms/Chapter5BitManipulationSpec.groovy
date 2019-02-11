package crackingthecode.part2conceptsandalgorithms

import crackingthecode.Chapter5BitManipulation
import spock.lang.Specification
import spock.lang.Unroll

final class Chapter5BitManipulationSpec extends Specification {
    def sut = new Chapter5BitManipulation()

    @Unroll def 'getDiffBits(#a, #b) == #c'() {
        expect:
        sut.getDiffBits(a, b) == c
        sut.bitSwapRequired(a, b) == c

        where:
        a  | b  || c
        31 | 14 || 2
        //        4  | 3  | 1 // book answer is wrong, 3?
        4  | 4  || 0
    }

    @Unroll def 'getSwapBits(#a) == #b'() {
        expect:
        sut.getSwapBits(a) == b

        where:
        a  || b
        10 || 5
    }
}
