package leetcode

import leetcode.api.TreeNode
import spock.lang.Ignore
import spock.lang.Specification
import spock.lang.Unroll

final class Problem108ConvertSortedArrayToBinarySearchTreeSpec extends Specification {
    @Ignore
    @Unroll def "sortedArrayToBST(#nums) = #answer"() {
        given:
        def sut = new Problem108ConvertSortedArrayToBinarySearchTree()
        def nums = [-10, -3, 0, 5, 9]

        when:
        def actual = sut.sortedArrayToBST(nums as int[])
        def expected = new TreeNode(0)
        expected.left = new TreeNode(-3).left = new TreeNode(-10)
        expected.right = new TreeNode(9).left = new TreeNode(5)

        then:
        actual == expected
    }
}
