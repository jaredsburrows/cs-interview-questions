package crackingthecode.part2conceptsandalgorithms

import spock.lang.Ignore
import spock.lang.Specification

class Chapter5BitManipulationSpec extends Specification {

    @Ignore
    def "5.1 - setBitPosition"() {
        expect:
        Chapter5BitManipulation.setBitPosition(a as int, b, c, d) == e

        where:
        a           || b     || c || d || e
        10000000000 || 10101 || 2 || 6 || 10001010100
    }

    def "5.5 - getDiffBits"() {
        expect:
        Chapter5BitManipulation.getDiffBits(a, b) == c
        Chapter5BitManipulation.bitSwapRequired(a, b) == c

        where:
        a  || b  || c
        31 || 14 || 2
//        4  || 3  || 1 // book answer is wrong, 3?
        4 || 4 || 0
    }

    def "5.6 - getSwapBits"() {
        expect:
        Chapter5BitManipulation.getSwapBits(a) == b

        where:
        a  || b
        10 || 5
    }
}
