package questions.tree

import test.BaseSpec

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
class SymmetricTreeSpec extends BaseSpec {

    def "test isSymmetric"() {
        expect:
        SymmetricTree.isSymmetric(a) == b

        where:
        a               | b
        null            | true
        balancedTree    | true
        notBalancedTree | false
    }

    def "test isSymmetric2"() {
        expect:
        SymmetricTree.isSymmetric(a, b) == c

        where:
        a               | b               | c
        null            | null            | true
        null            | balancedTree    | false
        balancedTree    | null            | false
        balancedTree    | balancedTree    | true
        balancedTree    | notBalancedTree | false
    }
}
