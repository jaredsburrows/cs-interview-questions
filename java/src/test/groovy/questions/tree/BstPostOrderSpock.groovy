package questions.tree

import api.TreeNode
import test.BaseSpec

final class BstPostOrderSpock extends BaseSpec {
    def outContent = new ByteArrayOutputStream()
    def errContent = new ByteArrayOutputStream()
    def tree = new TreeNode<>(8)

    //                (8)
    //               /   \
    //            (2)     (21)
    //           /   \     /
    //         (1)   (5) (13)
    //               /
    //             (3)
    def "setup"() {
        System.setOut(new PrintStream(outContent))
        System.setErr(new PrintStream(errContent))

        tree.right = new TreeNode<>(21)
        tree.right.left = new TreeNode<>(13)

        tree.left = new TreeNode<>(2)
        tree.left.left = new TreeNode<>(1)
        tree.left.right = new TreeNode<>(5)
        tree.left.right.left = new TreeNode<>(3)
    }

    def "cleanup"() {
        System.setOut(null)
        System.setErr(null)
    }

    def "printPostOrder"() {
        when:
        BstPostOrder.printPostOrder(tree)

        then:
        outContent.toString().trim() == "1 3 5 2 13 21 8"
    }
}
