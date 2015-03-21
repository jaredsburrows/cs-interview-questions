package questions

import spock.lang.Specification

class PermutationsSpec extends Specification {

    def "Test [Correct Values]"() {
        expect:
        Permutations.getPermutationsRecursion("", a) == b

        where:
        a     || b
//        null  || null
//        ""    || []
        "abc" || ["abc", "acb", "bca", "bac", "cab", "cba"]
    }

}
