package questions.tree

import spock.lang.Unroll
import test.BaseSpec

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
@SuppressWarnings("GroovyPointlessBoolean")
final class BstContainsSpec extends BaseSpec {
    @Unroll def "test contains"() {
        expect:
        BstContains.contains(a, b) == c

        where:
        a                  | b   || c
        null               | 5    | false
        // not in tree
        notBalancedBstTree | -10 || false
        notBalancedBstTree | 100 || false
        // < root
        notBalancedBstTree | 1   || true
        notBalancedBstTree | 2   || true
        notBalancedBstTree | 3   || true
        notBalancedBstTree | 5   || true
        // == root
        notBalancedBstTree | 8   || true
        // > root
        notBalancedBstTree | 13  || true
        notBalancedBstTree | 21  || true
    }
}
