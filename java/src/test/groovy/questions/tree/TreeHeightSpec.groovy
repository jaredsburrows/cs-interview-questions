package questions.tree

import api.TreeNode
import questions.TreeHeight
import spock.lang.Shared
import spock.lang.Unroll
import test.BaseSpec

final class TreeHeightSpec extends BaseSpec {
    @Shared def tree = new TreeNode<>(26)
    @Shared def subTree = new TreeNode<>(10)
    @Shared def balancedTreeNodes = new TreeNode<>(0)
    @Shared def balancedTreeNodes2 = new TreeNode<>(0)
    @Shared def unbalancedTree = new TreeNode<>(5)

    def "setup"() {
        balancedTreeNodes.right = new TreeNode<Integer>(10)
        balancedTreeNodes.right.left = new TreeNode<Integer>(10)
        balancedTreeNodes.right.right = new TreeNode<Integer>(10)
        balancedTreeNodes.left = new TreeNode<Integer>(1)
        balancedTreeNodes.left.left = new TreeNode<Integer>(12)
        balancedTreeNodes.left.right = new TreeNode<Integer>(2)

        balancedTreeNodes2.right = new TreeNode<Integer>(10)
        balancedTreeNodes2.right.left = new TreeNode<Integer>(10)
        balancedTreeNodes2.left = new TreeNode<Integer>(1)
        balancedTreeNodes2.left.right = new TreeNode<Integer>(2)

        unbalancedTree.right = new TreeNode<Integer>(10)
        unbalancedTree.left = new TreeNode<Integer>(1)
        unbalancedTree.left.left = new TreeNode<Integer>(12)
        unbalancedTree.left.left.left = new TreeNode<Integer>(12)

        subTree.right = new TreeNode<Integer>(6)
        subTree.left = new TreeNode<Integer>(4)
        subTree.left.right = new TreeNode<Integer>(30)

        tree.right = new TreeNode<Integer>(3)
        tree.right.right = new TreeNode<Integer>(3)
        tree.left = new TreeNode<Integer>(10)
        tree.left.left = new TreeNode<Integer>(4)
        tree.left.left.right = new TreeNode<Integer>(30)
        tree.left.right = new TreeNode<Integer>(6)
    }

    @Unroll def "getHeight(#a) == '#b'"() {
        expect:
        TreeHeight.getHeight(a) == b

        where:
        a                  || b
        null               || 0
        balancedTreeNodes  || 3
        balancedTreeNodes2 || 3
        unbalancedTree     || -1
    }

    @Unroll def "getMinHeight(#a) == '#b'"() {
        expect:
        TreeHeight.getMinHeight(a) == b

        where:
        a                  || b
        null               || 0
        balancedTreeNodes  || 3
        balancedTreeNodes2 || 2
        unbalancedTree     || 2
    }

    @Unroll def "getMaxHeight(#a) == '#b'"() {
        expect:
        TreeHeight.getMaxHeight(a) == b

        where:
        a                  || b
        null               || 0
        balancedTreeNodes  || 3
        balancedTreeNodes2 || 3
        unbalancedTree     || 4
    }
}
