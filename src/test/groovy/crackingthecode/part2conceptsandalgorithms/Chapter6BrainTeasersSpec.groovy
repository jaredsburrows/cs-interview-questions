package crackingthecode.part2conceptsandalgorithms

import spock.lang.Specification
/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
class Chapter6BrainTeasersSpec extends Specification {

    def "arithmeticOperators"() {
        expect:
        Chapter6BrainTeasers.arithmeticOperators() == 8
    }

    def "chessPieces"() {
        expect:
        Chapter6BrainTeasers.chessPieces() == 64
    }

    def "exactJugs"() {
        expect:
        Chapter6BrainTeasers.exactJugs() == 4
    }

    def "lockersOpen"() {
        expect:
        Chapter6BrainTeasers.lockersOpen() == 10
    }
}
