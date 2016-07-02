package questions.tree

import api.TreeNode
import test.BaseSpec
/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
class BstIsBstSpec extends BaseSpec {

    def balancedTree = new TreeNode<>(5)
    //      5
    //     / \
    //    3    9
    //   / \  / \
    //  1   4 6  10

    def "setup"() {
        balancedTree.right = new TreeNode<Integer>(9)
        balancedTree.right.right = new TreeNode<Integer>(10)
        balancedTree.right.left = new TreeNode<Integer>(6)
        balancedTree.left = new TreeNode<Integer>(3)
        balancedTree.left.right = new TreeNode<Integer>(4)
        balancedTree.left.left = new TreeNode<Integer>(1)
    }

    def "isBst"() {
        expect:
        BstIsBst.isBst(null)
        BstIsBst.isBst(balancedTree)
    }
}
