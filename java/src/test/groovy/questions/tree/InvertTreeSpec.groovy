package questions.tree

import api.TreeNode
import test.BaseSpec

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
final class InvertTreeSpec extends BaseSpec {

    def balancedTree = new TreeNode<>(0)
    def reversedBalancedTree = new TreeNode<>(0)
    def unbalancedTree = new TreeNode<>(5)
    def reversedUnbalancedTree = new TreeNode<>(5)

    def "setup"() {
        balancedTree.right = new TreeNode<Integer>(10)
        balancedTree.right.left = new TreeNode<Integer>(10)
        balancedTree.right.right = new TreeNode<Integer>(10)
        balancedTree.left = new TreeNode<Integer>(1)
        balancedTree.left.left = new TreeNode<Integer>(12)
        balancedTree.left.right = new TreeNode<Integer>(2)

        reversedBalancedTree.right = new TreeNode<Integer>(1)
        reversedBalancedTree.right.right = new TreeNode<Integer>(12)
        reversedBalancedTree.right.left = new TreeNode<Integer>(2)
        reversedBalancedTree.left = new TreeNode<Integer>(10)
        reversedBalancedTree.left.right = new TreeNode<Integer>(10)
        reversedBalancedTree.left.left = new TreeNode<Integer>(10)

        unbalancedTree.right = new TreeNode<Integer>(10)
        unbalancedTree.left = new TreeNode<Integer>(1)
        unbalancedTree.left.left = new TreeNode<Integer>(12)
        unbalancedTree.left.left.left = new TreeNode<Integer>(12)

        reversedUnbalancedTree.left = new TreeNode<Integer>(10)
        reversedUnbalancedTree.right = new TreeNode<Integer>(1)
        reversedUnbalancedTree.right.right = new TreeNode<Integer>(12)
        reversedUnbalancedTree.right.right.right = new TreeNode<Integer>(12)
    }

    def "test reverseTree"() {
        expect:
        InvertTree.reverseTree(null) == null
        InvertTree.reverseTree(balancedTree) == reversedBalancedTree
        InvertTree.reverseTree(unbalancedTree) == reversedUnbalancedTree
    }
}
