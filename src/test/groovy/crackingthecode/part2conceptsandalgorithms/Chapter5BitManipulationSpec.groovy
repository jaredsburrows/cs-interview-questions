package crackingthecode.part2conceptsandalgorithms

import spock.lang.Ignore
import spock.lang.Specification

class Chapter5BitManipulationSpec extends Specification {

    Chapter5BitManipulation chapter5BitManipulation

    def "setup"() {
        chapter5BitManipulation = new Chapter5BitManipulation()
    }

    @Ignore
    def "5.1 - setBitPosition"() {
        expect:
        chapter5BitManipulation.setBitPosition(a as int, b, c, d) == e

        where:
        a           || b     || c || d || e
        10000000000 || 10101 || 2 || 6 || 10001010100
    }

    def "5.5 - getDiffBits"() {
        expect:
        chapter5BitManipulation.getDiffBits(a, b) == c
        chapter5BitManipulation.bitSwapRequired(a, b) == c

        where:
        a  || b  || c
        31 || 14 || 2
//        4  || 3  || 1 // book answer is wrong, 3?
        4 || 4 || 0
    }

    def "5.6 - getSwapBits"() {
        expect:
        chapter5BitManipulation.getSwapBits(a) == b

        where:
        a  || b
        10 || 5
    }
}
