package test

import api.TreeNode
import spock.lang.Shared
import spock.lang.Specification

/**
 * Base class for all specifications.
 */
abstract class BaseSpec extends Specification {
    //     0
    //    / \
    //   1   1
    //  / \ / \
    // 2  3 3  2
    @Shared def balancedTree = new TreeNode<>()
    //     5
    //    / \
    //   3    9
    //  / \  / \
    // 1   4 6  10
    @Shared def balancedTreeBST = new TreeNode<>(5)
    //     0
    //    / \
    //   1   1
    //  / \
    // 2  3
    @Shared def notBalancedTree = new TreeNode<>()
    //       8
    //     /   \
    //    2     21
    //  /  \    /
    // 1   5  13
    //       /
    //      3
    @Shared def notBalancedBstTree = new TreeNode<>(8)

    def "setup"() {
        balancedTree.right = new TreeNode<>(1)
        balancedTree.right.left = new TreeNode<>(3)
        balancedTree.right.right = new TreeNode<>(2)
        balancedTree.left = new TreeNode<>(1)
        balancedTree.left.left = new TreeNode<>(2)
        balancedTree.left.right = new TreeNode<>(3)

        balancedTreeBST.right = new TreeNode<Integer>(9)
        balancedTreeBST.right.right = new TreeNode<Integer>(10)
        balancedTreeBST.right.left = new TreeNode<Integer>(6)
        balancedTreeBST.left = new TreeNode<Integer>(3)
        balancedTreeBST.left.right = new TreeNode<Integer>(4)
        balancedTreeBST.left.left = new TreeNode<Integer>(1)

        notBalancedTree.right = new TreeNode<>(1)
        notBalancedTree.right.left = new TreeNode<>(3)
        notBalancedTree.right.right = new TreeNode<>(2)
        notBalancedTree.left = new TreeNode<>(1)

        notBalancedBstTree.right = new TreeNode<>(21)
        notBalancedBstTree.right.left = new TreeNode<>(13)
        notBalancedBstTree.left = new TreeNode<>(2)
        notBalancedBstTree.left.left = new TreeNode<>(1)
        notBalancedBstTree.left.right = new TreeNode<>(5)
        notBalancedBstTree.left.right.left = new TreeNode<>(3)
    }

    def "cleanup"() {
    }
}
