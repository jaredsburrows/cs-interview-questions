package crackingthecode.part1datastructures

import api.GraphNode
import api.TreeNode
import spock.lang.Specification

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
class Chapter4TreesAndGraphsSpec extends Specification {

    TreeNode<Integer> tree = new TreeNode(26)
    TreeNode<Integer> subTree = new TreeNode(10)
    TreeNode<Integer> balancedTree = new TreeNode(0)
    TreeNode<Integer> balancedTree2 = new TreeNode(0)
    TreeNode<Integer> unbalancedTree = new TreeNode(5)

    def "setup"() {
        balancedTree.right = new TreeNode(10)
        balancedTree.right.left = new TreeNode(10)
        balancedTree.right.right = new TreeNode(10)
        balancedTree.left = new TreeNode(1)
        balancedTree.left.left = new TreeNode(12)
        balancedTree.left.right = new TreeNode(2)

        balancedTree2.right = new TreeNode(10)
        balancedTree2.right.left = new TreeNode(10)
        balancedTree2.left = new TreeNode(1)
        balancedTree2.left.right = new TreeNode(2)

        unbalancedTree.right = new TreeNode(10)
        unbalancedTree.left = new TreeNode(1)
        unbalancedTree.left.left = new TreeNode(12)
        unbalancedTree.left.left.left = new TreeNode(12)

        subTree.right = new TreeNode(6)
        subTree.left = new TreeNode(4)
        subTree.left.right = new TreeNode(30)

        tree.right = new TreeNode(3)
        tree.right.right = new TreeNode(3)
        tree.left = new TreeNode(10)
        tree.left.left = new TreeNode(4)
        tree.left.left.right = new TreeNode(30)
        tree.left.right = new TreeNode(6)
    }

    def "constructor"() {
        expect:
        new Chapter4TreesAndGraphs() != null
    }

    def "isBalanced"() {
        expect:
        Chapter4TreesAndGraphs.isBalanced(null)
        !Chapter4TreesAndGraphs.isBalanced(unbalancedTree)
        Chapter4TreesAndGraphs.isBalanced(balancedTree)
        Chapter4TreesAndGraphs.isBalanced(balancedTree2)
    }

    def "hasGraphNodeBFS"() {
        given:
        GraphNode<Integer> n1 = new GraphNode<>(1)
        GraphNode<Integer> n2 = new GraphNode<>(2)
        GraphNode<Integer> n3 = new GraphNode<>(3)
        GraphNode<Integer> n4 = new GraphNode<>(4)
        GraphNode<Integer> n5 = new GraphNode<>(5)

        n1.neighbors = [n2, n3, n5]
        n2.neighbors = [n1, n4]
        n3.neighbors = [n1, n4, n5]
        n4.neighbors = [n2, n3, n5]
        n5.neighbors = [n1, n3, n4]

        expect:
        Chapter4TreesAndGraphs.hasGraphNodeBFS(n1, n5)
        !Chapter4TreesAndGraphs.hasGraphNodeBFS(n1, new GraphNode<Integer>(9))
    }

    def "getBinaryTree"() {
        given:
        int[] sortedArray = [1, 2, 3, 4, 5, 6, 7]
        int[] empty = []

        TreeNode<Integer> treeNode = new TreeNode<>(4)
        treeNode.left = new TreeNode<Integer>(2)
        treeNode.left.left = new TreeNode<Integer>(1)
        treeNode.left.right = new TreeNode<Integer>(3)
        treeNode.right = new TreeNode<Integer>(5)
        treeNode.right.left = new TreeNode<Integer>(6)
        treeNode.right.right = new TreeNode<Integer>(7)

        // 1 2 3 4 5 6 7
        //      4
        //     / \
        //    2   6
        //   /\   /\
        //  1  3  5 7
        expect:
        Chapter4TreesAndGraphs.getMinimumTree(null, 0, sortedArray.size() - 1) == null
        Chapter4TreesAndGraphs.getMinimumTree(empty, 0, sortedArray.size() - 1) == null
        Chapter4TreesAndGraphs.getMinimumTree(sortedArray, sortedArray.size(), 0) == null
        Chapter4TreesAndGraphs.getMinimumTree(sortedArray, -1, sortedArray.size()) == null
        Chapter4TreesAndGraphs.getMinimumTree(sortedArray, 0, -1) == null
        TreeNode<Integer> tree = Chapter4TreesAndGraphs.
                getMinimumTree(sortedArray, 0, sortedArray.size() - 1)
        tree.value == 4
        tree.left.value == 2
        tree.left.left.value == 1
        tree.left.right.value == 3
        tree.right.value == 6
        tree.right.left.value == 5
        tree.right.right.value == 7
    }

    def "getLinkedListDepth"() {
        given:
        TreeNode<Integer> treeNode4 = new TreeNode<>(4)
        TreeNode<Integer> treeNode2 = new TreeNode<>(2)
        TreeNode<Integer> treeNode1 = new TreeNode<>(1)
        TreeNode<Integer> treeNode3 = new TreeNode<>(3)
        TreeNode<Integer> treeNode5 = new TreeNode<>(5)
        TreeNode<Integer> treeNode6 = new TreeNode<>(6)
        TreeNode<Integer> treeNode7 = new TreeNode<>(7)

        treeNode4.left = treeNode2
        treeNode4.left.left = treeNode1
        treeNode4.left.right = treeNode3
        treeNode4.right = treeNode5
        treeNode4.right.left = treeNode6
        treeNode4.right.right = treeNode7

        expect:
        Chapter4TreesAndGraphs.getLinkedListLevels(null) == null
        Chapter4TreesAndGraphs.getLinkedListLevels(treeNode4) ==
                [[treeNode4], [treeNode2, treeNode5], [treeNode1, treeNode3, treeNode6, treeNode7]]

    }

    def "commonAncestor"() {
        given:
        TreeNode<Integer> treeNode4 = new TreeNode<>(4)
        TreeNode<Integer> treeNode2 = new TreeNode<>(2)
        TreeNode<Integer> treeNode1 = new TreeNode<>(1)
        TreeNode<Integer> treeNode3 = new TreeNode<>(3)
        TreeNode<Integer> treeNode5 = new TreeNode<>(5)
        TreeNode<Integer> treeNode6 = new TreeNode<>(6)
        TreeNode<Integer> treeNode7 = new TreeNode<>(7)

        treeNode4.left = treeNode2
        treeNode4.left.left = treeNode1
        treeNode4.left.right = treeNode3
        treeNode4.right = treeNode5
        treeNode4.right.left = treeNode6
        treeNode4.right.right = treeNode7

        expect:
        Chapter4TreesAndGraphs.commonAncestor(null, treeNode2, treeNode5) == null
        Chapter4TreesAndGraphs.commonAncestor(null, null, treeNode5) == null
        Chapter4TreesAndGraphs.commonAncestor(null, null, null) == null
        Chapter4TreesAndGraphs.commonAncestor(treeNode4, treeNode2, treeNode5) == treeNode4
    }

    def "isSubtree"() {
        expect:
        Chapter4TreesAndGraphs.isSubtree(null, null)
        !Chapter4TreesAndGraphs.isSubtree(null, balancedTree)
        Chapter4TreesAndGraphs.isSubtree(unbalancedTree, null)
        !Chapter4TreesAndGraphs.isSubtree(unbalancedTree, balancedTree)
        Chapter4TreesAndGraphs.isSubtree(tree, tree)
        Chapter4TreesAndGraphs.isSubtree(tree, subTree)
    }
}
