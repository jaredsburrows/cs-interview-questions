package questions.tree

import api.TreeNode
import test.BaseSpec

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
class BstIsBstSpec extends BaseSpec {

    def "test isBst"() {
        expect:
        BstIsBst.isBst(a) == b

        where:
        a               | b
        null            | true
        balancedTreeBST | true
    }

    def "test isBst2"() {
        expect:
        BstIsBst.isBst(a as TreeNode<Integer>, b as Double, c as Double) == d

        where:
        a               | b                        | c                        | d
        null            | Double.NEGATIVE_INFINITY | Double.POSITIVE_INFINITY | true
        balancedTreeBST | Double.NEGATIVE_INFINITY | Double.POSITIVE_INFINITY | true
    }
}
