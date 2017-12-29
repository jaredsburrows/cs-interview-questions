package crackingthecode.part2conceptsandalgorithms

import spock.lang.Unroll
import test.BaseSpec

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
final class Chapter5BitManipulationSpec extends BaseSpec {
    @Unroll def "getDiffBits(#a, #b) == '#c'"() {
        expect:
        Chapter5BitManipulation.getDiffBits(a, b) == c
        Chapter5BitManipulation.bitSwapRequired(a, b) == c

        where:
        a  | b  || c
        31 | 14 || 2
        //        4  | 3  | 1 // book answer is wrong, 3?
        4  | 4  || 0
    }

    @Unroll def "getSwapBits(#a) == '#b'"() {
        expect:
        Chapter5BitManipulation.getSwapBits(a) == b

        where:
        a  || b
        10 || 5
    }
}
