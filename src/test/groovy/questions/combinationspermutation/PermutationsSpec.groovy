package questions.combinationspermutation

import spock.lang.Specification

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
class PermutationsSpec extends Specification {

    def "getStringPermutations"() {
        expect:
        Permutations.getStringPermutations("", a) == b

        where:
        a     || b
        null  || null
        ""    || [""]
        "abc" || ["abc", "acb", "bca", "bac", "cab", "cba"]
    }

}
