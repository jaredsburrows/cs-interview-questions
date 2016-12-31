package questions.combinationspermutation

import test.BaseSpec

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
final class PermutationsSpec extends BaseSpec {

    def "test getStringPermutations"() {
        expect:
        Permutations.getStringPermutations("", a) == b

        where:
        a     | b
        null  | null
        ""    | [""]
        "abc" | ["abc", "acb", "bca", "bac", "cab", "cba"]
    }
}
