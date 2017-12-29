package questions.tree

import api.TreeNode
import test.BaseSpec

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
final class BstInsertSpec extends BaseSpec {
    def "insertBST"() {
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
        temp == notBalancedBstTree
    }
}
