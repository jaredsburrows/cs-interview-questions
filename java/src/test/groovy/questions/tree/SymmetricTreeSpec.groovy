package questions.tree

import spock.lang.Unroll
import test.BaseSpec

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
@SuppressWarnings("GroovyPointlessBoolean")
final class SymmetricTreeSpec extends BaseSpec {
    @Unroll def "isSymmetric(#a) == '#b'"() {
        expect:
        SymmetricTree.isSymmetric(a) == b

        where:
        a               || b
        null            || true
        balancedTree    || true
        notBalancedTree || false
    }

    @Unroll def "isSymmetric2(#a, #b) == '#c'"() {
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
