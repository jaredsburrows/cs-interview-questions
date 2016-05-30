package questions.tree

import api.TreeNode
import spock.lang.Specification

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
class BstContainsSpec extends Specification {

    def tree = new TreeNode<>(8)

//                (8)
//               /   \
//            (2)     (21)
//           /   \     /
//         (1)   (5) (13)
//               /
//             (3)
    def "setup"() {
        tree.right = new TreeNode<>(21)
        tree.right.left = new TreeNode<>(13)

        tree.left = new TreeNode<>(2)
        tree.left.left = new TreeNode<>(1)
        tree.left.right = new TreeNode<>(5)
        tree.left.right.left = new TreeNode<>(3)
    }

    def "contains"() {
        expect:
        !BstContains.contains(null, 5)
        !BstContains.contains(tree, 20)

        BstContains.contains(tree, 1)
        BstContains.contains(tree, 2)
        BstContains.contains(tree, 3)
        BstContains.contains(tree, 5)

        BstContains.contains(tree, 8)

        BstContains.contains(tree, 13)
        BstContains.contains(tree, 21)
    }
}
