package questions.combinationspermutation

import spock.lang.Unroll
import test.BaseSpec

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
final class PermutationsSpec extends BaseSpec {
    @Unroll def "test getStringPermutations"() {
        expect:
        Permutations.getStringPermutations("", a) == b

        where:
        a     || b
        null  || []
        ""    || [""]
        "abc" || ["abc", "acb", "bca", "bac", "cab", "cba"]
    }
}
