package questions.tree

import api.TreeNode
import spock.lang.Ignore
import spock.lang.Specification

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
class BstDeleteSpec extends Specification {

//                (8)
//               /   \
//            (2)     (21)
//           /   \     /
//         (1)   (5) (13)
//               /
//             (3)
    @Ignore
    def "test delete"() {
        given:
        def actual = new TreeNode<>(8)
        actual.right = new TreeNode<>(21)
        actual.right.left = new TreeNode<>(13)

        actual.left = new TreeNode<>(2)
        actual.left.left = new TreeNode<>(1)
        actual.left.right = new TreeNode<>(5)
        actual.left.right.left = new TreeNode<>(3)


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
}
