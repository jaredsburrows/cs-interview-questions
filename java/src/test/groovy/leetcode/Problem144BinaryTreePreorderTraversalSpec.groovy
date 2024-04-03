package leetcode

import leetcode.api.TreeNode
import spock.lang.Specification
import spock.lang.Unroll

class Problem144BinaryTreePreorderTraversalSpec extends Specification {
    @Unroll
    def 'preorderTraversal(#root) = #result'() {
        given:
        def sut = new Problem144BinaryTreePreorderTraversal()

        expect:
        sut.preorderTraversal(root) == result

        where:
        root                                                          | result
        new TreeNode(1)                                               | [1] // A tree with only the root
        new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null)) | [1, 2, 3] // A right-leaning tree
        new TreeNode(1, new TreeNode(2), new TreeNode(3))             | [1, 2, 3] // A full binary tree
        new TreeNode(1, new TreeNode(2, new TreeNode(3), null), null) | [1, 2, 3] // A left-leaning tree
        null                                                          | [] // An empty tree
    }
}
