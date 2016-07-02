package crackingthecode.part2conceptsandalgorithms

import test.BaseSpec

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
class Chapter5BitManipulationSpec extends BaseSpec {

    def "test getDiffBits"() {
        expect:
        Chapter5BitManipulation.getDiffBits(a, b) == c
        Chapter5BitManipulation.bitSwapRequired(a, b) == c

        where:
        a  | b  | c
        31 | 14 | 2
//        4  | 3  | 1 // book answer is wrong, 3?
        4  | 4  | 0
    }

    def "test getSwapBits"() {
        expect:
        Chapter5BitManipulation.getSwapBits(a) == b

        where:
        a  | b
        10 | 5
    }
}
