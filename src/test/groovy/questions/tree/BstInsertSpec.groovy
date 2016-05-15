package questions.tree

import api.TreeNode
import spock.lang.Specification

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
class BstInsertSpec extends Specification {

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

    def "constructor"() {
        expect:
        new BstInsert() != null
    }

    def "insertBST"() {
        given:
        // Root
        def temp = new TreeNode<>(8)

        // Level 1
        BstInsert.insertBST(temp, 2)
        BstInsert.insertBST(temp, 21)

        // Level 2
        BstInsert.insertBST(temp, 1)
        BstInsert.insertBST(temp, 5)
        BstInsert.insertBST(temp, 13)

        // Level 3
        BstInsert.insertBST(temp, 3)

        expect:
        temp == tree
    }
}
