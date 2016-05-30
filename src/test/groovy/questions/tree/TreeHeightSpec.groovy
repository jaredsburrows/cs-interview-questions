package questions.tree

import api.TreeNode
import spock.lang.Specification

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
class TreeHeightSpec extends Specification {

    def tree = new TreeNode<>(26)
    def subTree = new TreeNode<>(10)
    def balancedTree = new TreeNode<>(0)
    def balancedTree2 = new TreeNode<>(0)
    def unbalancedTree = new TreeNode<>(5)

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

    def "getHeight"() {
        expect:
        TreeHeight.getHeight(null) == 0
        TreeHeight.getHeight(balancedTree) == 3
        TreeHeight.getHeight(balancedTree2) == 3
        TreeHeight.getHeight(unbalancedTree) == -1
    }

    def "getMinHeight"() {
        expect:
        TreeHeight.getMinHeight(null) == 0
        TreeHeight.getMinHeight(balancedTree) == 3
        TreeHeight.getMinHeight(balancedTree2) == 2
        TreeHeight.getMinHeight(unbalancedTree) == 2
    }

    def "getMaxHeight"() {
        expect:
        TreeHeight.getMaxHeight(null) == 0
        TreeHeight.getMaxHeight(balancedTree) == 3
        TreeHeight.getMaxHeight(balancedTree2) == 3
        TreeHeight.getMaxHeight(unbalancedTree) == 4
    }
}
