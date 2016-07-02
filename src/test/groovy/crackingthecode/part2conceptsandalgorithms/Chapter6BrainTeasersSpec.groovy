package crackingthecode.part2conceptsandalgorithms

import test.BaseSpec

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
class Chapter6BrainTeasersSpec extends BaseSpec {

    def "test arithmeticOperators"() {
        expect:
        Chapter6BrainTeasers.arithmeticOperators() == 8
    }

    def "test chessPieces"() {
        expect:
        Chapter6BrainTeasers.chessPieces() == 64
    }

    def "test exactJugs"() {
        expect:
        Chapter6BrainTeasers.exactJugs() == 4
    }

    def "test lockersOpen"() {
        expect:
        Chapter6BrainTeasers.lockersOpen() == 10
    }
}
