package crackingthecode.part2conceptsandalgorithms

import spock.lang.Specification
/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
class Chapter5BitManipulationSpec extends Specification {

    def "getDiffBits"() {
        expect:
        Chapter5BitManipulation.getDiffBits(a, b) == c
        Chapter5BitManipulation.bitSwapRequired(a, b) == c

        where:
        a  | b  | c
        31 | 14 | 2
//        4  | 3  | 1 // book answer is wrong, 3?
        4 | 4 | 0
    }

    def "getSwapBits"() {
        expect:
        Chapter5BitManipulation.getSwapBits(a) == b

        where:
        a  | b
        10 | 5
    }
}
