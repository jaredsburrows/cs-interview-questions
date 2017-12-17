package questions.tree

import spock.lang.Unroll
import test.BaseSpec

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
final class SymmetricTreeSpec extends BaseSpec {

    @Unroll def "test isSymmetric"() {
        expect:
        SymmetricTree.isSymmetric(a) == b

        where:
        a               || b
        null            || true
        balancedTree    || true
        notBalancedTree || false
    }

    @Unroll def "test isSymmetric2"() {
        expect:
        SymmetricTree.isSymmetric(a, b) == c

        where:
        a            | b               || c
        null         | null            || true
        null         | balancedTree    || false
        balancedTree | null            || false
        balancedTree | balancedTree    || true
        balancedTree | notBalancedTree || false
    }
}
