package crackingthecode.part2conceptsandalgorithms

import spock.lang.Ignore
import spock.lang.Specification

class Chapter6BrainTeasersSpec extends Specification {

    Chapter6BrainTeasers chapter6BrainTeasers

    def "setup"() {
        chapter6BrainTeasers = new Chapter6BrainTeasers()
    }

    def "arithmeticOperators"() {
        expect:
        chapter6BrainTeasers.arithmeticOperators() == 8
    }

    def "chessPieces"() {
        expect:
        chapter6BrainTeasers.chessPieces() == 64
    }

    def "exactJugs"() {
        expect:
        chapter6BrainTeasers.exactJugs() == 4
    }

    @Ignore
    def "howLong"() {
        expect:
        chapter6BrainTeasers.nFloor() == 4
    }

    @Ignore
    def "nFloor"() {
        expect:
        chapter6BrainTeasers.nFloor() == 4
    }

    def "lockersOpen"() {
        expect:
        chapter6BrainTeasers.lockersOpen() == 10
    }
}
