package codingbat.recursion

import spock.lang.Unroll
import test.BaseSpec

@SuppressWarnings("GroovyPointlessBoolean")
final class Array6Spec extends BaseSpec {
    @Unroll def "array6(#a, #b) == '#c'"() {
        expect:
        Array6.array6(a as int[], b) == c

        where:
        a         | b || c
        []        | 0 || false
        [1]       | 1 || false
        [1, 6, 4] | 0 || true
        [1, 4]    | 0 || false
        [6]       | 0 || true
    }
}
