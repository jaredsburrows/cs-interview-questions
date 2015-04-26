package questions.combinationspermutation

import spock.lang.Specification

class PermutationsSpec extends Specification {

    def "getStringPermutations"() {
        given:
        Permutations permutations = new Permutations()

        expect:
        permutations.getStringPermutations("", a) == b

        where:
        a     || b
        null  || null
        ""    || [""]
        "abc" || ["abc", "acb", "bca", "bac", "cab", "cba"]
    }

}
