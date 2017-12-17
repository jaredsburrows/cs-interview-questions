package test

import api.Node
import api.TreeNode
import spock.lang.Shared
import spock.lang.Specification

import static java.util.UUID.randomUUID

/**
 * Base class for all specifications.
 *
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
abstract class BaseSpec extends Specification {
    // Testing Comparisons
    @Shared def static final NUMBER_NEGATIVE_ONE = -1
    @Shared def static final NUMBER_ZERO = 0
    @Shared def static final NUMBER_ONE = 1
    @Shared def static final STRING_EMPTY = ""
    @Shared def static final STRING_NULL = null
    @Shared def static final STRING_UNIQUE = randomUUID().toString()
    @Shared def static final STRING_UNIQUE2 = randomUUID().toString() + randomUUID().toString()
    @Shared def static final STRING_UNIQUE3 = randomUUID().toString()
    @Shared def static final INTEGER_RANDOM = new Random().nextInt()
    @Shared def static final INTEGER_RANDOM_POSITIVE = new Random().nextInt(Integer.SIZE - 1)
    @Shared def static final LONG_RANDOM = new Random().nextLong()
    @Shared def static final DOUBLE_RANDOM = new Random().nextDouble()

    // Api
    @Shared def node0 = new Node<>(0)
    @Shared def node1 = new Node<>(1)
    @Shared def node2 = new Node<>(2)
    @Shared def node3 = new Node<>(3)
    @Shared def node4 = new Node<>(4)
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
