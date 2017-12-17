package questions.tree

import api.TreeNode
import spock.lang.Unroll
import test.BaseSpec

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
final class BstIsBstSpec extends BaseSpec {
    @Unroll def "test isBst"() {
        expect:
        BstIsBst.isBst(a) == b

        where:
        a               || b
        null            || true
        balancedTreeBST || true
    }

    @Unroll def "test isBst2"() {
        expect:
        BstIsBst.isBst(a as TreeNode<Integer>, b as Double, c as Double) == d

        where:
        a               | b                        | c                        || d
        null            | Double.NEGATIVE_INFINITY | Double.POSITIVE_INFINITY || true
        balancedTreeBST | Double.NEGATIVE_INFINITY | Double.POSITIVE_INFINITY || true
    }
}
