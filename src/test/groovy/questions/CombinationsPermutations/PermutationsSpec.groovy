package questions.CombinationsPermutations

import spock.lang.Specification

class PermutationsSpec extends Specification {

    def "Test [Correct Values]"() {
        expect:
        Permutations.getStringPermutations("", a) == b

        where:
        a     || b
        null  || [""]
        ""    || [""]
        "abc" || ["abc", "acb", "bca", "bac", "cab", "cba"]
    }

}
