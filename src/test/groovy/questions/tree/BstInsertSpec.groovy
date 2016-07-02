package questions.tree

import api.TreeNode
import test.BaseSpec

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
class BstInsertSpec extends BaseSpec {

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

    def "test insertBST"() {
        given:
        // Root
        def temp = new TreeNode<>(8)

        // Level 1
        BstInsert.insertBst(temp, 2)
        BstInsert.insertBst(temp, 21)

        // Level 2
        BstInsert.insertBst(temp, 1)
        BstInsert.insertBst(temp, 5)
        BstInsert.insertBst(temp, 13)

        // Level 3
        BstInsert.insertBst(temp, 3)

        expect:
        temp == tree
    }
}
