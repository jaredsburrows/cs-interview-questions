package questions.tree

import api.TreeNode
import spock.lang.Specification

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
class SymmetricTreeSpec extends Specification {

    def balancedTree = new TreeNode<>(1)

    /**
         1
        / \
       2   2
      / \ / \
     3  4 4  3
     * @return
     */
    def "setup"() {
        balancedTree.right = new TreeNode<Integer>(2)
        balancedTree.right.left = new TreeNode<Integer>(4)
        balancedTree.right.right = new TreeNode<Integer>(3)
        balancedTree.left = new TreeNode<Integer>(2)
        balancedTree.left.left = new TreeNode<Integer>(3)
        balancedTree.left.right = new TreeNode<Integer>(4)
    }

    def "constructor"() {
        expect:
        new SymmetricTree() != null
    }

    def "isSymmetric"() {
        expect:
        SymmetricTree.isSymmetric(null)
        SymmetricTree.isSymmetric(balancedTree)
    }
}
