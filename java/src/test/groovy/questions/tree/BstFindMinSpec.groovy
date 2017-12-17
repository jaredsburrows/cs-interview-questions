package questions.tree

import api.TreeNode
import test.BaseSpec

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
final class BstFindMinSpec extends BaseSpec {

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

    def "test findMinValue"() {
        expect:
        BstFindMin.findMinValue(tree) == 1
    }
}
