package questions.combinationspermutation

import test.BaseSpec

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
class PermutationsSpec extends BaseSpec {

    def "getStringPermutations"() {
        expect:
        Permutations.getStringPermutations("", a) == b

        where:
        a     | b
        null  | null
        ""    | [""]
        "abc" | ["abc", "acb", "bca", "bac", "cab", "cba"]
    }
}
