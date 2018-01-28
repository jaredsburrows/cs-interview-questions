package questions.combinationspermutation

import questions.Permutations
import spock.lang.Unroll
import test.BaseSpec

final class PermutationsSpec extends BaseSpec {
    @Unroll def "getStringPermutations(\"\", #a) == '#b'"() {
        expect:
        Permutations.getStringPermutations("", a) == b

        where:
        a     || b
        null  || []
        ""    || [""]
        "abc" || ["abc", "acb", "bca", "bac", "cab", "cba"]
    }
}
