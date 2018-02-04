package crackingthecode.part2conceptsandalgorithms

import test.BaseSpec

final class Chapter6BrainTeasersSpec extends BaseSpec {
    def sut = new Chapter6BrainTeasers()

    def "arithmeticOperators"() {
        expect:
        sut.arithmeticOperators() == 8
    }

    def "chessPieces"() {
        expect:
        sut.chessPieces() == 64
    }

    def "exactJugs"() {
        expect:
        sut.exactJugs() == 4
    }

    def "lockersOpen"() {
        expect:
        sut.lockersOpen() == 10
    }
}
