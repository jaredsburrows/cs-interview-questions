package leetcode

import leetcode.api.TreeNode
import spock.lang.Specification
import spock.lang.Unroll

final class Problem108ConvertSortedArrayToBinarySearchTreeSpec extends Specification {

    // [0,-3,9,-10,null,5]
    //      0
    //     / \
    //   -3   9
    //  /   /
    //-10  5

    // [0,-10,5,null,-3,null,9]
    //      0
    //     / \
    //   -10  5
    //     \   \
    //     -3   9

    @Unroll def 'sortedArrayToBST(#nums) = #expected'() {
        given:
        def sut = new Problem108ConvertSortedArrayToBinarySearchTree()
        def nums = [-10, -3, 0, 5, 9]

        when:
        def actual = sut.sortedArrayToBST(nums as int[])
        def expected = new TreeNode(0)
        expected.left = new TreeNode(-10)
        expected.left.right = new TreeNode(-3)
        expected.right = new TreeNode(5)
        expected.right.right = new TreeNode(9)

        then:
        actual == expected
    }
}
