package crackingthecode.part2conceptsandalgorithms

import spock.lang.Ignore
import spock.lang.Specification
/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
class Chapter5BitManipulationSpec extends Specification {

    def "constructor"() {
        expect:
        new Chapter5BitManipulation() != null
    }

    @Ignore
    def "setBitPosition"() {
        expect:
        Chapter5BitManipulation.setBitPosition(a as int, b, c, d) == e

        where:
        a           || b     || c || d || e
        10000000000 || 10101 || 2 || 6 || 10001010100
    }

    def "getDiffBits"() {
        expect:
        Chapter5BitManipulation.getDiffBits(a, b) == c
        Chapter5BitManipulation.bitSwapRequired(a, b) == c

        where:
        a  || b  || c
        31 || 14 || 2
//        4  || 3  || 1 // book answer is wrong, 3?
        4 || 4 || 0
    }

    def "getSwapBits"() {
        expect:
        Chapter5BitManipulation.getSwapBits(a) == b

        where:
        a  || b
        10 || 5
    }
}
