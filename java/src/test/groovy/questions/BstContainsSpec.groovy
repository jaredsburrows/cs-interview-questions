package questions

import api.TreeNode
import questions.BstContains
import spock.lang.Shared
import spock.lang.Specification
import spock.lang.Unroll

final class BstContainsSpec extends Specification {
    //       8
    //     /   \
    //    2     21
    //  /  \    /
    // 1   5  13
    //       /
    //      3
    @Shared private def notBalancedBstTree = new TreeNode<>(8)

    def 'setup'() {
        notBalancedBstTree.right = new TreeNode<>(21)
        notBalancedBstTree.right.left = new TreeNode<>(13)
        notBalancedBstTree.left = new TreeNode<>(2)
        notBalancedBstTree.left.left = new TreeNode<>(1)
        notBalancedBstTree.left.right = new TreeNode<>(5)
        notBalancedBstTree.left.right.left = new TreeNode<>(3)
    }

    @Unroll def 'contains(#a, #b) == #c'() {
        expect:
        BstContains.contains(a, b) == c

        where:
        a                  | b   || c
        null               | 5   || false
        // not in tree
        notBalancedBstTree | -10 || false
        notBalancedBstTree | 100 || false
        // < root
        notBalancedBstTree | 1   || true
        notBalancedBstTree | 2   || true
        notBalancedBstTree | 3   || true
        notBalancedBstTree | 5   || true
        // == root
        notBalancedBstTree | 8   || true
        // > root
        notBalancedBstTree | 13  || true
        notBalancedBstTree | 21  || true
    }
}
