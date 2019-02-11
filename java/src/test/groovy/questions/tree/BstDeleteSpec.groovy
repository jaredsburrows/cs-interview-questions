package questions.tree

import api.TreeNode
import spock.lang.Specification

final class BstDeleteSpec extends Specification {
    def 'delete leaf node'() {
        given:
        //       8
        //     /   \
        //    2     21
        //  /  \    /
        // 1   5  13
        //       /
        //      3
        def actual = new TreeNode<>(8)
        actual.right = new TreeNode<>(21)
        actual.right.left = new TreeNode<>(13)
        actual.left = new TreeNode<>(2)
        actual.left.left = new TreeNode<>(1)
        actual.left.right = new TreeNode<>(5)
        actual.left.right.left = new TreeNode<>(3)

        //       8
        //     /   \
        //    2     21
        //  /  \    /
        // 1   5  13
        def expected = new TreeNode<>(8)
        expected.right = new TreeNode<>(21)
        expected.right.left = new TreeNode<>(13)
        expected.left = new TreeNode<>(2)
        expected.left.left = new TreeNode<>(1)
        expected.left.right = new TreeNode<>(5)

        when:
        actual = BstDelete.deleteNode(actual, 3);

        then:
        actual == expected
    }

    def 'delete middle node'() {
        given:
        //       8
        //     /   \
        //    2     21
        //  /  \    /
        // 1   5  13
        def actual = new TreeNode<>(8)
        actual.right = new TreeNode<>(21)
        actual.right.left = new TreeNode<>(13)
        actual.left = new TreeNode<>(2)
        actual.left.left = new TreeNode<>(1)
        actual.left.right = new TreeNode<>(5)

        //       8
        //     /   \
        //    5     21
        //  /       /
        // 1      13
        def expected = new TreeNode<>(8)
        expected.right = new TreeNode<>(21)
        expected.right.left = new TreeNode<>(13)
        expected.left = new TreeNode<>(5)
        expected.left.left = new TreeNode<>(1)

        when:
        actual = BstDelete.deleteNode(actual, 2);

        then:
        actual == expected
    }
}
