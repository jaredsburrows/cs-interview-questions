package questions.tree

import api.TreeNode
import spock.lang.Shared
import test.BaseSpec

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
class TreeHeightSpec extends BaseSpec {

    @Shared def tree = new TreeNode<>(26)
    @Shared def subTree = new TreeNode<>(10)
    @Shared def balancedTree = new TreeNode<>(0)
    @Shared def balancedTree2 = new TreeNode<>(0)
    @Shared def unbalancedTree = new TreeNode<>(5)

    def "setup"() {
        balancedTree.right = new TreeNode<Integer>(10)
        balancedTree.right.left = new TreeNode<Integer>(10)
        balancedTree.right.right = new TreeNode<Integer>(10)
        balancedTree.left = new TreeNode<Integer>(1)
        balancedTree.left.left = new TreeNode<Integer>(12)
        balancedTree.left.right = new TreeNode<Integer>(2)

        balancedTree2.right = new TreeNode<Integer>(10)
        balancedTree2.right.left = new TreeNode<Integer>(10)
        balancedTree2.left = new TreeNode<Integer>(1)
        balancedTree2.left.right = new TreeNode<Integer>(2)

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

    def "test getHeight"() {
        expect:
        TreeHeight.getHeight(a) == b

        where:
        a              | b
        null           | 0
        balancedTree   | 3
        balancedTree2  | 3
        unbalancedTree | -1
    }

    def "test getMinHeight"() {
        expect:
        TreeHeight.getMinHeight(a) == b

        where:
        a              | b
        null           | 0
        balancedTree   | 3
        balancedTree2  | 2
        unbalancedTree | 2
    }

    def "test getMaxHeight"() {
        expect:
        TreeHeight.getMaxHeight(a) == b

        where:
        a              | b
        null           | 0
        balancedTree   | 3
        balancedTree2  | 3
        unbalancedTree | 4
    }
}
